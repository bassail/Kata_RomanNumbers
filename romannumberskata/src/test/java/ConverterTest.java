import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {
    @Test
    public void should_convert_1_in_roman_I() throws Exception {
        assertThat(Converter.toRoman(1)).isEqualTo("I");
    }

    @Test
    public void should_convert_2_in_roman_II() throws Exception {
        assertThat(Converter.toRoman(2)).isEqualTo("II");
    }

    @Test
    public void should_convert_3_in_roman_III() throws Exception {
        assertThat(Converter.toRoman(3)).isEqualTo("III");
    }

    @Test
    public void should_convert_4_in_roman_IV() throws Exception {
        assertThat(Converter.toRoman(4)).isEqualTo("IV");
    }

    @Test
    public void should_convert_5_in_roman_V() throws Exception {
        assertThat(Converter.toRoman(5)).isEqualTo("V");
    }
}