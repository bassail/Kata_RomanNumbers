public class Converter {

    public static String toRoman(int arabicNumber) {
        if      (arabicNumber ==  1) return "I";
        else if (arabicNumber == 5) return "V";
        else if (arabicNumber == 10) return "X";
        return "";
    }
}
