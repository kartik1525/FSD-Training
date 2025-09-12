public class ArrayBasics {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[5];
        int[] arr2 = new int[5];
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Fourth element: " + numbers[3]);
        System.out.println("Fifth element: " + numbers[4]);

        System.out.println("Array length: " + numbers.length);

        System.out.println("Iterating through the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        System.out.println("Using enhanced for loop:");
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }
    }
}
