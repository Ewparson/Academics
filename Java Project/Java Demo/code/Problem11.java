package classproject3;

public class Problem1 {

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        int[] array = problem1.generateArray(500);

        // Print the original array
        System.out.println("Original Array:");
        for (int value : array) {
            System.out.println(value);
        }

        System.out.println("-----------\n------------");

        // Sorting the array in descending order
        int[] sortedArrayDesc = Problem1.sortDescending(array);

        // Print the sorted array in descending order
        System.out.println("Sorted Array in Descending Order:");
        for (int value : sortedArrayDesc) {
            System.out.println(value);
        }
    }

    // Other methods (generateArray, sortAssending, sumOfArray, averageOfArray, smallestOfArray) ...

    public int[] sortDescending(int[] unsortArray) {
        for (int j = 0; j < unsortArray.length - 1; j++) {
            for (int i = 0; i < unsortArray.length - 1; i++) {
                if (unsortArray[i] < unsortArray[i + 1]) {
                    int temp = unsortArray[i];
                    unsortArray[i] = unsortArray[i + 1];
                    unsortArray[i + 1] = temp;
                }
            }
        }
        return unsortArray;
    }
}

