package HelloWorld;

import java.util.Scanner;

public class PzerobatZerohiru {
	public static void main(String[] args) {
		Scanner esk = new Scanner(System.in);
		System.out.println("sartu adina");
		int adina = esk.nextInt();
		System.out.println("sartu ikasketa maila");
		int ikasketen_maila = esk.nextInt();
		System.out.println("sartu dirusarrera");
		int diruSarrera = esk.nextInt();
	 boolean emaitza;
	 emaitza= adina <= 28 && ikasketen_maila>3 && diruSarrera>28000; 
	 if(emaitza==true)
	 {System.out.println("egia da" );}
	 else
	 {System.out.println("gezurra da" );}

}
}