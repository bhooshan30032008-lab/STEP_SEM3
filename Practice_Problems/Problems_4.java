package STEP_SEM3.Practice_Problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problems_4 {

    public static char findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char c : text.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        for (char c : text.toCharArray()) {
            if (freqMap.get(c) == 1) {
                return c;
            }
        }
        return '\0'; // Sentinel indicating not found
    }

    public static void checkString(String text) {
        char result = findFirstNonRepeatingChar(text);
        if (result != '\0') {
            System.out.println("\"" + text + "\" -> First Non-Repeating Character: '" + result + "'");
        } else {
            System.out.println("\"" + text + "\" -> No Non-Repeating Character Found");
        }
    }

    public static void main(String[] args) {
        checkString("swiss");
        checkString("aabbcc");
    }
}