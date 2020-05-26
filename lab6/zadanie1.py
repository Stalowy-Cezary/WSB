#Zdefiniuj nastepujace zbiory

#A = {1/x: x∈<1,10}
A = [round(1/x, 2) for x in range(1,11)]
print (A)
#B = {1, 2, 4, 8, ... , 2**10}
B = [2**x for x in range(11)]
print (B)
#C = {x:x∈B i x jest liczba podzielna przez 4}
C = [x for x in B if x % 4 == 0]
print (C)
