lista = []
with open('liczby.txt', 'w') as plik:
    for i in range(101):
        if i%4 == 0:
            lista.append(i)
    plik.writelines(str(lista))
    


        

            