import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int temp[] = new int[n];
        for (int size = 1; size < n; size = size * 2) {
            for (int left = 0; left < n - size; left = left + 2 * size) {
                int mid = left + size - 1;
                int right = Math.min(left + 2 * size - 1, n - 1);
                int i = left;
                int j = mid + 1;
                int k = left;
                while (i <= mid && j <= right) {
                    if (a[i] < a[j]) {
                        temp[k++] = a[i++];
                    } else {
                        temp[k++] = a[j++];
                    }
                }
                while (i <= mid) {
                    temp[k++] = a[i++];
                }
                while (j <= right) {
                    temp[k++] = a[j++];
                }

                for (int x = left; x <= right; x++) {
                    a[x] = temp[x];
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}