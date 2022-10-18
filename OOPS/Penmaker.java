class Penmaker {
    public static void main(String[] args) {
        Pen linc = new Pen();
        linc.color = "blue";
        linc.type = "ballpoint";
        linc.write();
        linc.printTypeAndColor();
    }
}

class Pen {
    String color;
    String type;

    public void write() {
        String str = "Hi mom";
        System.out.println(str);
    }

    public void printTypeAndColor() {
        System.out.println("I'm a " + this.type + " pen of " + this.color + " color.");
    }
}
