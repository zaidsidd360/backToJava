package DataStructures.Stack;

import java.util.Stack;

public class Stacko {
    public static void main(String[] args) {
        Stack<String> friends = new Stack<>();
        System.out.println(friends.empty());
        for (int i = 0; i < 5; i++) {
            friends.push("f" + i);
        }
        System.out.println(friends);
    }
}
