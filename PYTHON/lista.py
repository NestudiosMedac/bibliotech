import array
from re import L


a=[10,"Python", 3.97]
print(a)
print(a[0])
print(a[1])
print(a[2])
print(a[-1])#Equivalente al .lengh-1, tamb se puede -2 etc...



#for i in range(0,lista,1):  
 
 
    #lista=lista+[n]
    #lista.append[n]#es un metodo de python para añadir, hay mas en el Aula Virtual en la documentacion
    #lista2=a.copy()#y se copia

suma=0
promedio=0
lista=[10,5]
for i in lista:
    suma=suma+i
promedio=suma/2
print("La suma es ",suma," la media es ",promedio)

#lista al reves
lista.reverse()
print(lista)

#añadir 9
lista.append(9)
#ordenar
lista.sort(reverse=True)
print(lista)