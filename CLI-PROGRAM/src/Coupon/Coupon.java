package Coupon;

public class Coupon {
    public String couponType;
    public int discountAmount;
    public Coupon(){
        double randomValue = Math.random();
        String[] categories = {"Ball", "Bat"};
        int type = (int)(randomValue* categories.length);
        this.couponType = categories[type];
        int amount = (int)(randomValue*3) + 1;
        this.discountAmount = amount * 10;
    }
    public void printCoupon(){
        System.out.println(this.couponType + "\n" + discountAmount);
    }

    public String getCouponType(){
        return this.couponType;
    }
}
