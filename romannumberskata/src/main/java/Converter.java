public class Converter {

    public static String toRoman(int arabicNumber) {
        StringBuilder result = new StringBuilder();

        int rest = arabicNumber;
        rest = buildStringAndRestCalculation(rest, 9, "IX", result);
        rest = buildStringAndRestCalculation(rest, 5, "V", result);
        rest = buildStringAndRestCalculation(rest, 4, "IV", result);

        for (int i = 0; i < rest; i++) {
            result.append("I");
        }
        return result.toString();
    }

    public static int buildStringAndRestCalculation(int arabicNumber, int romanToValue, String romanString, StringBuilder strb){
        int result = arabicNumber;
        if (result >= romanToValue) {
            strb.append(romanString);
            result -= romanToValue;
        }
        return result;
    }
}
