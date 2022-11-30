import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import String.StringMethodsImpl;

class StringMethodsTest {

    StringMethodsImpl temp = new StringMethodsImpl();


    @Test
    void should_return_sameStringWhenOneCharacterGiven(){
        //String.StringMethods temp = new String.StringMethods();

        String actual = temp.lastTwoCars("a");
        String expected = "a";
        assertEquals(expected, actual);

    }

    @Test
    void should_Return_reversedStringWhenTwoCharactersGiven(){
        //String.StringMethods temp = new String.StringMethods();

        String actual = temp.lastTwoCars("TI");
        String expected = "IT";
        assertEquals(expected, actual);
    }
//    Given a String of any length,
//    return a new String where only the last 2 characters
//    are swapped.

    @Test
    void should_return_reversedStringWIthMorethanTwoChars(){
       // String.StringMethods temp = new String.StringMethods();

        String actual = temp.lastTwoCars("FORD");
        String expected = "FODR";
        assertEquals(expected, actual);

    }
    @Test
    void should_return_emptyStringWhenEmptyStringGiven(){
       // String.StringMethods temp = new String.StringMethods();

        String actual = temp.lastTwoCars("");
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    void should_Return_0ForNonPalindromeString(){
        int expected = 0;
        int actual = temp.palindromeOrNot("abc");
        assertEquals(expected, actual);
    }

    @Test
    void should_Return_Negative1WhenEmptyStringGiven(){
        int expected = -1;
        int actual = temp.palindromeOrNot("");
        assertEquals(expected, actual);
    }
    @Test
    void should_return_1whenStringLengthIsOne()
    {
        int expected = 1;
        int actual = temp.palindromeOrNot("a");
        assertEquals(expected, actual);
    }

    @Test
    void should_return_10whenStringLengthisGreaterThan1AndPalindrome(){
        int expected = 10;
        int actual =temp.palindromeOrNot("abbba");
        assertEquals(expected, actual);
    }

    @Test
    void should_return_abcForremoveDuplicates(){
        // String.StringMethods temp = new String.StringMethods();

        String expected = "abc";
        String actual= temp.removeDuplicatesFromString("aabbcc");
        assertEquals(actual,expected);
    }
}
