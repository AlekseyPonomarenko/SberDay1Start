package figures;

public class Triangle extends Shape {
    private float a; //сторона
    private float b; //сторона
    private float angle; //угол между сторонами a и b

    public Triangle(float x, float y, float a, float b, float angle) {
        super(x, y);
        this.a=a;
        this.b=b;
        this.angle=angle;
    }
    @Override
    public String toString() {
        return "Triangle{" +
                "uuid=" + uuid +
                ", x=" + x +
                ", y=" + y +
                ", a=" + a +
                ", b=" + b +
                ", angle=" + angle +
                String.format(", area=%.2f", getArea())+
                '}';
    }

    public float getArea() {
        Double sinAngle = Math.sin(angle);
        return (float) 0.5*a*b*sinAngle.floatValue();
    }

}
