package HelloWorld;

import java.util.Scanner;

public class conpilazio {
public static void main(String[] args) {
		
	Scanner esk = new Scanner(System.in);
	System.out.println("sartu lauki zuzenaren aldea");	
    float alde1 = esk.nextFloat();	
	System.out.println("sartu beste aldea");	
    float alde2 = esk.nextFloat();
    float azalera=alde2*alde1;
		System.out.println("azalera: "+azalera);

}
}