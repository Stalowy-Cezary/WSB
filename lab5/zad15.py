#  zad15, napisz skrypt, w ktorym uzytkownik ma podac liczbe
#  i ktory bedzie wylapywal blad gry uzytkownik poda litere zamiast cyrfy
licz1=input()
try:
    licz1 = int(licz1)
except:
    print('Wpisano nieprawidlowe znaki')
        
