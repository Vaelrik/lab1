public class rectangle {
    double width;
    double height;
    public rectangle(double a, double b) { // конструктор, проверка на корректность даных
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Стороны прямоугольника должны быть положительными!"); // 23
        }
        this.width = a;
        this.height = b;
    }
    public double getPerimeter() {
        return 2 * (width + height);
    } // периметр
    public double getArea() {
        return width * height;
    } // площадь
    public double getLenDiagonal() { // длина диагонали
        return Math.sqrt(width * width + height * height);// здесь был олег
    }
}
