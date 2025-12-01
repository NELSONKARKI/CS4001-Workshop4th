import java.util.Scanner;

class SellingPrice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marked Price: ");
        double mp = sc.nextDouble();

        System.out.print("Enter Category (A/B/C/D): ");
        String cat = sc.next();    // taking the whole string

        double discountRate;

        switch (cat) {     // directly switching on the string
            case "A":
                discountRate = 0.60;
                break;
            case "B":
                discountRate = 0.40;
                break;
            case "C":
                discountRate = 0.20;
                break;
            case "D":
                discountRate = 0.10;
                break;
            default:
                System.out.println("Invalid Category!");
                return;
        }

        double sp = mp - (mp * discountRate);

        System.out.println("Discount: " + (discountRate * 100) + "%");
        System.out.println("Selling Price: Rs. " + sp);
    }
}
