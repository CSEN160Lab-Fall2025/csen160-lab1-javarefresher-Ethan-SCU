package scu.edu.csen160.lab1.test.exercise1;

public class Puppy {
    private String name;
    private int age;
    public Puppy(){
        this.name = "N/A";
        this.age = 0;
    }

    public Puppy(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getAgeDays() {

        return age * 365;
    }
}
