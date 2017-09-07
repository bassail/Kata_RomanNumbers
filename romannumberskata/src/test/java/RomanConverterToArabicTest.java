import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class RomanConverterToArabicTest {
    private ArabicConverter arabicConverter;

    @Before
    public void setUp() throws Exception{
        arabicConverter = new ArabicConverter();
    }

    @Test
    public void should_convert_I_to_1() throws Exception {
        assertThat(arabicConverter.toArabic("I")).isEqualTo(1);
    }

    @Test
    public void should_convert_II_to_2() throws Exception {
        assertThat(arabicConverter.toArabic("II")).isEqualTo(2);
    }

    @Test
    public void should_convert_III_to_3() throws Exception {
        assertThat(arabicConverter.toArabic("III")).isEqualTo(3);
    }

    @Test
    public void should_convert_IV_to_4() throws Exception {
        assertThat(arabicConverter.toArabic("IV")).isEqualTo(4);
    }

    @Test
    @Parameters({"17, XVII", "22, XXII", "70, LXX", "35, XXXV", "58, LVIII", "1903, MCMIII", "3999, MMMCMXCIX"})
    public void should_test_several(int arabic, String roman) throws Exception {
        assertThat(arabicConverter.toArabic(roman)).isEqualTo(arabic);
    }
}
