import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import Number.ArabicToRomanConvertor;

class ArabicToRomanTest {

    ArabicToRomanConvertor t = new ArabicToRomanConvertor();

    @Test
    void should_return_Ifor1()
    {
        ArabicToRomanConvertor t=new ArabicToRomanConvertor();
        String actual=t.convert(1);
        String expected="I";
        assertEquals(actual,expected);
    }
    @Test
    void should_return_IIfor2()
    {
        ArabicToRomanConvertor t=new ArabicToRomanConvertor();
        String actual=t.convert(2);
        String expected="II";
        assertEquals(actual,expected);
    }

    @Test
    void should_return_IIIfor3(){

        String actual = t.convert(3);
        String expected = "III";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_IVfor4(){

        String actual = t.convert(4);
        String expected = "IV";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_Vfor5(){

        String actual = t.convert(5);
        String expected = "V";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_VIIIfor8(){

        String actual = t.convert(8);
        String expected = "VIII";

        assertEquals(expected, actual);
    }

    @Test
    void should_return_XVfor15(){

        String actual = t.convert(15);
        String expected ="XV";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_XVIfor16(){

        String actual = t.convert(16);
        String expected ="XVI";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_XXfor20(){

        String actual = t.convert(20);
        String expected ="XX";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_XLfor40() {

        String actual = t.convert(40);
        String expected = "XL";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_Lfor50() {

        String actual = t.convert(50);
        String expected = "L";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_XCfor90() {

        String actual = t.convert(90);
        String expected = "XC";

        assertEquals(expected, actual);
    }
    @Test
    void should_return_Cfor100() {

        String actual = t.convert(100);
        String expected = "C";

        assertEquals(expected, actual);
    }

}