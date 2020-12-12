package figures;

public class Rectangle extends Shape{

    private float width;
    private float height;

    public Rectangle(float x, float y, float width, float height) {
        super(x, y);
        this.width=width;
        this.height=height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "uuid=" + uuid +
                ", x=" + x +
                ", y=" + y +                
                ", width=" + width +
                ", height=" + height +
                String.format(", area=%.2f", getArea())+
                '}';
    }

    public float getArea() {
        return (float) width*height;
    }
}
