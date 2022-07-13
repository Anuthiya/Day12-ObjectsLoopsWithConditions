package trainingday12OBJECTSLOOPwithCONDITIONS;

public class UseMobillength {
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
		int maxI=0;
		
		Mobilelength[] m = {m1,m2,m3};
		for(int i=0;i<m.length;i++) {
			if(max<m[i].brand.length()) {
				max = m[i].brand.length();
				maxI=i;
			}
		}
		System.out.println("The highest name length ="+m[maxI].brand.toUpperCase()+", Color="+m[maxI].color.toUpperCase()+",price="+m[maxI].price+",RAM="+m[maxI].ram);
				
				
			}
		
	}


