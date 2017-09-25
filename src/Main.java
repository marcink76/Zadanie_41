import java.util.Locale;

public class Main {
    public static void main (String[] args){

        if (CheckTriangle.isTriangleRight(InputData.inputData())){
            System.out.println("Jest prostokątny!");
        }else {
            System.out.println("Nie jest prostokątny");
        }

    }
}
