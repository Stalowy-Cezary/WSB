package zadania;
import java.util.Scanner;
public class zadanka {
public static void main(String[] args)
{
int zycie = 5;
String haslo = "polska"; //okreslam haslo do wisielca
char[] tablicaHaslo = haslo.toCharArray(); //zmieniam haslo na tablice znakow
for(;;)
{
	Scanner litera = new Scanner(System.in);
	String litera1 = litera.nextLine();  // zgaduje literke
	//vvvv jesli wpisuje literke ktora pasuje, dostaje odpowiedz na ktorym jest miejscu
	if(haslo.equals(litera1))  
	{
		System.out.println("zwyciestwo!");
		break;
	}
	//vvvv sprawdzam kolejnosc literki
	else if(haslo.contains(litera1))
		{
		System.out.println(litera1+" jest na "+(haslo.indexOf(litera1)+1)+" miejscu"); 
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
