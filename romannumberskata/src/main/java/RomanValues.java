public enum RomanValues {
    THOUSAND(1000, "M"),
    NINE_HUNDRED(900, "CM"),
    FIVE_HUNDRED(500, "D"),
    FOUR_HUNDRED(400, "CD"),
    HUNDRED(100, "C"),
    NINETY(90, "XC"),
    FIFTY(50, "L"),
    FOURTY(40, "XL"),
    TEN(10, "X"),
    NINE(9, "IX"),
    FIVE(5, "V"),
    FOUR(4, "IV");


    int arabic;
    String roman;

    RomanValues(int arabic, String roman) {
        this.arabic = arabic;
        this.roman = roman;
    }

    public int getArabic() {
        return arabic;
    }

    public void setArabic(int arabic) {
        this.arabic = arabic;
    }

    public String getRoman() {
        return roman;
    }

    public void setRoman(String roman) {
        this.roman = roman;
    }
}
