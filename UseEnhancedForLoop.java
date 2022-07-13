package trainingday12OBJECTSLOOPwithCONDITIONS;

public class UseEnhancedForLoop {
	public static void main(String[] args) {
		EnhancedForLoop p1= new EnhancedForLoop();
		p1.brand="Apsara";
		p1.color="Black";
		p1.price=10;
		
		EnhancedForLoop p2 = new EnhancedForLoop();
		p2.brand="Natraj";
		p2.color="White";
		p2.price=15;
		
		EnhancedForLoop p3=new EnhancedForLoop();
		p3.brand="Cello";
		p3.color="Red";
		p3.price=5;
		
		EnhancedForLoop[] m= {p1,p2,p3};
		for(EnhancedForLoop i:m) {
			System.out.println(i.brand);
		}
			
		}

}
