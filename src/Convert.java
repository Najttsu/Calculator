public class Convert {
    private static double parsedDouble = 0;

    public static boolean parsed(){
        try {
            parsedDouble = Double.parseDouble(Scan.scan());
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static double getParsedDouble() {
        return parsedDouble;
    }
}
