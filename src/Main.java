import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    start();

    }
    private static void start(){
        boolean mark = false;
        while (!mark){
            Menu.menu1();
            Check.firstCheck();
            if (Check.getSelectFirstAction().equals("0") || Check.getSelectSecondAction().equals("0")){
                mark = true;
            }
        }
    }
}

