class reversetwohalves {

    public static void main(String[] args) {

        int[] a = { 3, 4, 5, 1, 9, 7, 6, 8};

        int j = a.length / 2;
        int temp;

        for(int i = 0; i < a.length / 2; i++, j++) {

            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}