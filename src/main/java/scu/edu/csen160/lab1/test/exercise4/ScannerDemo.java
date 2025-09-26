package scu.edu.csen160.lab1.test.exercise4;

import java.util.Scanner;

public class ScannerDemo{
    private int anInteger;
    private float aFloat;
    private double aDoubleNumber;
	public static void main(String[] args) {
		// Declarations
		Scanner in = new Scanner(System.in);
		int anInteger;
		float aFloat;
		double aDoubleNumber;

		// Prompts
		System.out.println("Enter an integer");
		anInteger = in.nextInt();
		
		System.out.println("Enter a float");
		aFloat =  in.nextFloat();

		System.out.println("Enter a double");
		aDoubleNumber = in.nextDouble();
		// Output the user input

		System.out.println("Here is what you entered: ");
		System.out.println(anInteger);
		System.out.println(aFloat);
		System.out.println(aDoubleNumber);
		
		in.close();
	}

    public void setAnInteger(int i) {
        this.anInteger = i;
    }

    public void setaFloat(float v) {
        this.aFloat = v;
    }

    public void setaDoubleNumber(double v) {
        this.aDoubleNumber = v;
    }

    public int getAnInteger() {
        return this.anInteger;
    }

    public float getaFloat() {
        return this.aFloat;
    }

    public double getaDoubleNumber() {
        return this.aDoubleNumber;
    }
}