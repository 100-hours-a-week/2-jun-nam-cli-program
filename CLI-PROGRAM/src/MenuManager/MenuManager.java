package MenuManager;
import SportsEquipment.SportsEquipmentManager;
import SportsEquipment.SportsEquipment;
import User.User;
import java.util.ArrayList;
import java.util.Scanner;
public class MenuManager {
    private final SportsEquipmentManager SportsEquipmentManager;

    public MenuManager(Scanner scanner, SportsEquipmentManager SportsEquipmentManager) {
        this.SportsEquipmentManager = SportsEquipmentManager;
    }

    public void showMainMenu(){
        System.out.println("\nKakaoTech Bootcamp Assignment 1");
        System.out.println("-------------------------\n");
        System.out.println("1 - Explore Items");
        System.out.println("2 - Redeem Coupon");
        System.out.println("3 - Quit\n");
        System.out.println("-------------------------");
        System.out.print("Your Input - ");
    }
    public void showItemMenu(){
        System.out.println("\nAvailable Items");
        System.out.println("-------------------------\n");
        int cnt = 1;
        for(int i = 0; i < SportsEquipmentManager.getAvailableItemSize(); i++){
            System.out.println(cnt + " - " + SportsEquipmentManager.getEquipmentName(i));
            cnt++;
        }
//        System.out.println("3 - Bat");
//        System.out.println("4 - Raquet");

        System.out.println(cnt + " - Go to PurchaseMenu\n");
        System.out.println("-------------------------");
        System.out.print("Your Input - ");
    }
    public void showItemInfoMenu(int userInput) {
        SportsEquipment selectedItem = SportsEquipmentManager.getSportsEquipment(userInput);
        if (selectedItem != null) {
            System.out.println("\nItem Info");
            System.out.println("-------------------------");
            selectedItem.printInfo();
            System.out.println("-------------------------");
        }
    }

    public boolean showPurchaseMenu(User userinfo){
        System.out.println("\nCart Info");
        System.out.println("-------------------------");
        userinfo.printCartItems();
        System.out.println("-------------------------\n");
        if(userinfo.getUserCouponStatus() && userinfo.hasCouponAvailableItem()){
            System.out.println("\nAvailable Coupon");
            System.out.println("-------------------------");
            userinfo.printCoupon();
            System.out.println("-------------------------");
            return true;
        }
        return false;
    }

    public float showPriceMenu(User userinfo){
        if(userinfo.getUserCouponStatus() && userinfo.hasCouponAvailableItem()) {
            System.out.println("\nCart Info");
            System.out.println("-------------------------");
            userinfo.printCartItems();
            System.out.println("-------------------------\n");
        }
        System.out.print("Amount you have to pay : ");
        System.out.println(userinfo.getTotalBill());
        return userinfo.getTotalBill();
    }
}
