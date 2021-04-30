import java.util.ArrayList;
import java.util.List;

public class KMP {
    public static int[] calculatePrefixLength(String pattern) {
        int patternLength = pattern.length();
        int[] prefixArr = new int[patternLength + 1];
        prefixArr[0] = -1;
        prefixArr[1] = 0;

        int prefixLength = 0;
        int i = 1;

        while (i < patternLength) {
            if (pattern.charAt(prefixLength) == pattern.charAt(i)) {
                prefixLength++;
                i++;
                prefixArr[i] = prefixLength;

            } else if (prefixLength > 0) {
                prefixLength = prefixArr[prefixLength]; // note that we do not increment i here

            } else {
                i++;
                prefixArr[i] = 0; // 'prefixLength' reached 0, so save that into prefixArr[] and move forward
            }
        }
        return prefixArr;
    }

    public static List<Integer> searchForPattern(String text, String pattern) {
        int t = 0; // the position of the current character in text
        int p = 0; // the position of the current character in pattern

        int textLength = text.length();
        int patternLength = pattern.length();

        List<Integer> matches = new ArrayList<>();
        int[] prefixLength = calculatePrefixLength(pattern);

        while (t < textLength) {
            if (pattern.charAt(p) == text.charAt(t)) {
                p++;
                t++;

                if (p == patternLength) {
                    matches.add(t-p);
                    p = prefixLength[p]; // reset
                }
            } else {
                p = prefixLength[p];
                if (p < 0) {
                    t++;
                    p++;
                }
            }
        }
        return matches;
    }
}


