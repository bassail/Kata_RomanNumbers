public class Converter {

    public static String toRoman(int arabicNumber) {
        StringBuilder result = new StringBuilder();

        int rest = arabicNumber;

        if (arabicNumber >= 5) {
            result.append("V");
            rest = rest - 5;
        }

        if (rest == 4) {
            result.append("IV").toString();
            rest = rest - 4;
        }
        for (int i = 0; i < rest; i++) {
            result.append("I");
        }
        return result.toString();
    }
}
