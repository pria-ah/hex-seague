class twopointer {
    public static void main(String[] args) {

        int a[] = {5, 7, 1, 2, 3, 4, 6, 7, 8, 9};
        int i, j, temp;

        // 1. Reverse the array
        for (i = 0, j = a.length - 1; i < j; i++, j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        System.out.println("Reversed Array:");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        // 2. Swap the two halves of an array
        int b[] = {5, 6, 3, 4, 1, 2, 7, 8};

        for (i = 0, j = b.length / 2; i < b.length / 2; i++, j++) {
            temp = b[i];
            b[i] = b[j];
            b[j] = temp;
        }

        System.out.println("\n\nAfter Swapping Halves:");
        for (i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        // 3. Swap adjacent elements
        int c[] = {6, 5, 3, 4, 1, 2, 7, 8, 77};

        for (i = 0, j = 1; j < c.length; i = i + 2, j = j + 2) {
            temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }

        System.out.println("\n\nAfter Pairwise Swapping:");
        for (i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
    }
}