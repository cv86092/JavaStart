
 class Overloading{
	 public static void main(String[] argv){
		 System.out.println("123");
		 
		 showDog a = new showDog(1,"lucky");
		 a.showDog();
		 showDog.hellocat();
		 a.hellocat();

		 
	 }
 }
 
 class showDog{
	 String dog;
	 String cat;
	 
	 showDog(){
		 
	 }
	 
	 showDog(String dogref){
		 this.dog=dogref;
		 
	 }
	 
	 showDog(int i,String catref){
		 this.cat=catref;
	 }
	 
	 void showDog(){
		 System.out.println(dog);
		 System.out.println(cat);




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
=======
	 }
	 
	 static void hellocat(){
		 System.out.println("hello every cat");
	 }
	 
 }
>>>>>>> origin/master
