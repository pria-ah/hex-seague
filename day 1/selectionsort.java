import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min, pos, temp;
        for (int i = 0; i < n - 1; i++) {
            min = a[i];
            pos = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < min) {
                    min = a[j];
                    pos = j;
                }
            }
            temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}