package trainingday12OBJECTSLOOPwithCONDITIONS;

public class UseLaptop1 {
	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.brand="lenovo";
		l1.color="Black";
		l1.price=80000;
			
		Laptop l2 = new Laptop();
		l2.brand="Dell";
		l2.color="Red";
		l2.price=50000;
		
		Laptop l3 = new Laptop();
		l3.brand = "Acer";
		l3.color="Blue";
		l3.price=45000;
	
		
		Laptop[] l= {l1,l2,l3};
		for(int i=0;i<l.length;i++) {
			if(50000<l[i].price) {
	            l[i].tax =l[i].price*10/100;
				l[i].disAmount=l[i].price*7/100;;
				l[i].netPrice=l[i].price+l[i].tax-l[i].disAmount;
				l[i].brand=l[i].brand.toUpperCase();
				//System.out.println("NetPrice= "+l[i].netPrice+ l[i].brand+ l[i].color);
			}
			else {
				l[i].tax=l[i].price*7/100;
				l[i].disAmount=l[i].price*5/100;
				l[i].netPrice=l[i].price+l[i].tax-l[i].disAmount;
				//System.out.println("NetPrice= "+l[i].netPrice+ l[i].brand+ l[i].color);
			}
			System.out.println("NetPrice= "+l[i].netPrice+ l[i].brand+ l[i].color);
           
}
		
}
}