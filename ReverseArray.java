class ReverseArray {
    void Reverse() {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array in reverse: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static void main(String[] args) {
        ReverseArray rev = new ReverseArray();
        rev.Reverse();
    }
}
