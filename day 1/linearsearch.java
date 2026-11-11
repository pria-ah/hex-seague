import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int val = 29;
        boolean flag = false;

        System.out.println("Enter the size ");
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] == val) {
                flag = true;
                break;
            }
        }

        if (flag) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }

        sc.close();
    }
}