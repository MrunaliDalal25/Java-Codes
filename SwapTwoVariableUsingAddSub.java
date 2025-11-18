import static java.lang.System.out;

public class SwapTwoVariableUsingAddSub {
    public static void main(String[] args) {
        int a=25,b=31;
        a=a+b;
        b=a-b;
        a=a-b;
        out.println("a "+a);
        out.println("b "+b);

    }

}
