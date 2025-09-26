package scu.edu.csen160.lab1.test.exercise6;

public class AMain {
    public static void main (String [] args){
        // Test fullName with the following data
        // robert (first), james (middle), CLARK (last)
        // Test with data of your choice.

        String result1 = Exercise6.fullName("Robert", "James", "Clark");
        String result2 = Exercise6.fullName("Jeffrey", "Something", "Lane");
        // Test palindrome() with the following data
        // A man, a plan, a canal, Panama
        // desserts
        // radar
        // Madam
        boolean result3 = Exercise6.palindrome("A man a plan a canal Panama");
        boolean result7 = Exercise6.palindrome("desserts");
        boolean result8 = Exercise6.palindrome("radar");
        boolean result9 = Exercise6.palindrome("Madam");
        boolean result4 = Exercise6.palindrome("Orangutan");

        System.out.printf("\n" + result1);
        System.out.printf("\n" + result2);
        System.out.printf("\nis [A man a plan a canal Panama] a Palindrome?: " + result3);
        System.out.printf("\nis [Orangutan] a Palindrome?: " + result4);
        System.out.printf("\nis [radar] a Palindrome?: " + result8);
        System.out.printf("\nis [Madam] a Palindrome?: " + result9);

    }
}
