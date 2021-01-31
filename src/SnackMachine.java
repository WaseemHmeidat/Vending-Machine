
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class SnackMachine { //snack machine class
	public static CashSlots arr[] = CashSlots.values();
	public static int choiceValue = 0;
	 //arraylist to store snack types and each type has an stack of its items in order to piled in it
                                                                                             
	public static ArrayList<Stack<Snacks>> snacks = new ArrayList<Stack<Snacks>>();
	public static void welcomeMethod() {   //method to display the menu and read input from customer and validate his input using SWITCH

		SnackNames[] snackNames = SnackNames.values();
		System.out.println(
				"Welcome to the Snack Machine \nPlease enter you choice from below menu:(by entering its number)");
		for (int i = 0; i < snackNames.length; ++i) {
			System.out.println((i + 1) + "." + snackNames[i].getName());
		}
		System.out.println("0.Exit");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();

		if (choice == "0") {
			System.out.println("Bye");
		} else if(SnackMachineUtils.isValidChoice(choice)) {
			choiceValue = Integer.parseInt(choice) - 1;
			if (snacks.get(choiceValue).isEmpty()) {      // if statement used to check if the array list of specific snack contains snackes to be order or not 
				System.out.println("This snack is empty please choose another snack");
				welcomeMethod();
			} else {
				System.out.print("The price = " + snacks.get(choiceValue).peek().getPrice() + "$\n");//get the price of the selected item 
			}
		} else {
			System.out.println("you enterd wrong choice "); //if input is not suitable with cases . then welcomeMethed is called again
			System.out.println("please enter valid choice");
			welcomeMethod();
		}

		DisplayPaymentWay();
		in.close();
	}

	public static void DisplayPaymentWay() { //method to display payment ways and make user decides how to pay 
		System.out.println("Do you want to pay by: \n1.Cash\n2.Credit Card");
		Scanner in = new Scanner(System.in);
		String choice = in.nextLine();

		switch (choice) {
		case "1":
			Validator cashValidator = new CashValidation(); //create obj of cashValidator 
			cashValidator.display();
			break;
		case "2":
			Validator cardValidator = new CardValidation(); //create obj of cardValidator 
			cardValidator.display();
			break;
		default:
			System.out.println("you enterd wrong choice ");
			System.out.println("please enter valid choice\n\n\n");
			DisplayPaymentWay();
		}
		in.close();
	}

}
