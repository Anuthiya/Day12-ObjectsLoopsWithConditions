package trainingday12OBJECTSLOOPwithCONDITIONS;

public class Usecar1 {
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.brand ="Maruthi";
		c1.color="Red";
		c1.price=750000;
		
		Car c2 = new Car();
		c2.brand = "TATA NANO";
		c2.color="Black";
		c2.price=450000;
		
		Car c3= new Car();
		c3.brand = "Hyundai";
		c3.color = "grey";
		c3.price = 650000;
		int low =c3.price;
		String brand1 ="";
		String color1="";
		
		
		Car[] cars = {c1,c2,c3};
	    for(int i=0;i<cars.length;i++) {
	    	if(low>cars[i].price) {
	    		low = cars[i].price;
	    		brand1=cars[i].brand;
	    		color1=cars[i].color;
	    	}
	    }
	    System.out.println("The lowest price = "+low+", BRAND = "+brand1+", Color = "+color1);
	}

}


