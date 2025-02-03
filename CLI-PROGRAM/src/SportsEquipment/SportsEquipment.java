package SportsEquipment;

public class SportsEquipment {
    String name;
    String category;
    float price;

    public SportsEquipment(){

    }
    public SportsEquipment(String name, String category, float price) {
      this.name = name;
      this.category = category;
      this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getCategory() {
        return this.category;
    }
    public float getPrice(){
        return this.price;
    }
    public void setPrice(float price){
        this.price = price;
    }
    public void printInfo(){

    }
}
