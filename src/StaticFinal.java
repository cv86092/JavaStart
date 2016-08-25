 class TestFinal{
	int x;
	static final int y;

	static{
		  y = 199;
	}
	TestFinal(int x){
		this.x = x;
		//this.y = y;
	}
	TestFinal(){
		
	}
	

	
}


public class StaticFinal {
	public static void main(String[] argv){
		TestFinal a = new TestFinal(1);	
		//a.y =133;
		System.out.println(a.x);
		System.out.println(a.y);
	}
	

}
