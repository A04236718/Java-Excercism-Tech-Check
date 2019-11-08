class ArmstrongNumbers {
	private int numberToCheck;

	boolean isArmstrongNumber(int numberToCheck) {
		// Get the String version of the number
		String stringVersionOfNumber = String.valueOf(numberToCheck);
		double sum = 0;
		boolean check;
		for (int i = 0; i<stringVersionOfNumber.length(); i++){
			sum = sum + Math.pow(Character.getNumericValue(stringVersionOfNumber.charAt(i)), stringVersionOfNumber.length());

		}

		if (sum == numberToCheck){
			check = true;
		}else{
			check = false;
		}
//		char [] cArray = stringVersionOfNumber.toCharArray();
//		int number = Integer.parseInt(new String (cArray));
		return check;
	}
}