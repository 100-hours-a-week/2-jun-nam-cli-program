package SportsEquipment;

public class Baseball extends Ball{
    public Baseball(){

    }
    public Baseball(String name, String category, float price, float diameter, String sportsType){
        super.name = name;
        super.category = category;
        super.price = price;
        super.diameter = diameter;
        super.sportsType = sportsType;
    }
    public void printInfo() {
        System.out.println("Name: " + super.name);
        System.out.println("Category: " + super.category);
        System.out.println("Price: $" + super.price);
        System.out.println("Diameter: " + super.diameter + "cm");
        System.out.println("SportsType: " + this.sportsType);
    }
}
