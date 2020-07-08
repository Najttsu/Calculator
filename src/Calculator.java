import java.util.ArrayList;
import java.util.ListIterator;

public class Calculator {

    public static void action1() {
        double[] arrDouble = new double[2];
        arrDouble = Logic.addToArray(arrDouble);

        System.out.println(arrDouble[0] + " " + Check.getSelectFirstAction() + " " + arrDouble[1] + " = " + Logic.logic(arrDouble));
    }

    public static void action2() {
        int amount = 0;
        boolean b = false;
        System.out.println("\nPlease insert amount of arguments:");


//        Creating a variable for the array index and catching exceptions
        while (!b) {
            System.out.print("Please insert you choice here: ");
            try {
                amount = Integer.parseInt(Scan.scan());

            } catch (NumberFormatException e) {
            }
            if (amount < 2) {
                System.out.println("Must be only positive two or more numbers!");
            } else b = true;
        }

        double[] arrDouble = new double[amount];

        arrDouble = Logic.addToArray(arrDouble);
        Logic.print(arrDouble);
    }

    public static void action3() {

        int count = 0;

        boolean mark = false;
        ArrayList<Double> doubleArrayList = new ArrayList<>();

        while (!mark){
            System.out.print("Please insert you choice here (insert \"c\" to finish inserting): ");
            if (Convert.parsed() != false){
//                check whether there is no division by zero
                if (count > 0 && Check.getSelectFirstAction().equals("/") && Convert.getParsedDouble() == 0.0) {
                    System.out.println("Can't divide by zero.");
                } else {
                    doubleArrayList.add(Convert.getParsedDouble());
                    count++;
                }
//                stopping and processing data
            } else if (Scan.getStrScan().equals("c")){
                if (doubleArrayList.size() != 0){

                    mark = true;
                    double[] arrDouble = new double[doubleArrayList.size()];
                    count = 0;

                    ListIterator<Double> listIterator = doubleArrayList.listIterator();
                    while (listIterator.hasNext()){
                        arrDouble[count] = listIterator.next();
                        count++;
                    }
                    Logic.print(arrDouble);
                } else mark = true;
            }
        }
    }
}