#  zad10, napisz skrypt, ktory rysuje wieze z literek.
#  Uzytkownik podaje wysokosc wiezy ale nie wiecej jak niz 10
z = int(input('Podaj liczbe od 1 do 10: '))
if 0<z<=10:
    for x in range(0, z+1):
         print(x*'A')
else:
    print ('nieprawidlowa liczba')