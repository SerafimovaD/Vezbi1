import java.util.Scanner;

public class Smetka {

	public static void main(String[] args) {
		// jabolki - 50 den kg, krusi - 60 den kg, grozje - 100 den kg
		double smetka=0;
		System.out.print("Vnesi sto si pazaril vo kilogrami:");
		Scanner tastatura=new Scanner(System.in);
		System.out.print("Jabolki");
		double jabolki=tastatura.nextDouble ();
		System.out.print("Krusi");
		double krusi=tastatura.nextDouble ();
		System.out.print("Grozje");
		double grozje=tastatura.nextDouble ();
		smetka=jabolki*50+krusi*60+grozje*100;
		System.out.print("Smetkata iznesuva "+smetka+" denari");
		}

}
