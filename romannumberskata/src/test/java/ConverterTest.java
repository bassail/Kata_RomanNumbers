import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ConverterTest {
    @Test
    public void should_convert_1_in_roman_I() throws Exception {
        Assertions.assertThat(Converter.toRoman(1)).isEqualTo("I");
    }
}