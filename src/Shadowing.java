class IcCard{
	long id ;
	int money;
	
	void showInfo(){
		System.out.print("卡片卡號  " + id);
		System.out.println(", 餘額 " + money + "元");
		
	}
	
	
	void add(int money){
		money +=  money;
		System.out.println("加值成功, 本次加值," + money + "元");
		
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
