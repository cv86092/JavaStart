class IcCard{
	long id ;
	int money;
	
	void showInfo(){
		System.out.print("�d���d��  " + id);
		System.out.println(", �l�B " + money + "��");
		
	}
	
	
	void add(int money){
		money +=  money;
		System.out.println("�[�Ȧ��\, �����[��," + money + "��");
		
	}
}



public class Shadowing {
	public static void mian(String[] argv){
		IcCard myCard = new IcCard();
		
		myCard.id = 0X336789AB;
		myCard.money  = 300;
		
		myCard.add(1000);
		myCard.showInfo();
	}

}
