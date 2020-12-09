package figures;
public class Circle extends Shape {
    private float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "uuid=" + uuid +
                ", x=" + x +
                ", y=" + y +
                ", radius=" + radius +
                String.format(", area=%.2f", getArea())+
                '}';
    }

    private float getArea() {
        return (float) Math.PI*radius*radius;
    }

}
