class RomanConverter {

    private StringBuilder resultStringBuilder = new StringBuilder();
    String toRoman(int arabicNumber) {
        int rest = arabicNumber;
        for (RomanArabicValue romanValue : RomanArabicValue.getOrderedListOfValues()) {
            rest = buildStringResult(rest, romanValue.arabic, romanValue.getRoman());
        }
        return resultStringBuilder.toString();
    }

    private int buildStringResult(int arabicNumber, int romanToValue, String romanString) {
        int result = arabicNumber;
        while (result >= romanToValue) {
            resultStringBuilder.append(romanString);
            result -= romanToValue;
        }
        return result;
    }
}