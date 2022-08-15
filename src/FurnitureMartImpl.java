import java.util.Scanner;

public class FurnitureMartImpl {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

       FurnitureMart object=new FurnitureMart();

       // System.out.println("Enter Furniture Usage");
        //object.furnitureUsage=scan.next();

       object.furnitureUsage="outdoor";

        System.out.println("Enter Furniture Type");
        object.furnitureType= scan.next();
        System.out.println("Enter Furniture Code");
        object.furnitureCode=scan.nextInt();
        System.out.println("Enter Furniture Colour");
        object.furnitureColour= scan.next();
        System.out.println("Enter Grade of Furniture");
        object.gradeOfFurniture=scan.next().charAt(0);
        System.out.println("Enter Furniture Price");
        object.price=scan.nextInt();

        System.out.println("Furniture Type :"+object.furnitureType);
        System.out.println("Furniture Code :"+object.furnitureCode);
        System.out.println("Furniture Colour :"+object.furnitureColour);
        System.out.println("Furniture Grade:"+object.gradeOfFurniture);
        System.out.println("Furniture Usage :"+object.furnitureUsage);
        System.out.println("Furniture Price :"+object.price);


        double TotalAmount=object.DiscountOnPurchase();
        System.out.println( "Total Amount  :"+TotalAmount);

    }

}
