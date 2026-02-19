class min {

    static int findMin(int[] arr) {
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        int arr[] = {30, 11, 31, 40};

        int result = findMin(arr);
        System.out.println("Minimum value = " + result);
    }
}
