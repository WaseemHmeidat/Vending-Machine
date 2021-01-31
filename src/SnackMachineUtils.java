
public class SnackMachineUtils {

	public static boolean isValidChoice(String choice) {
		try{
		    Integer choinceInt = Integer.valueOf(choice);
		    return choinceInt > 0 && choinceInt <= SnackNames.values().length;
		} catch(NumberFormatException e) { // input is not int
		    return false;
		}
	}

}
