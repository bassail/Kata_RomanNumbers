public class Converter {

    public static String toRoman(int arabicNumber) {
        StringBuilder result = new StringBuilder();

        int rest = arabicNumber;
        for (RomanValues romanValue: RomanValues.values()) {
            rest = buildStringAndRestCalculation(rest, romanValue.getArabic(), romanValue.getRoman(), result);
        }
        return result.toString();
    }

    public static int buildStringAndRestCalculation(int arabicNumber, int romanToValue, String romanString, StringBuilder strb){
        int result = arabicNumber;
        while (result >= romanToValue) {
            strb.append(romanString);
            result -= romanToValue;
        }
        return result;
    }

    public static int toArabic(String romanNumber) {
        int result = 0;
        for (char character : romanNumber.toCharArray()){
            if (character == 'I') result ++;
        }
        return result;
    }
}