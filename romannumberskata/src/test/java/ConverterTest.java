import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {
    @Test
    public void should_convert_1_in_roman_I() throws Exception {
        assertThat(Converter.toRoman(1)).isEqualTo("I");
    }

    @Test
    public void should_convert_5_to_V() throws Exception {
        assertThat(Converter.toRoman(5)).isEqualTo("V");
    }

    @Test
    public void should_convert_10_to_X() throws Exception {
        assertThat(Converter.toRoman(10)).isEqualTo("X");
    }
}