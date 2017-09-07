import java.util.Arrays;

public enum RomanArabicValue {
    THOUSAND(1000, "M"),
    NINE_HUNDRED(900, "CM"),
    FIVE_HUNDRED(500, "D"),
    FOUR_HUNDRED(400, "CD"),
    HUNDRED(100, "C"),
    NINETY(90, "XC"),
    FIFTY(50, "L"),
    FORTY(40, "XL"),
    TEN(10, "X"),
    NINE(9, "IX"),
    FIVE(5, "V"),
    FOUR(4, "IV"),
    ONE(1, "I");


    int arabic;
    String roman;

    RomanArabicValue(int arabic, String roman) {
        this.arabic = arabic;
        this.roman  = roman;
    }

    public String getRoman() {
        return roman;
    }

    public static RomanArabicValue findByRoman(final String romanToFind){
        return Arrays.stream(values())
                .filter(number -> number.roman.equals(romanToFind))
                .findAny()
                .orElse(values()[0]);
    }
}
