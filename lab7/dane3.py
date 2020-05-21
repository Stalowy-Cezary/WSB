with open('slowa.txt', 'w') as plik:
    for i in range(3):
        plik.write(input()+'\n')
with open('slowa.txt', 'r') as plik:
     print (plik.read())