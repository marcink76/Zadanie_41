import java.util.Locale;

public class Main {
    public static void main (String[] args){
        Triangle triangle = new Triangle();
        InputData.inputData(triangle);
        if (CheckTriangle.isTriangleRight(triangle)){
            System.out.printf(Locale.ROOT,"Trójkąt o bokach:\n A: %.2f\n B: %.2f\n C: %.2f\nJest prostokątny!",
                    triangle
                    .getSideA(), triangle.getSideB(), triangle.getSideC());
        }else {
            System.out.printf(Locale.ROOT,"Trójkąt o bokach:\n A: %.2f\n B: %.2f\n C: %.2f\nNie jest prostokątny!",
                    triangle
                    .getSideA(), triangle.getSideB(), triangle.getSideC());
        }

    }
}
