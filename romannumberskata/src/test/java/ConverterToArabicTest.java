import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterToArabicTest {

    @Test
    public void should_convert_I_to_1() throws Exception {
        assertThat(Converter.toArabic("I")).isEqualTo(1);
    }

    @Test
    public void should_convert_II_to_2() throws Exception {
        assertThat(Converter.toArabic("II")).isEqualTo(2);
    }

    @Test
    public void should_convert_III_to_3() throws Exception {
        assertThat(Converter.toArabic("III")).isEqualTo(3);
    }
}
