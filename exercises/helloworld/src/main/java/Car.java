public class Car {
    private String make;
    private String colour;
    private float speed;

    public String getMake() {
        return make;
    }

    public String getColour() {
        return colour;
    }

    public float getSpeed() {
        return speed;
    }

    public Car(String make, String colour) {
        this.make = make;
        this.colour = colour;
    }

    public void setSpeedTo(float newSpeed) {
        this.speed = newSpeed;
    }

    @Override
    public String toString() {
        return "A " + this.colour + " " + this.make + " travelling at " + this.speed + " kph";
    }

    public static void main(String[] args) {
        Car marksCar = new Car("Volkswagen", "white");
        marksCar.setSpeedTo(50.0f);
        System.out.println(marksCar);
    }
}
