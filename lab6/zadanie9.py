#Zdefiniuj funkcje, ktora swraca iloczyn dowolnego ciagu arytmetycznego,
#ponadto niech funkcja przyjmuje wartosci domyslne a1=1, r=1, ile=10

def ciag(a1=1,r=1,ile=10):
    x=a1
    for i in range(a1+r,a1+(ile*r),r):
        x=x*i
    return x
print (ciag())
