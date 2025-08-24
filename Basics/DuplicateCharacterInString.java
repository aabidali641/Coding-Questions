import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterInString {
    public static void findDuplicates(String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("String must not be null or empty");
        }

        Map<Character, Integer> freqMap = new HashMap<>();
        str = str.toLowerCase(); // optional: case-insensitive

        // Count frequency
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) { // ignore spaces & symbols
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Print duplicates
        System.out.println("Duplicate characters:");
        boolean found = false;
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No duplicates found!");
        }
    }

    public static void main(String[] args) {
        String input = "Programming in Java";
        findDuplicates(input);
    }
}
