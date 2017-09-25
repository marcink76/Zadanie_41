import java.util.Scanner;

public class InputData {

    public static Triangle inputData() {

        Triangle triangle = new Triangle();

        Scanner sideRead = new Scanner(System.in);
        System.out.println("Podaj pierwszy bok trójkąta:");
        triangle.setSideA(sideRead.nextDouble());
        System.out.println("Podaj drugi bok trójkąta:");
        triangle.setSideB(sideRead.nextDouble());
        System.out.println("Podaj trzeci bok trójkąta:");
        triangle.setSideC(sideRead.nextDouble());

        return triangle;
    }
}
