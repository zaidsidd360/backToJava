class Pen {
    String color;
    String type;

    public void write(String str) {
        System.out.println(str);
    }

    public void printTypeAndColor() {
        System.out.println("I'm a " + this.type + " pen of " + this.color + " color.");
    }
}

class Student {
    String name;
    int age;

    public void printInfo() {
        System.out.println("My name is " + this.name + " and I am " + this.age + " years old.");
    }
}

public class Penmaker {
    public static void main(String[] args) {
        Pen linc = new Pen();
        linc.color = "blue";
        linc.type = "ballpoint";
        linc.write("Hi mom!");
        linc.printTypeAndColor();

        Student s = new Student();
        s.name = "Jack";
        s.age = 20;
        s.printInfo();
    }
}
