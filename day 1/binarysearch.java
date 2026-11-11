import java.util.*;
class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int val = sc.nextInt();
        int b = 0, l = n - 1;
        boolean flag = false;
        while (b <= l) {
            int mid = (b + l) / 2;
            if (arr[mid] == val) {
                flag = true;
                break;
            } 
            else if (val < arr[mid]) {
                l = mid - 1;
            } 
            else {
                b = mid + 1;
            }
        }

        if (flag) {
            System.out.print("found");
        } else {
            System.out.print("not found");
        }
    }
}
