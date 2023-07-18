package codewars.fundamentals;

/**
 Complete the solution so that it reverses the string passed into it.

 'world'  =>  'dlrow'
 'word'   =>  'drow'
 */
public class T005 {

    public static String abbrevName(String name) {
        return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    }
    public static String myAbbrevName(String name) {
        String[] names = name.split(" ");
        return names[0].toUpperCase().charAt(0) + "." + names[1].toUpperCase().charAt(0);
    }


    public static void testFixed() {
        assertEquals("S.H", T005.abbrevName("Sam Harris"));
        assertEquals("P.F", T005.abbrevName("Patrick Feenan"));
        assertEquals("E.C", T005.abbrevName("Evan Cole"));
        assertEquals("P.F", T005.abbrevName("P Favuzzi"));
        assertEquals("D.M", T005.abbrevName("David Mendieta"));
    }

    private static void assertEquals(String s1, String s2) {
        System.out.println(s1.equals(s2));
    }

    public static void main(String[] args) {
        testFixed();
    }
}
