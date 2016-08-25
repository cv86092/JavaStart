



class TestOverloading{
	int x=4;
//	int y=3;
	int y;
	TestOverloading(){
		
	}
	TestOverloading(int xint){
		this.x = 10;

	}	
	void show(int x){
		System.out.println(x+ " " + y);
	}
}

public class Overloading {
	public static void main(String[] argv){
		int x =11;
		TestOverloading a = new TestOverloading(9);
		a.show(x);
	} 
}
