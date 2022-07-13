package trainingday12OBJECTSLOOPwithCONDITIONS;

public class UseEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.id=100;
		e1.name="John";
		e1.age=25;
		e1.gender="male";
		e1.salary=45000;
		
		Employee e2 = new Employee();
		e2.id=101;
		e2.name="Malar";
		e2.age=30;
		e2.gender="female";
		e2.salary=20000;
		
		Employee e3=new Employee();
		e3.id=103;
		e3.name="Natraj";
		e3.age=25;
		e3.gender="male";
		e2.salary=25000;
		
		Employee e4 = new Employee();
		e4.id=104;
		e4.name="Monu";
		e4.age=27;
		e4.gender="Female";
		e4.salary = 29000;
		
		Employee e5=new Employee();
		e5.id = 105;
		e5.name="Sarath";
		e5.age=32;
		e5.gender="male";
		e5.salary=30000;
		
		Employee e6 = new Employee();
		e6.id=106;
		e6.name="Nicky";
		e6.age = 28;
		e6.gender="Female";
		e6.salary=32000;
		
		int max =0;
		int maxI =0;
		
		Employee[] e= {e1,e2,e3,e4,e5,e6};
		for(int i=0;i<e.length;i++) {
			//if(e[i].salary>20000)
				//System.out.println(e[i].name.toUpperCase());
			if(max<e[i].salary) {
				max=e[i].salary;
				maxI=i;
				//emp=emp[i];
				//for(Employee i=e)
				//if(i.name)
			}
		}
				System.out.println("id = "+e[maxI].id+"name = "+e[maxI].name+"age="+e[maxI].age+"gender="+e[maxI].gender+"Salary="+e[maxI].salary);
			}
		}
		
		


