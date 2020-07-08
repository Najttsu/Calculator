public class Menu {
    public static void menu1(){
        System.out.print("\nPlease choose operation type:\n" +
                "+ : Addition\n" +
                "- : Subtraction\n" +
                "* : Multiplication\n" +
                "/ : Division\n" +
                "0 - Close application\n" +
                "Please insert you choice here: ");
    }

    public static void menu2 (){
        System.out.print("\nPlease choose number of inserted arguments:\n" +
                "1 - Two (for example 2 + 2)\n" +
                "2 - More than two (for example 2 + 2 + 2 + 2 + 2 for 5 arguments)\n" +
                "3 - Unknown (application)\n" +
                "0 - Close application\n" +
                "Please insert you choice here: ");
    }
}
