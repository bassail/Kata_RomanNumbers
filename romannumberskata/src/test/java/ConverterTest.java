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
}