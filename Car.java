public class Car extends Vehicle {
    
    private String type;

    
    public Car(String type, String brand, int kilometers){
        super(brand, kilometers);
        this.type = type;
    }
    
    @Override
    public String doStuff() {
        return String.format("I am %s and I go zoom zoom zoom!", this.getBrand());
    }

    public String getType() {
        return type;
    }
}
