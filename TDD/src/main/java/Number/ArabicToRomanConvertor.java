package Number;

public class ArabicToRomanConvertor implements Convertor {

    private static final String[] ROMAN_CHARACTERS = {"C","XC","L","XL","X", "V","IV" ,"I"};
    private static final int[] DECIMAL_EQUIVALENTS = {100,90,50,40,10,5,4,1};

    @Override
    public String convert(int arabicNumber) {

        StringBuilder romanString = new StringBuilder();

        for (int index = 0; index < ROMAN_CHARACTERS.length; index++){

            while(arabicNumber >= DECIMAL_EQUIVALENTS[index]){
                romanString.append(ROMAN_CHARACTERS[index]);
                arabicNumber -= DECIMAL_EQUIVALENTS[index];
            }

        }
        return romanString.toString();

        /*if (arabicNumber == 1) {
            romanString += "I";
        }

        if (arabicNumber == 2) {
            romanString += "II";
        }
        if (arabicNumber == 3) {
            romanString += "III";
        }*/

        /*for(;arabicNumber>=10;arabicNumber-=10) {
             if (arabicNumber >= 10) {
                 romanString += "X";
             }

        }
        for(;arabicNumber>=5;arabicNumber-=5)
        {
             if (arabicNumber >= 5) {
                 romanString += "V";
             }
        }

        for(; arabicNumber > 0; arabicNumber--){
            romanString += "I";
        }

*/
    }

}
