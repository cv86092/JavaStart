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
	
	void addthis(int moneyRef){
		int money= moneyRef;
		this.money +=  money;
		System.out.println("加值成功, 本次加值 moneyRef," + moneyRef + "元");
		System.out.println("加值成功, 本次加值,addthis money" + money + "元");		
		System.out.println("加值成功, 本次加值," + this.money + "元");
		
	}
}

class Shadowing{
	public static void  main(String[] argv){
		IcCard myCard = new IcCard();
		
		myCard.id = 0X336789AB;
		myCard.money  = 300;
		
		myCard.addthis(1000);
		//myCard.showInfo();
		
		int a=1;int b=2;
		
			a+=b;
			System.out.println("a="+a+" b="+b);
	}
}