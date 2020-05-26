#Zdefiniuj funkcje, ktora swraca sume dowolnego ciagu arytmetycznego,
#ponadto niech funkcja przyjmuje wartosci domyslne a1=1, r=1, ile=10

def ciag(a1=1,r=1,ile=10):
    return (a1+(a1+r*(ile-1)))/2*ile
print (ciag())
