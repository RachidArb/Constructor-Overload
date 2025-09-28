
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int tax = 0;
        int finalTaxRate = 0;
        double taxRate = 0.0;
        double taxesToPay = 0.0;
        int giftValue = scan.nextInt();
        if (giftValue < 5000) {
            System.out.println("No tax!");
        } else if (giftValue >= 5000 && giftValue <= 25000) {
            tax = 100;
            finalTaxRate = giftValue - 5000;
            taxRate = 0.08;
            taxesToPay = tax + finalTaxRate * taxRate;
            System.out.println("Tax:" + taxesToPay);
        } else if (giftValue >= 25000 && giftValue <= 55000) {
            tax = 1700;
            finalTaxRate = giftValue - 25000;
            taxRate = 0.10;
            taxesToPay = tax + finalTaxRate * taxRate;
            System.out.println("Tax:" + taxesToPay);
        } else if (giftValue >= 55000 && giftValue <= 200000) {
            tax = 4700;
            finalTaxRate = giftValue - 55000;
            taxRate = 0.12;
            taxesToPay = tax + finalTaxRate * taxRate;
            System.out.println("Tax:" + taxesToPay);
        } else if (giftValue >= 200000 && giftValue <= 1000000) {
            tax = 22100;
            finalTaxRate = giftValue - 200000;
            taxRate = 0.15;
            taxesToPay = tax + finalTaxRate * taxRate;
            System.out.println("Tax:" + taxesToPay);
        } else if (giftValue >= 1000000) {
            tax = 142100;
            finalTaxRate = giftValue - 1000000;
            taxRate = 0.17;
            taxesToPay = tax + finalTaxRate * taxRate;
            System.out.println("Tax:" + taxesToPay);
        }
    }    
}
