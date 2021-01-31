import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CashValidation implements Validator {
	public static ArrayList<Double> enteredMoney = new ArrayList<Double>();
	private static DecimalFormat df = new DecimalFormat("###.##");


	@Override
	public void validateMoney(String input) {//money validation 
		int flag = 0;
		for (int i = 0; i < SnackMachine.arr.length; i++) { ///compare input with cash slots in the enum class
			if ((SnackMachine.arr[i].getName()).equalsIgnoreCase(input)) {
				enteredMoney.add(SnackMachine.arr[i].getValue()); //array list for adding all entered money fom the user
				flag += 1;
			}
		}
		if (flag == 0) { //if the flage does not change . it means wrong input
			System.out.println("wrong input");
			display();
		}

		double totalEnteredMoney = 0;  //calculate total entered money and compare it with the price  

		System.out.print("Accumulated Amount of Money: ");
		for (int i = 0; i < enteredMoney.size(); i++) {
			totalEnteredMoney += enteredMoney.get(i);
		}
		System.out.println(" = " + df.format(totalEnteredMoney) + "$ ,and the price = "
				+ SnackMachine.snacks.get(SnackMachine.choiceValue).peek().getPrice() + "$");
		if (totalEnteredMoney < (SnackMachine.snacks.get(SnackMachine.choiceValue).peek().getPrice())) {

			display();
		} else {
			acceptMoney(totalEnteredMoney, SnackMachine.snacks.get(SnackMachine.choiceValue).peek().getPrice());
		}

	}

	@Override
	public void display() { //display the cash slots and read input from user
		System.out.print("this machine accpets only USD currency \nplease enter one of these slots \n(");
		for (int i = 0; i < SnackMachine.arr.length; i++) {
			System.out.print(SnackMachine.arr[i].getName() + " , ");
		}
		System.out.print(")\n");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();
		validateMoney(choice);
		in.close();
	}
 
	@Override //accept money and pop the element 
	public void acceptMoney(double totalEnteredMoney, double totalPrice) {
		// TODO Auto-generated method stub
		System.out.println("the selected snack to the customer has been dispensed\n\n\n\n");
		SnackMachine.snacks.get(SnackMachine.choiceValue).pop();
		if (totalEnteredMoney - totalPrice > 0) {
			returnChange(Double.parseDouble(df.format(totalEnteredMoney - totalPrice)));
		}else {
			SnackMachine.welcomeMethod();
		}
	}

	
	public void returnChange(double chagneAmount) {//calculate change 
		int size = CashSlots.values().length;
		double[] cashSlots = new double[size];
		double change = chagneAmount;
		int counter = 0;

		System.out.println("The Total amout of change = " + change + " and it will be return as following:");
		for (int i = size -1 ; i >= 0; i--) {
			cashSlots[i] = SnackMachine.arr[i].getValue();
			while(change - cashSlots[i] >= 0) {
				change = Double.parseDouble(df.format(change - cashSlots[i]));
				counter++;
			}

			if (counter > 0) {
				System.out.println("Amount = " + df.format(cashSlots[i]) + "  Count = " + counter);
			}

			counter = 0;
		}

		System.out.println("The change has been successfully sent");
	    enteredMoney.clear();  //clear the entered money 
		SnackMachine.welcomeMethod();

	}
}
