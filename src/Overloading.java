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

	 }
	 
	 static void hellocat(){
		 System.out.println("hello every cat");
	 }
	 
 }