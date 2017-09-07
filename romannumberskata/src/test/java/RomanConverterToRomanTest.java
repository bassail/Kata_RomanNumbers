import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(JUnitParamsRunner.class)
public class RomanConverterToRomanTest {
    private RomanConverter romanConverter;

    @Before
    public void setUp() throws Exception {
        romanConverter = new RomanConverter();
    }

    @Test
    public void should_convert_1_in_roman_I() throws Exception {
        assertThat(romanConverter.toRoman(1)).isEqualTo("I");
    }

    @Test
    public void should_convert_2_in_roman_II() throws Exception {
        assertThat(romanConverter.toRoman(2)).isEqualTo("II");
    }

    @Test
    public void should_convert_3_in_roman_III() throws Exception {
        assertThat(romanConverter.toRoman(3)).isEqualTo("III");
    }

    @Test
    public void should_convert_4_in_roman_IV() throws Exception {
        assertThat(romanConverter.toRoman(4)).isEqualTo("IV");
    }

    @Test
    public void should_convert_5_in_roman_V() throws Exception {
        assertThat(romanConverter.toRoman(5)).isEqualTo("V");
    }

    @Test
    public void should_convert_6_in_roman_VI() throws Exception {
        assertThat(romanConverter.toRoman(6)).isEqualTo("VI");
    }

    @Test
    public void should_convert_7_in_roman_VII() throws Exception {
        assertThat(romanConverter.toRoman(7)).isEqualTo("VII");
    }

    @Test
    public void should_convert_8_in_roman_VIII() throws Exception {
        assertThat(romanConverter.toRoman(8)).isEqualTo("VIII");
    }

    @Test
    public void should_convert_9_in_roman_IX() throws Exception {
        assertThat(romanConverter.toRoman(9)).isEqualTo("IX");
    }

    @Test
    public void should_convert_10_in_roman_X() throws Exception {
        assertThat(romanConverter.toRoman(10)).isEqualTo("X");
    }

    @Test
    @Parameters({"17, XVII", "22, XXII", "70, LXX", "35, XXXV", "58, LVIII", "1903, MCMIII", "3999, MMMCMXCIX"})
    public void should_test_several(int arabic, String roman) throws Exception {
        assertThat(romanConverter.toRoman(arabic)).isEqualTo(roman);
    }
}