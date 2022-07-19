public class Hangar {
    

    public static void main(String[] args) {
        

        Car Bmw = new Car("Sport Car", "BMW", 10000);
        Boat Optimiste = new Boat("BIC", 300, "Small boat");

        System.out.println(Bmw.doStuff());
        System.out.println(Optimiste.doStuff());
    }
}
