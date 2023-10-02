// Абстрактный класс для геометрических фигур
abstract class Shape {
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}

// Класс для шара
class Ball extends Shape {
    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateVolume() {
        return 4.0 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

// Класс для коробки
class Box extends Shape {
    private double sideLength;

    public Box(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    double calculateVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    double calculateSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}

// Класс для цилиндра
class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    double calculateSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
}

// Класс для пирамиды
class Pyramid extends Shape {
    private double baseArea;
    private double height;

    public Pyramid(double baseArea, double height) {
        this.baseArea = baseArea;
        this.height = height;
    }

    @Override
    double calculateVolume() {
        return baseArea * height / 3;
    }

    @Override
    double calculateSurfaceArea() {
        // Площадь боковой поверхности пирамиды вычисляется в соответствии с формулой
        // S = (P * h) / 2, где P - периметр основания, h - высота боковой грани
        // В данном примере предполагаем, что основание пирамиды - квадрат
        double perimeter = 4 * Math.sqrt(baseArea);
        return baseArea + perimeter * height / 2;
    }
}

// Main класс
public class Main {
    public static void main(String[] args) {
        // Создаем объекты геометрических фигур
        Shape ball = new Ball(5); // Радиус шара: 5
        Shape box = new Box(3);    // Длина стороны коробки: 3
        Shape cylinder = new Cylinder(2, 7); // Радиус цилиндра: 2, Высота цилиндра: 7
        Shape pyramid = new Pyramid(9, 4);   // Площадь основания пирамиды: 9, Высота пирамиды: 4

        // Выводим характеристики геометрических фигур
        System.out.println("Объем шара: " + ball.calculateVolume() + ", Площадь поверхности шара: " + ball.calculateSurfaceArea());
        System.out.println("Объем коробки: " + box.calculateVolume() + ", Площадь поверхности коробки: " + box.calculateSurfaceArea());
        System.out.println("Объем цилиндра: " + cylinder.calculateVolume() + ", Площадь поверхности цилиндра: " + cylinder.calculateSurfaceArea());
        System.out.println("Объем пирамиды: " + pyramid.calculateVolume() + ", Площадь поверхности пирамиды: " + pyramid.calculateSurfaceArea());
    }
}
