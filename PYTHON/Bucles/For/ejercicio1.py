"""Escribir un programa que pida al usuario un número entero positivo y muestre por pantalla todos los números impares desde 1 hasta ese número separados por comas. print(end=””) permite escribir en una línea."""

valor=int(input("Ingrese valor:"))
print("Los numeros impares son: ")
for i in range(1,valor,1):
    if (i%2!=0):
        print(i,end=",")