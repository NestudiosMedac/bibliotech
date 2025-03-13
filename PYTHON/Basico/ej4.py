<"""Escriba un programa en Python para calcular el área de un círculo. Su programa debe aceptar el radio de un usuario. Puede suponer que el usuario solo proporciona entradas válidas."""
import math


print('Dame el radio.')
radio=float (input ('Aqui:'))

area= math.pi*radio**2

print('El area es:'+str(area))