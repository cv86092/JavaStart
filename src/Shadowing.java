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
	
	void addthis(int moneyRef){
		int money= moneyRef;
		this.money +=  money;
		System.out.println("�[�Ȧ��\, �����[�� moneyRef," + moneyRef + "��");
		System.out.println("�[�Ȧ��\, �����[��,addthis money" + money + "��");		
		System.out.println("�[�Ȧ��\, �����[��," + this.money + "��");
		
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