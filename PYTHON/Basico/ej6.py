"""En muchas ciudades, se agrega un pequeño depósito de dinero a los envases de bebidas para animar a las personas a reciclarlos. Menos de un litro 0.10 y más de un litro 0.25.

Escriba un programa que lea el número de contenedores de cada tamaño del usuario. Su programa debe continuar calculando y mostrando el reembolso que se recibirá por devolver esos contenedores. Formatee la salida para que incluya el signo de euro y dos dígitos a la derecha del punto decimal."""

print('Cuantas botellas has introducido de menos de un litro 0.10?')
menos=float (input ('Aqui:'))
print('Cuantas botellas has introducido de menos de un 0.25?')
mas=float (input ('Aqui:'))

op1= menos*0.10
op2=mas*0.25

res=op1+op2

print("Su reembolso es de "+str(res)+" €")