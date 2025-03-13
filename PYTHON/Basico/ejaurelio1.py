"""Escribe un programa en Python que solicite al usuario ingresar un número entero. 
El programa debe determinar si el número es par o impar e imprimir un mensaje correspondiente.
Adicionalmente, si el número es divisible por 4, el programa debe imprimir un mensaje 
adicional indicando que el número es también divisible por 4."""

print('Introduce un numero: ')
num= float (input('Aquí: '))

if num%2==0 :
    print('El numero es par')
    if 4>=num and num%4==0 :
        print ('Es divisible entre 4')
else:
    print('El numero es impar')

nombre= str ("patata")
nombre= nombre.lower()
if [len(nombre)-1]== "a" or "e" or "i" or"o" or"u" :

