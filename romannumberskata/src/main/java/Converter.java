public class Converter {

    public static String toRoman(int arabicNumber) {
        StringBuilder result = new StringBuilder();

        int rest = arabicNumber;
        for (RomanArabicValue romanValue: RomanArabicValue.values()) {
            rest = buildStringAndRestCalculation(rest, romanValue.arabic, romanValue.getRoman(), result);
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
        for (int i = 0; i < romanNumber.length(); i++) {
            RomanArabicValue romanArabicValue = RomanArabicValue.findByRoman(romanNumber.substring(i, i+1));
            RomanArabicValue romanArabicNextValue = romanArabicValue;

            if(romanNumber.length() > (i+1)){
                 romanArabicNextValue = RomanArabicValue.findByRoman(romanNumber.substring(i+1, i+2));
            }
            if (romanArabicValue.arabic < romanArabicNextValue.arabic) {
              result += RomanArabicValue.findByRoman(romanNumber.substring(i, i+2)).arabic;
              i+=1;
            }else{
                result += romanArabicValue.arabic;
            }
        }
        return result;
    }
}