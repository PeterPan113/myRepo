package Package1;

import java.util.ArrayList;
import java.util.Scanner;

public class Class1 {

	public static void main(String[] args) {
		Ausgabe("AusgabeTest");
		int i = 10;
		double x = 1.1;
		String y = "Test!";
		char z = 'a';
		boolean a = true;
		int myArray[] = { 1, 3 };
		for (int j = 0; j < myArray.length; j++) {
			System.out.println(myArray[0]);
		}
		for(i=3;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print("1");
			}
			System.out.print("\n");
		}
		
		
		
		Bruch bruchObjekt = new Bruch(3,6);
		Object o = new Object();
		
		
		String zahl2String= ""+x;
		
		Scanner sc = new Scanner(System.in);
		String eingabe=sc.nextLine();
		int eingabe2int=1;
		try {
			 eingabe2int = Integer.parseInt(eingabe);
		}
		catch(RuntimeException e){
			System.out.println("Fehler..."+e);
		}
		
		ArrayList al = new ArrayList<Integer>();
		
		al.add(3);
		al.add(eingabe2int);
		
		
		Umrechnung Rechnen = new Umrechnung(eingabe2int, "bin");
		
		System.out.println("Umrechnungsoutput: "+Rechnen.dez);
		
	}

	public static void Ausgabe(String output) {
		System.out.println(output);
	}
}