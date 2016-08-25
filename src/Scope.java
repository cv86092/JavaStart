		
public class Scope {
	public static void main(String[] argv){
//		Ttest a = new Ttest();
//		a.show();
		int x = 1;
		{
			int y  = 20;
			{
				int z = 300;
				
				System.out.println("x = " + x);
				System.out.println("lty = " + y);
				System.out.println("ltz = " + z);
				System.out.println(" ");
				
			}
			
			int z = 40;
			
			System.out.println("x = " + x);
			System.out.println("lty = " + y);
			System.out.println("ltz = " + z);
			System.out.println(" ");

		}
		
		int y = 2;
		int z = 3;
		System.out.println("x = " + x);
		System.out.println("lty = " + y);
		System.out.println("ltz = " + z);
		
		int a = 1000;
		a += a;
		System.out.println(a);
		
		
		
	}
}
