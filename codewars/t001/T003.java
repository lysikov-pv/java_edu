package codewars.t001;

import java.util.Arrays;

/**
 Complete the solution so that it reverses the string passed into it.

 'world'  =>  'dlrow'
 'word'   =>  'drow'
 */
public class T003 {

    public static String solution(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static String mySolution(String str) {
        StringBuilder result = new StringBuilder(str.length());
        for (int i = str.length()-1; i >= 0; i--) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }


    public static void sampleTests() {
        assertEquals("dlrow", T003.solution("world"));
        assertEquals("olleh", T003.solution("hello"));
        assertEquals("", T003.solution(""));
        assertEquals("h", T003.solution("h"));
        assertEquals("selur srawedoC", T003.solution("Codewars rules"));
    }

    private static void assertEquals(String s1, String s2) {
        System.out.println(s1.equals(s2));
    }

    public static void main(String[] args) {
        sampleTests();
    }
}
