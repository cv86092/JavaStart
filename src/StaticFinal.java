 class TestFinal{
	int x;
	int y;
	
	TestFinal(int x , int y){
		this.x=x;
		this.y=y;
		
	}
	
	TestFinal(){
		this(11,22);
	}
	
 }	
class TestFinalthis{
		TestFinal a;
		TestFinal b;
		
		TestFinalthis(TestFinal a , TestFinal b){
			this.a = a;
			this.b = b;
			
		}

		TestFinalthis(){
			this(new TestFinal(44,42),new TestFinal(52,73));
		}
		
}
		

	

	



public class StaticFinal {
	public static void main(String[] argv){
		TestFinal a = new TestFinal();	
		TestFinalthis b = new TestFinalthis();
		//a.y =133;
		System.out.println(b.a.x);
		System.out.println(b.a.y);
		System.out.println(b.b.x);
		System.out.println(b.b.y);
	}
	

}
