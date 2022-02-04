public class Exercise6 {
    public static void main(String[] args) {

        int triangleBase = 10;
        int triangleHeight = 15;
        double areaOfTriangle = (double) (triangleBase * triangleHeight) / 2;

        int squareSide = 25;
        int areaOfSquare = squareSide * squareSide;

        int rectangleHeight = 20;
        int rectangleLength = 25;
        int areaOfRectangle = rectangleHeight * rectangleLength;

        System.out.println("Area of triangle = " + areaOfTriangle);
        System.out.println("Area of square = " + areaOfSquare);
        System.out.println("Area of rectangle = " + areaOfRectangle);
    }
}
