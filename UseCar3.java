package trainingday12OBJECTSLOOPwithCONDITIONS;

public class UseCar3 {
	public static void main(String[] args) {
		Mobilelength m1 = new Mobilelength();
		m1.brand="Samsung";
		m1.color="Pink";
		m1.price=10000;
		m1.ram = "8GB";
		
		Mobilelength m2=new Mobilelength();
		m2.brand="Vivo";
		m2.color="White";
		m2.price=15000;
		m2.ram = "4GB";
		
		Mobilelength m3=new Mobilelength();
		m3.brand="Honor";
		m3.color="Black";
		m3.price=20000;
		m3.ram= "16GB";
		int max=0;
		int min=m2.price;
	
		String brand1=" ";
		String color1=" ";
		String brand2=" ";
		String  color2=" ";
		
		Mobilelength[] m = {m1,m2,m3};
		for(int i=0;i<m.length;i++) {
			if(max<m[i].price) {
				//max=m[i].price;
				//brand1=m[i].brand.toUpperCase();
				//color1=m[i].color.toUpperCase();
				//System.out.println("Price= "+m[i].price+", Brand="+m[i].brand+", color= "+m[i].color);
				
			
			//else if(min>m[i].price) {
				//min=m[i].price;
				//brand2=m[i].brand.toLowerCase();
				//color2=m[i].color.toLowerCase();
			//else {
				//System.out.println("Price= "+m[i].price+", Brand="+m[i].brand+", color= "+m[i].color);
		}	

		System.out.println("Price= "+m[i].price+", Brand="+m[i].brand+", color= "+m[i].color);
		//System.out.println("The highest price= "+max+", Brand="+brand1+", color= "+color1);
			//System.out.println("The lowest price= "+min+", Brand="+brand2+", color="+color2);
			
		}	
				
}
}


