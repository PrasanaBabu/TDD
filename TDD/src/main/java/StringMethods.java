public class StringMethods {

//Swap the last two Characters in a string
    String lastTwoCars(String str) {

        if (str.length() == 1 || str.length() == 0) {
            return str;
        }

        else {
            return getStringWithLastTwoCharactersSwapped(str);
        }
    }

    private static String getStringWithLastTwoCharactersSwapped(String str) {
        char[] strArray = str.toCharArray();
        char temp = strArray[ str.length() - 1 ];
        strArray[ strArray.length - 1 ] = strArray[ strArray.length - 2 ];
        strArray[ strArray.length - 2 ] = temp;

        return new String(strArray);
    }

    //    Check given string is palindrome or not(
//Returns  -1 when empty; 1 when single char; 10 when palindrome; 0 when not palindrome
    int palindromeOrNot(String inputString)
    {
        if(inputString.isEmpty()) {
            return -1;
        }
        if(inputString.length() == 1) {
             return 1;
        }

        String reversedString = getReversedString(inputString);

        if( reversedString.equals(inputString)){
            return 10;
        }
        else {
            return 0;
        }
    }

    private static String getReversedString(String inputString) {
        StringBuilder outputString = new StringBuilder(inputString);
        outputString.reverse();
        return outputString.toString();
    }
}
