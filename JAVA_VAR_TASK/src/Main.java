public class Main {
    public static void main(String[] args) {
        Figure geom[] = new Figure[4];
        geom[0] = new Line();
        geom[1] = new Triangle();
        geom[2] = new Rectangle();
        geom[3] = new Ellipse();
    }
}

class Geom{
    int id;
}

class Figure extends Geom{
    int width;
    int color;

    Figure() {
        System.out.println("Конструктор Figure");
    }
}

class Line extends Figure {
    double x1, y1;
    double x2, y2;

    Line(){
        System.out.println("Конструктор Line");
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