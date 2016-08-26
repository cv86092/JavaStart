class Point{
	public int x,y;
	public Point(int x, int  y){
		this.x =x;
		this.y =y;
	}
}

class Rectangle{
	Point upperleft;
	Point lowerright;
	
	public Rectangle(Point upperleft,Point lowerright){
		this.upperleft = upperleft;
		this.lowerright = lowerright;
	}
	
	public Rectangle(){
		this(new Point(0,0),new Point(5,-5));
	}
	
	public Rectangle(int x1,int y1,int x2,int y2){
		this(new Point(x1,y1),new Point(x2,y2));
	}
	
	public Rectangle(Point upperleft,int length){
		this(upperleft,new Point(upperleft.x + length,upperleft.y - length));
	}
	
	public int area(){
			return (lowerright.x - upperleft.x) * (upperleft.y - lowerright.y);
	}
	
}



public class OverloadConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle a = new Rectangle(0,0,5,-5);
		Rectangle b = new Rectangle(new Point(3,3),4);
		Rectangle c = new Rectangle();
		System.out.println("a area :"+ a.area());
		System.out.println("b area :"+ b.area());
		System.out.print("c area :"+ c.area());


	}

}
