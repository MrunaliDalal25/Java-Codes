import static java.lang.System.out;

public class SwappingWithoutThirdVariable {
    public static void main(String[] args) {
        int x=86,y=94;
////Using XOR==best method
        x=x^y;
        y=x^y;
        x=x^y;
        out.println("Swapped successsfully");
        out.println("x = " + x + "b = " + y);
        out.println("x " +x);
        out.println("y " +y);


    }

}
