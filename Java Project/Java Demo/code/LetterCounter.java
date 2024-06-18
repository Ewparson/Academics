package swaparray;

public class LetterCounter {
    
    public static void main(String[] args) {
        String str = "example string"; // Replace with the string you want to check
        char letter = 'e'; // Replace with the letter you want to count
        int count = countOccurrences(str, letter, 0, 0);
        System.out.println("The letter '" + letter + "' appears " + count + " times in the string.");
    }

    public static int countOccurrences(String str, char letter, int index, int count) {
        // Base case: if index is equal to string length, return count
        if (index == str.length()) {
            return count;
        }

        // If the current character matches the letter, increment count
        if (str.charAt(index) == letter) {
            count++;
        }

        // Recursive call with incremented index
        return countOccurrences(str, letter, index + 1, count);
    }
}
