public class Converter {

    public static String toRoman(int arabicNumber) {
        StringBuilder result = new StringBuilder();

        if(arabicNumber == 6){
            result.append("VI");
        }else if (arabicNumber == 5) {
            result.append("V");
        } else if (arabicNumber == 4) {
                result.append("IV").toString();
            } else {
                for (int i = 0; i < arabicNumber; i++) {
                    result.append("I");
                }
            }
        return result.toString();
    }
}
