

public class FurnitureMart {

   // Attribute
    int furnitureCode;
    String furnitureType;
    char gradeOfFurniture;
    String furnitureColour;
    String furnitureUsage;

    long price;
    FurnitureMart(){
        furnitureCode=0;
        furnitureType=" ";
        gradeOfFurniture='\u0000';
        furnitureColour=" ";
        furnitureUsage=" ";
        price= 0L;

    }
    public double DiscountOnPurchase(){
            String Usage="outdoor";
        if(furnitureUsage==Usage) {
            return price - ((price * 5) / 100);
        }
        else
            return price;
    }
}
