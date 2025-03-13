frase=input ("Introduce una frase: ").lower()

vocales="a,e,i,o,u"
veces=0

for i in frase:
     if(i in vocales):
          veces+=1
print("Tiene",veces,"vocales")
