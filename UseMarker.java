package trainingday12OBJECTSLOOPwithCONDITIONS;

public class UseMarker {
	public static void main(String[] args) {
		Marker p1= new Marker();
		p1.brand="Apsara";
		p1.color="Black";
		p1.price=10;
		
		Marker p2 = new Marker();
		p2.brand="Natraj";
		p2.color="White";
		p2.price=15;
		
		Marker p3=new Marker();
		p3.brand="Cello";
		p3.color="Red";
		p3.price=5;
		
		Marker[] m= {p1,p2,p3};
		for(int i=0;i<m.length;i++) {
			//if(m[i].brand.startsWith("A")) {
			if(m[i].brand.endsWith("j")) {
				
				System.out.println(m[i].brand);
			}
		}
	}
	

}
