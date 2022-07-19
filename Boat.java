public class Boat extends Vehicle {

    private String type;

    
    public Boat(String brand, int kilometers, String type) {
        super(brand, kilometers);
        this.type = type;
    }
    
    @Override
    public String doStuff() {
        return String.format("I am %s and I go glug glug!", this.getBrand());
    }

    public String getType() {
        return type;
    }
}
