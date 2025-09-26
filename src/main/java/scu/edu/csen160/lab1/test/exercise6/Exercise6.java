package scu.edu.csen160.lab1.test.exercise6;

public class Exercise6 {
	private String firstName, middleName, lastName, text;
    public static String fullName(String firstName, String middleName, String lastName){
		// Create a string for full name as lastName, firstName,first letter of
		// middle name followed by a . (dot). The first initials of first and last
		// names and the middle initial should be in upper case and the rest in lower
		// case.
		// For example, Robert (first), alan (middle) and Smith (last) should be
		// written as Smith, Robert A.
		// Return the full name.
        String newLastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        String newFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String middleInitial = middleName.substring(0,1).toUpperCase();


        return newLastName + ", " + newFirstName + " " + middleInitial + ".";
	}

	public static boolean palindrome(String text){
		// check if text is a palindrome and return a true if it is and
		// false otherwise.
        String newText = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); //Claude
        String reverse = new StringBuilder(newText).reverse().toString();

        return newText.equals(reverse);
	}
}