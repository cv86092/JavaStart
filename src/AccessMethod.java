class accessTest{
	private int x;
	public static int y=200;
	 static{
		 int y =99;
	}
	public accessTest(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	public int getX(){return x;}
	public  void setX(int x){this.x = x;}
	public int getY(){return y;}
	public void setY(int y ){this.y = y;}
}
public class AccessMethod {
	public static void main(String[] argv){
		accessTest a =  new accessTest(30,40);
		accessTest b = new accessTest(30,100);
		
		a.setX(80);
		a.y =100;
		a.setY(80);
		b.setY(100);
		
		System.out.println("x=" + a.getX());
		System.out.println("y=" + a.getY());
		System.out.println("y=" + a.getY());
		System.out.println(a.getX()+a.getY());
		System.out.println(accessTest.y);

	}

}
