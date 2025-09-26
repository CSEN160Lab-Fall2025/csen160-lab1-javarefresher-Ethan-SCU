package scu.edu.csen160.lab1.test.exercise1;

public class AMain {
    public static void main(String[] args) {
        // Edit the code, so that the age (in years) of the puppy is printed from main.
        // Edit the code, so that the age (in days) is printed from main.
        Puppy myPuppy = new Puppy("Fido",2);

        System.out.printf("\n" + myPuppy.getName() + " is " + myPuppy.getAge() + " years old.");
        System.out.printf("\n" + myPuppy.getName() + " is " + myPuppy.getAgeDays() + " days old.");
        System.out.printf("\nHello and welcome!");
    }
}