import java.text.NumberFormat;
import java.text.ParseException;

public class Exemplo02 {
    public static void main(String[] args) {
        Number valor = Double.valueOf("d1.75");
        System.out.println(valor);
        try {
            Number valor2 = NumberFormat.getInstance(null).parse("d2.32");
            System.out.println(valor2);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
