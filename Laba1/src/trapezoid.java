public class trapezoid {
    double side1;
    double side2;
    double side3;
    double side4;
    double height;


    public trapezoid(double a, double b, double c, double d, double h) { // конструктор, проверка на корректность даных
        if (a <= 0 || b <=0 || c <= 0 || d <= 0 || h <= 0) {
            throw new IllegalArgumentException("Стороны трапеции и её высота должны быть положительными!");
        }
        this.side1 = a;
        this.side2 = b;
	this.side3 = c;
	this.side4 = d;
	this.height = h;
    }

    public double getPerimeter() {
        return side1 + side2 + side3 + side4;
    } // периметр

    public double getArea() {
        return ((side1 + side2) / 2) * height;
    } // площадь трапеции

    public double getLenMidLine() { 
	// Длина средней линии
        return (side1 + side2) / 2;
    } 
}

