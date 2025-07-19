class SecondMax {
    void maximum() {
        int[] numbers = {45, 22, 89, 67, 34};

        int firstmax = Integer.MIN_VALUE; //constant value in Java that represents the smallest possible integer
        int secondmax = Integer.MIN_VALUE; //constant value in Java that represents the smallest possible integer

        for (int num : numbers) {
          //When we find a new biggest number → we push the old one into secondmax
          //If a number is not the biggest but still bigger than secondmax, we update it
            if (num > firstmax) {
                secondmax = firstmax;
                firstmax = num;
            } else if (num > secondmax && num != firstmax) {
                secondmax = num;
            }
        }

        System.out.println("The second largest number in the array is: " + secondmax);
    }

    public static void main(String[] args) {
        SecondMax obj = new SecondMax();
        obj.maximum();
    }
}
