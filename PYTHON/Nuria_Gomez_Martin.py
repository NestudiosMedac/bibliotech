#Declaracion
DineroEnmaquina=0
DineroUsuario=10
Precios=[2.10, 1.10, 2.10, 3, 1.20, 0.50]
Cocacola=["3Cocacola","2Cocacola","1Cocacola"]
Palmera=["3Palmera","2Palmera","1Palmera"]
Galleta=["3Galletas","2Galletas","1Galletas"]
Sandwitch=["3Sandwitches","2Sandwitches","1Sandwitches"]
Agua=["3Agua","2Agua","1Agua"]
Chicle=["3Chicles","2Chicles","1Chicles"]
CocacolaReponer=Cocacola.copy()
PalmeraReponer=Palmera.copy()
GalletaReponer=Galleta.copy()
SandwitchReponer=Sandwitch.copy()
AguaReponer=Agua.copy()
ChicleReponer=Chicle.copy()
Maquina=[Cocacola,Palmera, Galleta, Sandwitch, Agua,Chicle]

#Funciones
def MenuGeneral():#ejecuta el menu General  
    print("Escoje una opcion: ","\n","1-. Muestra los articulos disponibles en la maquina expendedora.","\n","2-. Muestra su monedero.","\n","3-. Configuracion(solo tecnico).","\n","0-. Salir.")
    return
def MenuInterno():#ejecuta el menu Interno  
    print("Escoje una opcion: ","\n","1-. Cocacola [2,10].","\n","2-. Palmera [1,10].","\n","3-. Galletas [2,10].","\n","4-. Sandwitch.[3]","\n","5-. Agua.[1,20]","\n","6-. Chicles.[0,50]","\n","0-. Salir.")
    return
def MenuTecnico():#ejecuta el menu del Tecnico  
     print("¿Que quiere hacer?:","\n","1-.Revisar cantidades. ","\n","2-.Reponer articulos.","\n","3-.Vaciar completamente.","\n","4-.Sacar dinero.","\n","0-.Salir.")
     return
def ComprobarMonedero(DineroUsuario,x):#Comprueba que el dinero es suficiente para comprar el articulo y sino se sale
    if DineroUsuario<Precios[x]:
        print("¡Que pena! Su saldo es insuficiente")
        return  False   
    return  True   
def RestarSaldo(x):#Ejecuta la compra
   global DineroUsuario, DineroEnmaquina
   DineroUsuario=DineroUsuario-Precios[x]
   DineroEnmaquina=DineroEnmaquina+Precios[x]
   return
def Devolucion(x):#Devuelve el dinero, se usa al sacar un Articulo NO disponible
   global DineroUsuario, DineroEnmaquina
   DineroUsuario=DineroUsuario+Precios[x]
   DineroEnmaquina=DineroEnmaquina-Precios[x]
   return
def SacarArticulo(Articulo, x, NombreArticulo):#Saca un articulo si esta disponible, sino devuelve el precio
    global DineroUsuario, DineroEnmaquina
    soloUno=0
    for i in range (len(Articulo)):
        if  Articulo[i]!="":
            if soloUno==0:
                Articulo.pop(i)
                Articulo.insert(i,"")
                print("Has sacado el articulo [",NombreArticulo,"]¡Disfruta!")
                soloUno=1
                return
        
    print("No se ha podido sacar ",NombreArticulo,". Se devuelve su dinero al monedero.")
    Devolucion(x)
    soloUno=0
            
    return
def Control(PrecioID,NombreLista, NombreArticulo):#Ejecuta el resto de acciones
    global DineroUsuario
    if ComprobarMonedero(DineroUsuario,PrecioID):
        RestarSaldo(PrecioID)
        SacarArticulo(NombreLista,PrecioID, NombreArticulo)
    salirInterno=True
    return
