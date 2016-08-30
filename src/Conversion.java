class ConversionTest{
	public int toInt(){
		return 123;
	}
}
public class Conversion {
	public static void main(String[] argv){
		
		ConversionTest t = new ConversionTest();
		String a ="this is number";
		int b = 1;
//		System.out.println(a + t.toString());
//		System.out.println(b+t.toInt());
		String d ="這是一個測試字串";
		char[] chars = new char[4];
		char[] charsb = new char[4];
		char[] charss = new char[4];
		d.getChars(1, 5, charss, 0);
		System.out.println(new String(chars));
		System.out.println(charss);
		StringBuffer c = new StringBuffer(a);
		System.out.println(c.append(20));
		
	}

}
