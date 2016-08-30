import java.io.*;

public class ReplaceAll {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String src;
		String pat;
		String rep;
		
		System.out.print("plz input your string");;
		src = br.readLine();
		
		System.out.print("input style");
		pat = br.readLine();
		
		System.out.print("plz input replace as :");
		rep = br.readLine();
		
		System.out.println(src.replaceAll(pat, rep));
	}

}
