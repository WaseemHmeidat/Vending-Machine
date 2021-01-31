import java.util.Scanner;

public class CardValidation implements Validator {

	public CardSlot card = new CardSlot();

	@Override
	public void validateMoney(String input) {
		// TODO Auto-generated method stub

		System.out.println(SnackMachine.snacks.get(SnackMachine.choiceValue).peek().getPrice()
				+ "$ Will be withdrawn from your account");

		/**
		 * The money will be withdrawn without any access to the total Amount in the
		 * user account --> think of it as a black box :)
		 */
		acceptMoney(0, 0);

	}

	@Override
	public void display() {
		boolean flag = false;
		Scanner input = new Scanner(System.in);
		Integer password;
		System.out.println("Insert your card in the cards slot...\n(wait the machine to Validate it......)");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Enter you 4 digit PIN : ");
		while (!flag) {
			password = input.nextInt();

			if (password.toString().length() == 4) {
				flag = true;
				card.setPassword(password);
				card.setMoneyAmount(SnackMachine.snacks.get(SnackMachine.choiceValue).peek().getPrice());
			} else {
				System.out.println("The enter password is not valid! Try to enter a valid 4 digit PIN :");
			}
		}
		validateMoney("Account_data_are_confidential");
		input.close();

	}

	@Override
	public void acceptMoney(double enteredMoney, double totalPrice) {

		System.out.println("here is you odrer => " + SnackMachine.snacks.get(SnackMachine.choiceValue).peek().getName());
		SnackMachine.snacks.get(SnackMachine.choiceValue).pop();
		System.out.println("the selected snack to the customer has been dispensed...\n\n\n\n");
		
		SnackMachine.welcomeMethod();
	}

}
