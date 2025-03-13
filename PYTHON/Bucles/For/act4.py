negativos=0
positivos=0
multiplos_5=0
pares=0
for i in range(1,9,1):
    """hay 8 numeros"""
    valor=int(input("Introduce un numero: "))
    if valor<0:
        negativos+=1
    elif valor<0:
        positivos+=1
    if valor %15==0:
     multiplos_5+=1
    if valor %2==0:
     pares+=1

print("Hay",negativos,"negativos")
print("Hay",positivos,"positivos")
print("Hay",multiplos_5,"multiplos de 5")
print("Hay",pares,"pares")