public class Logic {
    private static double result = 0;

//    Calculation
    public static double logic(double[] arrDouble){
        result = arrDouble[0];
        switch (Check.getSelectFirstAction()) {
            case "+":
                for (int i = 1; i < arrDouble.length; i++) {
                    result += arrDouble[i];
                }
                break;
            case "-":
                for (int i = 1; i < arrDouble.length; i++) {
                    result -= arrDouble[i];
                }
                break;
            case "*":
                for (int i = 1; i < arrDouble.length; i++) {
                    result *= arrDouble[i];
                }
                break;
            case "/":
                for (int i = 1; i < arrDouble.length; i++) {
                    result /= arrDouble[i];
                }
        }
        return result;
    }

//    Fill in the array with information from the user
    public static double[] addToArray(double[] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.print("Please insert " + (i + 1) + " argument : ");

            if (Convert.parsed() != false) {

                doubleArray[i] = Convert.getParsedDouble();
                if (i > 0 && doubleArray[i] == 0.0 && Check.getSelectFirstAction().equals("/")) {
                    System.out.println("Can't divide by zero.");
                    i--;
                }
            } else i--;
        }
        return doubleArray;
    }

//    Output the result of actions
    public static void print(double[] arrDouble){

        for (int i = 0; i < arrDouble.length; i++) {
            if (i == 0 || i < arrDouble.length - 1) {
                System.out.print(arrDouble[i] + " " + Check.getSelectFirstAction() + " ");
            } else {
                System.out.print(arrDouble[i] + " = " + Logic.logic(arrDouble));
            }
        }
        System.out.println();
    }
}
