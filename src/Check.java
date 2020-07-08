public class Check {
    private static String selectFirstAction;
    private static String selectSecondAction;

    public static String getSelectFirstAction() {
        return selectFirstAction;
    }

    public static String getSelectSecondAction() {
        return selectSecondAction;
    }

    public static void firstCheck() {
        boolean b = false;
        while (!b) {
            selectFirstAction = Scan.scan();
            if (!selectFirstAction.equals("0")) {
                if (selectFirstAction.equals("+") || selectFirstAction.equals("-") || selectFirstAction.equals("*") || selectFirstAction.equals("/")) {
                    b = true;
                    Menu.menu2();
                    secondCheck();
                } else {
                    Menu.menu1();
                }
            } else {
                b = true;
                System.out.println("Exit");
            }
        }

    }

    public static void secondCheck() {
        if (!selectFirstAction.equals("0")) {
            boolean b = false;
            while (!b) {
                selectSecondAction = Scan.scan();
                if (!selectSecondAction.equals("0")) {
                    if (selectSecondAction.equals("1") || selectSecondAction.equals("2") || selectSecondAction.equals("3")) {
                        choiceOfAction();
                        b = true;
                    } else {
                        Menu.menu2();
                    }
                } else {
                    b = true;
                    System.out.println("Exit");
                }
            }
        }
    }

    public static void choiceOfAction() {
        if ((selectFirstAction.equals("+") ||
                selectFirstAction.equals("-") ||
                selectFirstAction.equals("*") ||
                selectFirstAction.equals("/")) && selectSecondAction.equals("1")) {
            Calculator.action1();
        } else if ((selectFirstAction.equals("+") ||
                selectFirstAction.equals("-") ||
                selectFirstAction.equals("*") ||
                selectFirstAction.equals("/")) && selectSecondAction.equals("2")) {
            Calculator.action2();
        }else if ((selectFirstAction.equals("+") ||
                selectFirstAction.equals("-") ||
                selectFirstAction.equals("*") ||
                selectFirstAction.equals("/")) && selectSecondAction.equals("3")) {
            Calculator.action3();
        }

    }
}
