
	 class SUM{
		 
		 int score=100;
		 int rank;
		 
			static void countSUM(){
				
				 System.out.println("countSUMmethod");
				 
				 
			 }
		 

		
	}


public class FirstJava {
	

	
	public static void main(String[] args){
	
			
		int[] students;
		students = new int[10];
		
		SUM studentA = new SUM();
		
		for(int n : students){
			
			students[n] = (int)(Math.random()*42+1);
			System.out.println(students[n]);
			
			
			
			System.out.println("studentA's score is :" + studentA.score);
			

		
		}

		
		studentA.countSUM();
		


		
		
	}
	
	


}
