package trainingday12OBJECTSLOOPwithCONDITIONS;

public class UseLaptop {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.brand="lenovo";
		l1.color="Black";
		l1.price=50000;
			
		Laptop l2 = new Laptop();
		l2.brand="Dell";
		l2.color="Red";
		l2.price=70000;
		
		Laptop l3 = new Laptop();
		l3.brand = "HP";
		l3.color="Blue";
		l3.price=60000;
		
		Laptop[] l= {l1,l2,l3};
		for(int i=0;i<l.length;i++) {
			if(l[i].price>60000) {
				l[i].disAmount=3000;
				l[i].netPrice=l[i].price-l[i].disAmount;
		System.out.println("NetPrice= "+l[i].netPrice+ l[i].brand+ l[i].color);
			}
			else {
				l[i].netPrice=l[i].price-1500;
				System.out.println("NetPrice= "+l[i].netPrice+l[i].brand+l[i].color);
		}
			//System.out.println("NetPrice= "+l[i].netPrice);	
	}
	}
}

