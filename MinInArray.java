class Min {
    void minimum() {
        int[] numbers = {45, 22, 89, 67, 34};
        
        int min = Integer.MAX_VALUE;  // Starting with a large value, will update as we find smaller ones

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("The minimum number in the array is: " + min);
    }

    public static void main(String[] args) {
        Min obj = new Min();
        obj.minimum();
    }
}
