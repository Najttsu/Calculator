import java.util.Scanner;

public class Scan {
    private static String strScan;

    public static String  scan() {
        Scanner scanner = new Scanner(System.in);
        return strScan = scanner.nextLine();
    }

    public static String getStrScan() {
        return strScan;
    }
}
