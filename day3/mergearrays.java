class mergearrays {
    public static void main(String[] args) {

        int a[] = {1, 3, 4, 6, 9};
        int b[] = {2, 5, 7, 12};

        int Final[] = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int c = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                Final[c++] = a[i];
                i++;
            }
            else {
                Final[c++] = b[j];
                j++;
            }
        }

        while (i < a.length) {
            Final[c++] = a[i];
            i++;
        }

        while (j < b.length) {
            Final[c++] = b[j];
            j++;
        }

        System.out.println("Merged Array:");

        for (int k = 0; k < Final.length; k++) {
            System.out.print(Final[k] + " ");
        }
    }
}