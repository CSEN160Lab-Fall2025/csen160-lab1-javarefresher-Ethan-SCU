package scu.edu.csen160.lab1.test.exercise5;

public class AMain {
    public static void main(String[] args) {
            // Insert code to check, by calling the method you have written,
            //  if the following years are leap years or not.
            // 1716,1989, 1992, 2000, 2010, 2012.
            // Test your code with other years of your choice.

            // This is a blub

        boolean result1 = Exercise5.isItALeapYear(1716);
        boolean result2 = Exercise5.isItALeapYear(1989);
        boolean result3 = Exercise5.isItALeapYear(1992);
        boolean result4 = Exercise5.isItALeapYear(2000);
        boolean result5 = Exercise5.isItALeapYear(2010);
        boolean result6 = Exercise5.isItALeapYear(2012);

        System.out.println("1716 is a leap year: " + result1);
        System.out.println("1989 is a leap year: " + result2);
        System.out.println("1992 is a leap year: " + result3);
        System.out.println("2000 is a leap year: " + result4);
        System.out.println("2010 is a leap year: " + result5);
        System.out.println("2012 is a leap year: " + result6);


    }
}
