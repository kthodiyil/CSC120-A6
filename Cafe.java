/* This is a stub for the Cafe class */
public class Cafe extends Building{
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    // Decreases the remaining inventory when the `Cafe` sells a cup of coffee
    public void sellCoffee(int size, int nSugarPackets, int nCreams){

        if(this.nCoffeeOunces <= 0 || this.nSugarPackets <= 0 || this.nCreams <= 0 || this.nCups <= 0){
            restock(size, nSugarPackets, nCreams, 1);
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
        }
        else{
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
        }
    }
    // Restocks ingredients when necessary
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        
    }
    
    public static void main(String[] args) {
        Cafe cafe = new Cafe("Compass Cafe", "7 Elm Street", 1, 12, 2, 2, 1);
        System.out.println(cafe);
        cafe.sellCoffee(12, 3, 45);
        System.out.println(cafe.nCoffeeOunces + " " + cafe.nSugarPackets + " " + cafe.nCreams);
        cafe.sellCoffee(2, 8, 3);
        System.out.println(cafe.nCoffeeOunces + " " + cafe.nSugarPackets + " " + cafe.nCreams);
        cafe.restock(100, 100, 100, 100);
        System.out.println(cafe.nCoffeeOunces + " " + cafe.nSugarPackets + " " + cafe.nCreams);
    }
    
}
