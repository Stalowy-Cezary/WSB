import java.util.Scanner;
import java.util.Random;

public class Zadanie {	
static void bitwa(int e1z, int e1a, int d1z, int d1a) {
	while (e1z > 0 && d1z > 0)
	{
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Twoje zdrowie: " + e1z + " vs " + "Zdrowie wroga: " + d1z );
		e1z = e1z - d1a;
		d1z = d1z - e1a;
	}
	if (e1z > d1z)
		System.out.println("Wygrywasz!");
	else 
		System.out.println("przegrywasz!");
}
static 	int Los(int n) {
		Random random = new Random();
		int a = random.nextInt(n);
		if (a == 0)
			a = 1;
		return a;
	}
static void open() {
		System.out.println("Program pozwala przeprowadzic symulacje walki 2 bohaterow i ocenic ktory wygra");
		System.out.println("Atak odpowiada ilosci obrazen zadanych przeciwnikowi z kazdym atakiem");
		System.out.println("Pierwsza postac ktorej zdrowie spadnie do 0, przegrywa");
	}
public static void main(String[] args) {
			open();
			int zdrowie, atak, zwinnosc;
			Scanner scan = new Scanner(System.in);
			System.out.println("Wpisz statystyki!: ");
			System.out.println("Zdrowie: ");
			zdrowie = scan.nextInt();
			if (zdrowie > 999)
				zdrowie = 999;
			if (zdrowie < 1)
				zdrowie = 1;
			System.out.println("Atak: ");
			atak = scan.nextInt();
			if (atak > 99)
				atak = 99;
			if (atak < 1)
				atak = 1;
			System.out.println("Zwinnosc: ");
			zwinnosc = scan.nextInt();
			if (zwinnosc > 9)
				zwinnosc = 9;
			if (zwinnosc < 0)
				zwinnosc = 0;
			Elf e1 = new Elf(zdrowie, atak, zwinnosc);
			e1.atak = atak + zwinnosc*4;
			Postac d1 = new Postac(zdrowie, atak);
			d1.zdrowie = zdrowie+Los(99);
			d1.atak = atak+16;
			bitwa(e1.zdrowie, e1.atak, d1.zdrowie, d1.atak);		
}
}
