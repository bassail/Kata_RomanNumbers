public enum RomanValues {
    NINE(9, "IX"),
    FIVE(5, "V"),
    FOUR(4, "IV");

    int arabic;
    String roman;

    RomanValues(int arabic, String roman) {
        this.arabic = arabic;
        this.roman = roman;
    }
}
