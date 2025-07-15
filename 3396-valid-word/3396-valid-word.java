import java.util.*;

class Solution {
    public boolean isValid(String word) {
        if (word.length() < 3)
            return false;

        int v = 0,c = 0;

        Set<Character> vet = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (Character.isDigit(ch))
                continue;

            if (!Character.isLetter(ch))
                return false;

            char lowerCh = Character.toLowerCase(ch);
            if (vet.contains(lowerCh)) {
                v++;
            } else {
               c++;
            }
        }

        return v >= 1 &&c >= 1;
    }
}
