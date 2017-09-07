class ArabicConverter {

    int toArabic(String romanNumber) {
        int result = 0;
        result = translateRomanCharacterGroups(romanNumber, result);
        return result;
    }

    private int translateRomanCharacterGroups(String romanNumber, int result) {
        for (int i = 0; i < romanNumber.length(); i++) {
            RomanArabicValue romanArabicValue = RomanArabicValue.findByRoman(romanNumber.substring(i, i + 1));
            RomanArabicValue romanArabicNextValue = romanArabicValue;

            if (romanNumber.length() > (i + 1)) {
                romanArabicNextValue = RomanArabicValue.findByRoman(romanNumber.substring(i + 1, i + 2));
            }
            if (romanArabicValue.arabic < romanArabicNextValue.arabic) {
                result += RomanArabicValue.findByRoman(romanNumber.substring(i, i + 2)).arabic;
                i += 1;
            } else {
                result += romanArabicValue.arabic;
            }
        }
        return result;
    }
}
