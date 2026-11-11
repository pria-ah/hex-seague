import java.util.*;
class Main {
    public static void main(String[] args) {
        Stack<Integer> sk = new Stack<>();
        int a[] = {3, 4, 5, 6, 7, 8, 9, 4, 5, 6, 7, 8};
        for (int i = 0; i < a.length; i++) {
            sk.push(a[i]);
        }
        while (sk.size() > 0) {
            System.out.print(sk.pop() + " ");
        }
    }
}
