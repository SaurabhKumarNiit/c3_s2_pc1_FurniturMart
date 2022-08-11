import java.util.Scanner;

public class FurnitureMartImpl {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        FurnitureMart object=new FurnitureMart();
        object.price=1000;
        object.furnitureType="table";
        object.furnitureColour="red";
        object.furnitureCode=1234;
        object.furnitureUsage="outdoor";
        object.gradeOfFurniture='A';

        System.out.println("Furniture Code :"+object.furnitureCode);
        System.out.println("Furniture Type :"+object.furnitureType);
        System.out.println("Furniture Colour :"+object.furnitureColour);
        System.out.println("Furniture Grade:"+object.gradeOfFurniture);
        System.out.println("Furniture Usage :"+object.furnitureUsage);
        System.out.println("Furniture Price :"+object.price);


        double TotalAmount=object.DiscountOnPurchase();
        System.out.println( "Total Amount  :"+TotalAmount);

    }

}
