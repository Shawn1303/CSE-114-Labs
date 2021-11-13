public class Calculator {
    public static void main(String[] args) throws NumberFormatException {
        Integer value1 = Integer.parseInt(args[0]);
        String  oper = args[1];
        Integer value2 = Integer.parseInt(args[2]);

        switch (oper) {
            case "+":
                System.out.println(value1 + value2);
                break;
            case "-":
                System.out.println(value1 - value2);
                break;
            case "*":
                System.out.println(value1 * value2);
                break;
            case "/":
                if (value2 == 0) throw new NumberFormatException("Cannot divide by zero");
                else System.out.println(value1 / value2);
                break;
        }
    }
}

class NumberFormatException extends Throwable{
    String s;

    public NumberFormatException(String s) {
        this.s = s;
    }
}
