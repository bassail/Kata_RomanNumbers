import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterToArabicTest {

    @Test
    public void should_convert_I_to_1() throws Exception {
        assertThat(Converter.toArabic("I")).isEqualTo(1);
    }
}
