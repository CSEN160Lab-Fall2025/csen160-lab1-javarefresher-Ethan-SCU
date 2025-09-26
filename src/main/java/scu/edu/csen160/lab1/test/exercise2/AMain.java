package scu.edu.csen160.lab1.test.exercise2;

public class AMain {
    public static void main(String[] args) {
        double height = 3.0; // inches
        Cube newCube = new Cube(height);
        System.out.println("Volume = " + newCube.getVolume());
    }
}