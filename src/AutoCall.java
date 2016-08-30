class Father{
	public static  int x =100 ;
	public int y ;
	Father(int x, int y){
		this.x = x;
		this.y = y;
	}
	Father(){
		
	}
	
}

class Children extends Father{
	int h ;
	
	 Children(int x , int y, int h){
		super(x,y);
		this.x = x;
		this.h = h;
	}
	 
	 Children(){

	}
	
	
}


public class AutoCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father a = new Father();
		Children b = new Children(1,2,3);
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.h);
		//System.out.println(Father.x);



		//System.out.println(Father.x);
	}

}
