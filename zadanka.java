import java.util.Scanner;
public class Zadanie6 {
public static void main(String[] args)
{
int zycie = 5;
String haslo = "polska"; //okreslam haslo do wisielca
char[] tablicaHaslo = haslo.toCharArray(); //zmieniam haslo na tablice znakow
for(;;)
{
	Scanner scan = new Scanner(System.in);
	String litera = scan.nextLine();  // zgaduje literke
	//vvvv jesli wpisuje literke ktora pasuje, dostaje odpowiedz na ktorym jest miejscu
	if(haslo.equals(litera))  
	{
		System.out.println("zwyciestwo!");
		break;
	}
	//vvvv sprawdzam kolejnosc literki
	else if(haslo.contains(litera))
	{
		System.out.println(litera+" jest na "+(haslo.indexOf(litera)+1)+" miejscu"); 
	}
	//vvvv jesli pomyle sie 5 razy przegrywam
	else
	{
		zycie--;
		System.out.println("Zostalo "+(zycie)+" zyc");
		if(zycie==0)
		{
			System.out.println("Przegrales");
			break;
		}
	
	}
}
}
}
