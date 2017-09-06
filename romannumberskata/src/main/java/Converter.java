public class Converter {

    public static String toRoman(int arabicNumber) {
        StringBuilder result = new StringBuilder();

        int rest = arabicNumber;
        if (rest >= 9) {
            result.append("IX");
            rest = rest - 9;
        }

        if (rest >= 5) {
            result.append("V");
            rest = rest - 5;
        }

        if (rest >= 4) {
            result.append("IV");
            rest = rest - 4;
        }
        for (int i = 0; i < rest; i++) {
            result.append("I");
        }
        return result.toString();
    }

}
