import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KMPTest {
    @Test
    void firstElementInPrefixArrayNeg() {
        KMP k = new KMP();
        int actual = -1;
        String pattern = "abcdababcd";
        assertEquals(k.calculatePrefixLength(pattern)[0], actual);
    }

    @Test
    void getPrefixArray() {
        KMP d = new KMP();
        int[] pArr = {-1, 0, 0, 0, 0, 0, 0, 1, 2, 3, 0};
        String pattern = "abcxxxabcy";
        assertArrayEquals(d.calculatePrefixLength(pattern), pArr);
    }

    @Test
    void getPrefixArrayWithDashes() {
        KMP c = new KMP();
        int[] pArr = {-1, 0, 1, 2, 0, 0, 0, 0, 1, 2, 3, 4, 5, 0, 0, 0, 0};
        String pattern = "---abcd---ababcd";
        assertArrayEquals(c.calculatePrefixLength(pattern), pArr);
    }

    @Test
    void getsearchForPattern1() {
        KMP h = new KMP();
        String pattern = "abcxxxabcy";
        String text = "---abcxxxab-----------";
        List<Integer> result = h.searchForPattern(text, pattern);
        List<Integer> actual = new ArrayList<>();

        assertEquals(result, actual);
    }

    @Test
    void getsearchForPattern2() {
        KMP h = new KMP();
        String pattern = "abcxxxabcy";
        String text = "---abcxxxab------abcxxxabcy---";
        List<Integer> result = h.searchForPattern(text, pattern);
        List<Integer> actual = new ArrayList<>();
        actual.add(17); // match was found at index 17

        assertEquals(result, actual);
    }

    @Test
    void getsearchForPattern3() {
        KMP h = new KMP();
        String pattern = "abcd";
        String text = "---abcd---ababcd";
        List<Integer> result = h.searchForPattern(text, pattern);
        List<Integer> actual = new ArrayList<>();
        actual.add(3); // match was found at index 3
        actual.add(12); // match was found at index 12

        assertEquals(result, actual);
    }
}