#Funciones exclusivas del tecnico
def VaciarMaquina():#Vacia la maquina al completo
    global Maquina
    for i in range(0,len(Maquina),1):
        Maquina[i].clear()
    return
def RellenarMaquina():#Rellena la maquina al completo
    global Cocacola,Palmera, Galleta, Sandwitch, Agua,Chicle
    Cocacola=CocacolaReponer
    Palmera=PalmeraReponer
    Galleta=GalletaReponer
    Sandwitch=SandwitchReponer
    Agua=AguaReponer
    Chicle=ChicleReponer
    return
""" 
De esta forma tenia pensada hacerlo pero no puedo hacer referencia a una lista ya creada a traves de un String introducido por pantalla que no sea a traves de otro menu y ya quedaria demasiado largo...
 for j in range (len(Maquina)):
        for i in range (len(Maquina[j])):
             NombreProducto=Maquina[j]
             Maquina[j].append(NombreProducto+ str(i+1))
             Maquina[j].reverse()
"""
   
#Mesaje de bienvenida
(print("¡Hola!¿Eres un usuario(puede usar su nombre) o un tecnico?"))
tipo=str(input('Aqui: '))
print("Bienvenid@",tipo,"a la maquina expendedora!")
#Abre el menu y pide seleccion
MenuGeneral()
num=int(input('Aqui: '))

#Salida de los bucles
salirgeneral=False
salirInterno=False
salirtecnico=False

while not salirgeneral :
    if num == 1:
        while not salirInterno:
            MenuInterno()
            opcionMenu=int(input("Aqui: "))
            if opcionMenu==1:
                Control(0,Cocacola,"Cocacola")
            elif opcionMenu == 2:
                Control(1,Palmera,"Palmera")
            elif opcionMenu == 3:
                Control(2,Galleta,"Galletas")
            elif opcionMenu == 4:
                Control(3,Sandwitch,"Sandwitch")
            elif opcionMenu == 5:
                Control(4,Agua,"Agua")
            elif opcionMenu == 6:
                Control(5,Chicle,"Chicles")
            elif opcionMenu == 0:
                salirInterno=True
            else:
                print("Introduce un numero valido")
                opcionMenu=int(input("Aqui: "))
        salirInterno=False
        MenuGeneral()
        num=int(input("Aqui: "))
    elif num == 2:
        print("Tiene ",DineroUsuario," Euros")
        MenuGeneral()
        num=int(input("Aqui: "))
    elif num == 3 :
        if tipo.lower()=="tecnico":
            while not salirtecnico:
                MenuTecnico()
                opcionTecnico=(int(input("Aqui: ")))
                if opcionTecnico==1:
                    print("",Cocacola,"\n",Palmera,"\n",Galleta,"\n",Sandwitch,"\n",Agua,"\n",Chicle,"\n","Precios:",Precios)
                    salirtecnico=True
                elif opcionTecnico == 2: 
                    RellenarMaquina()
                    print("Articulos repuestos con exito")
                    salirtecnico=True
                elif opcionTecnico == 3:
                    VaciarMaquina()
                    print("Maquina vaciada con exito")
                    salirtecnico=True
                elif opcionTecnico == 4:
                    print("Fondos antiguos de la maquina:",DineroEnmaquina)
                    DineroEnmaquina=0
                    print("Fondos actuales de la maquina:",DineroEnmaquina)
                elif opcionTecnico == 0:
                    salirtecnico=True
                else:
                    print("Introduce un numero valido")
                    opcionMenu=int(input("Aqui: "))
            salirtecnico=False
            MenuGeneral()
            num=int(input("Aqui: "))
        else:
             print("No eres un tecnico, por favor pulsa 0 para salir del programa.")
             num=int(input("Aqui: "))
    elif num == 0 :
        salirgeneral=True
    else:
        print("Introduce un numero valido")
        num=int(input("Aqui: "))

print("¡Esperamos volver a verle ",tipo,"! \#^-^#/")




