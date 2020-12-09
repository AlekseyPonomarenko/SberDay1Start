package conversion;

public class Temperature {

    private float сelsius;

    /*В конструктор подаётся температура в цельсиях*/
    public Temperature(float сelsius) {
        this.сelsius=сelsius;
    }

    public float getСelsius() {
        return сelsius;
    }

    public float getKelvin() {
        return (float) (сelsius + 273.15);
    }

    public float getFahrenheit() {
        return (float) (сelsius*1.8 + 32);
    }


    @Override
    public String toString() {
        return "Temperature{" +
                "сelsius=" + сelsius +
                ", kelvin=" + getKelvin() +
                ", fahrenheit=" + getFahrenheit() +
                '}';
    }
}
