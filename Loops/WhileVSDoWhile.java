package Loops;

public class WhileVSDoWhile {
    public static void main(String args[]) {

        int i = 12;
        while (i < 11) {
            System.out.println("Balerion the black dread"); // Not printed since while loop checks condition first and
                                                            // then executes the task.
        }

        int j = 12;
        do {
            System.out.println("Aegon the Conqueror"); // Printed since do while loop executes the task at least once
                                                       // before checking condition.
        } while (j < 11);
    }
}

// OUTPUT
// Aegon the Conqueror
