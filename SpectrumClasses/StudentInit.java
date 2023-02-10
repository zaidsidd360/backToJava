package SpectrumClasses;

// Initialize a student class with the following properties:
// int age; char gender;
// and the following methods:
// getAge()  returns age; setAge(int val) sets the age to val;
// getGender() returns gender; setGender(int val) sets the gender to val;
// Also create a constructor to initialize the properties.

class Student {
    private int age;
    private char gender;

    public int getAge() {
        return this.age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    Student(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }
}

public class StudentInit {
    public static void main(String[] args) {
        Student asad = new Student(22, 'F');
        System.out.println(asad.getAge());
        asad.setAge(32);
        asad.setGender('M');
        System.out.println(asad.getAge() + " " + asad.getGender());
    }
}
