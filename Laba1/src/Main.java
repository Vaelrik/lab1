import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Создание объекта Scanner для чтения ввода с консоли.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название фигуры (rectangle, triangle, trapezoid):");
        String shape = scanner.nextLine().toLowerCase();
        // Оператор if-else для обработки ввода пользователя.
        if (shape.equals("rectangle")) {
            System.out.println("Введите ширину и высоту прямоугольника:"); // это моя часть кода
            double width = scanner.nextDouble();
            double height = scanner.nextDouble();
            rectangle rect = new rectangle(width, height);
            System.out.println("Периметр: " + rect.getPerimeter());
            System.out.println("Площадь: " + rect.getArea());
            System.out.println("Длина диагонали: " + rect.getLenDiagonal());
        } else if (shape.equals("triangle")) {
            System.out.println("Введите длины сторон треугольника:");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();
            triangle tri = new triangle(side1, side2, side3);
            System.out.println("Периметр: " + tri.getPerimeter());
            System.out.println("Площадь: " + tri.getArea());
            System.out.println("Равнобедренный: " + tri.getCheckIsosceles());
        } else if (shape.equals("trapezoid")) {
            System.out.println("Введите длины оснований и боковых сторон трапеции, а также её высоту:");
            double base1 = scanner.nextDouble();
            double base2 = scanner.nextDouble();
            double side4 = scanner.nextDouble();
            double side5 = scanner.nextDouble();
            double trapezoidHeight = scanner.nextDouble();
            trapezoid trap = new trapezoid(base1, base2, side4, side5, trapezoidHeight);
            System.out.println("Периметр: " + trap.getPerimeter());
            System.out.println("Площадь: " + trap.getArea());
            System.out.println("Длина средней линии: " + trap.getLenMidLine());
        } else {
            // Вывод сообщения в случае нераспознанной фигуры.
            System.out.println("Фигура не распознана.");
        }
        // Закрытие объекта scanner.
        scanner.close();
    }
}