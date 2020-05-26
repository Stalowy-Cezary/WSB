#Wygeneruj losowo macierz 4x4 i definiuj liste, ktora bedzie zawierala
#tylko elementy znajdujace sie na przekatnej

from random import randint
macierz = [[randint(0,9) for i in range(4)] for i in range(4)]
print ([macierz[i][i] for i in range(4)])
