public class CheckTriangle {

   static boolean solution = false;

    public static boolean isTriangleRight(Triangle triangle) {

        if (triangle.getSideA() > triangle.getSideB()) { // sprawdzamy długości boków A i B i zamieniamy
            double temp = triangle.getSideA();
            triangle.setSideA(triangle.getSideB());
            triangle.setSideB(temp);
        }
        if (triangle.getSideA() > triangle.getSideC()){ // sprawdzamy długości boków A i C i zamieniamy
            double temp = triangle.getSideA();
            triangle.setSideA(triangle.getSideC());
            triangle.setSideC(temp);
        }
        if (triangle.getSideB() > triangle.getSideC()){ // sprawdzamy długości boków B i C i zamieniamy
            double temp = triangle.getSideB();
            triangle.setSideB(triangle.getSideC());
            triangle.setSideC(temp);
        }
        if ((triangle.getSideC() == Math.sqrt(Math.pow(triangle.getSideA(), 2) + Math.pow(triangle.getSideB(), 2))))
        {// Pitagoras
            solution = true;
        }
        return solution;
    }
}
