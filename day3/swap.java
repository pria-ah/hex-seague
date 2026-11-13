 class swap {
    
    public static void main(String[] args) {

        int[] a = {6, 5, 3, 4, 1, 2, 7, 8};

        int temp;

        for(int i = 0, j = 1; j < a.length; i += 2, j += 2) {

            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}