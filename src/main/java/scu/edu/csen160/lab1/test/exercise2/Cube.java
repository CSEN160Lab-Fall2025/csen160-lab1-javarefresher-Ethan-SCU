package scu.edu.csen160.lab1.test.exercise2;

public class Cube {
    private double height;

    public Cube(double height) {
        this.height = height;
    }

    public double getVolume() {
        return height * height * height;
    }
}
