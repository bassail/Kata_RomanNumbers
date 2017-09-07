public class RomanConverter {

    String toRoman(int arabicNumber) {
        StringBuilder result = new StringBuilder();

        int rest = arabicNumber;
        for (RomanArabicValue romanValue : RomanArabicValue.values()) {
            rest = buildStringAndRestCalculation(rest, romanValue.arabic, romanValue.getRoman(), result);
        }
        return result.toString();
    }

    private int buildStringAndRestCalculation(int arabicNumber, int romanToValue, String romanString, StringBuilder strb) {
        int result = arabicNumber;
        while (result >= romanToValue) {
            strb.append(romanString);
            result -= romanToValue;
        }
        return result;
    }
}