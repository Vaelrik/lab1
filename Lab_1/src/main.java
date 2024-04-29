public class Main {
    public static void main(String[] args) {
        rectangle.rectangle myRectangle = new rectangle(5, 10); // Creating a new rectangle object with width 5 and height 10

        System.out.println("Периметр: " + myRectangle.getPerimeter());
        System.out.println("Площадь: " + myRectangle.getArea());
        System.out.println("Длина диагонали: " + myRectangle.getLenDiagonal());
    }
}