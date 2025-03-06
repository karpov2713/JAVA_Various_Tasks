public class Main {
    public static void main(String[] args) {
        Object g1 = new Line();
        Object g2 = new Triangle();
        Object g3 = new Figure();

        Line l1 = (Line) g1;
        l1.showId();

        Line l2 = null;
        if (g2 instanceof Line) {
            l2 = (Line) g2;
        }
    }
}

class Figure {
    int width;
    int color;
    int id = 1;

    Figure() {
        System.out.println("Конструктор Figure()");
    }

    Figure(int width, int color) {
        this.width = width;
        this.color = color;
        System.out.println("Конструктор Figure(width, color)");
    }

    void showId() {
        System.out.println("id = " + id);
    }
}

class Line extends Figure {
    double x1, y1;
    double x2, y2;
    int id = 2;

    Line() {
        super(0, 0);
        System.out.println("Конструктор Line()");
    }

    void showId() {
        super.showId();
        System.out.println("id = " + id);
    }
}

class Triangle extends Figure {
    double x1, y1;
    double x2, y2;
    double x3, y3;
}

class Rectangle extends Figure {
    double x1, y1;
    double x2, y2;
}

class Ellipse extends Figure {
    double x1, y1;
    double x2, y2;
}