class CountOddEven {
    void Count() {
        int[] numbers = {5, 7, 2, 4, 9, 12};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Count of even numbers in the array is: " + even);
        System.out.println("Count of odd numbers in the array is: " + odd);
    }

    public static void main(String[] args) {
        CountOddEven No = new CountOddEven();
        No.Count();
    }
}
