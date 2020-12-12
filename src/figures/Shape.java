package figures;

import java.util.UUID;

public abstract class Shape {

    UUID uuid;
    float x;
    float y;

    public Shape(float x, float y) {
        this.x=x;
        this.y=y;
        uuid=UUID.randomUUID();
    }

    abstract float getArea();
}
