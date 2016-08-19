class Ttest{
	int  x ;
	int  y ;
	
	Ttest(int intx){
		x=  intx;
		
	}
	
	Ttest(){
		
		
	}
	
	
	void show(){
		System.out.println("x=" +x);
		System.out.println("y=" +y);
		
	}
}


public class Overloading {

	public static void mian(String[] argv){
		Ttest a = new Ttest();
		a.show();
		
	}

}
