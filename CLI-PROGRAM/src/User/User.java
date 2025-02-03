package User;

import java.util.ArrayList;
import SportsEquipment.*;
import Coupon.*;
public class User {
    public boolean couponStatus;
    private Coupon redeemedCoupon;
    ArrayList<SportsEquipment> cart;
    public User(){
        this.couponStatus = false;
        this.cart = new ArrayList<SportsEquipment>();
    }
    public void receivedCoupon(Coupon tmp){
        this.couponStatus = true;
        this.redeemedCoupon = tmp;
    }

    public boolean getUserCouponStatus(){
        return this.couponStatus;
    }

    public void printCoupon(){
        System.out.println(getUserCoupon().couponType + " " + getUserCoupon().discountAmount + "%");
    }
    public void addToCart(SportsEquipment item){
        this.cart.add(item);
    }


    public void printCartItems(){
        int cnt = 1;
        for (SportsEquipment sportsEquipment : cart) {
            System.out.println(cnt + ".");
            sportsEquipment.printInfo();
            System.out.println();
            cnt++;
        }
    }

    public float getTotalBill(){
        float sum = 0;
        for (SportsEquipment sportsEquipment : cart) {
            sum += sportsEquipment.getPrice();
        }
        return sum;
    }

    public String getCouponType(){
        return redeemedCoupon.getCouponType();
    }

    public int getCartSize(){
        return this.cart.size();
    }

    public Coupon getUserCoupon(){
        return this.redeemedCoupon;
    }


    public boolean hasCouponAvailableItem(){
        for (SportsEquipment sportsEquipment : cart) {
            if(this.getCouponType().equals(sportsEquipment.getCategory()))
                return true;
        }
        return false;
    }

    public void applyCoupon(int index){
        float price = this.cart.get(index).getPrice();
        price =  Math.round(((100 - this.redeemedCoupon.discountAmount) * price)) / 100.0f;
        cart.get(index).setPrice(price);
        System.out.println(price + " " + cart.get(index).getPrice());
    }
    public String getCartItemCategory(int index){
        return this.cart.get(index).getCategory();
    }

    public void getCouponAvailableItem(String type){
        int cnt = 1;
        for (SportsEquipment sportsEquipment : cart) {
            if(sportsEquipment.getCategory().equals(type)){
                System.out.println(cnt + ".");
                sportsEquipment.printInfo();
                cnt++;
            }
        }
    }
}
