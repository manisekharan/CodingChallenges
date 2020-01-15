package crackingCodingInterview.arrays;

import org.junit.*;

import static org.junit.Assert.*;

public class ReverseArrayTest {

    static ReverseArray reverseArray;
    @BeforeClass
    public static void setInstance() {
        reverseArray = new ReverseArray();
    }

    @Test
    public void testReverseWithEvenLengthOfArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        reverseArray.reverse(numbers);
        assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, numbers);
    }

    @Test
    public void testReverseWithOddLengthOfArray() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        reverseArray.reverse(numbers);
        assertArrayEquals(new int[]{7, 6, 5, 4, 3, 2, 1}, numbers);
    }

    @Test
    public void testReverseWithEmptyArray() {
        int[] numbers = {};
        reverseArray.reverse(numbers);
        assertArrayEquals(new int[]{}, numbers);
    }

    @Test
    public void testReverseWithNullArray() {
        int[] numbers = null;
        reverseArray.reverse(numbers);
        assertArrayEquals(null, numbers);
    }

    @Test
    public void testReverseWithJustOneElementArray() {
        int[] numbers = {1};
        reverseArray.reverse(numbers);
        assertArrayEquals(new int[]{1}, numbers);
    }

}
