"""Escriba un programa que solicite al usuario que ingrese el ancho y el largo de una habitación. Una vez que se hayan leído estos valores, su programa debe calcular y mostrar el área de la habitación. El largo y el ancho se ingresarán como números de coma flotante."""


print('Dame un lado.')
lado2=float (input ('Aqui:'))
print('Dame el otro lado.')
lado1=float (input ('Aqui:'))

area= lado2*lado1

print('El area es:'+str(area))