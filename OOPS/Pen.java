class PenMaker {
    String color;
    String type;

    public void write() {
        String str = "Hi mom";
        System.out.println(str);
    }

    public void printTypeAndColor() {
        System.out.println("I'm a " + this.type + " pen of " + this.color + " color.");
    }

    public static void main(String[] args) {
        PenMaker linc = new PenMaker();
        linc.color = "blue";
        linc.type = "ballpoint";

        linc.write();
        linc.printTypeAndColor();
    }

}