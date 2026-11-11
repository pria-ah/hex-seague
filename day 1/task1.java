import java.util.*;

class Main {
    public static void main(String[] args) {
        int capacity = 4;
        Stack<String> enrolled = new Stack<>();
        String names[] = {"Anu", "Ravi", "Meena", "John", "Sara"};
        for (int i = 0; i < names.length; i++) {
            if (enrolled.size() < capacity) {
                enrolled.push(names[i]);
                System.out.println(names[i] + " enrolled");
            } else {
                System.out.println(names[i] + " batch full");
            }
        }
        enrolled.remove("Ravi");
        System.out.println(enrolled);
        System.out.println("Top: " + enrolled.peek());
    }
}