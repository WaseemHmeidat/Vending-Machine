import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		for (int j = 0; j < 5; j++) {
			String name = SnackNames.values()[j].getName();
			
			// in order to get 3 digits random number 
			double price = ((int) (Math.random() * 1000)) / 10.0; 
			Stack<Snacks> temp= new Stack<>();

			for (int i = 0; i < 5; i++) {

				temp.push(new Snacks(i, price, name) );
			}
            
			SnackMachine.snacks.add(temp);
		}

		SnackMachine.welcomeMethod();
	}

}
