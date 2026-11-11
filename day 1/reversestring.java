import java.util.*;

class Main {
    public static void main(String[] args) {
        String s = "my name is asha";
        String words[] = s.split(" ");
        for (String word : words) {
            Stack<Character> st = new Stack<>();
            for (char ch : word.toCharArray()) {
                st.push(ch);
            }
            while (!st.isEmpty()) {
                System.out.print(st.pop());
            }
            System.out.print(" ");
        }
    }
}