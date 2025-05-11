def ingresar_real(mensaje):
    repetir = True
    while repetir:
        try:
            valor = float(input(mensaje))
            repetir = False
        except:
            print("no es una entrada valida para un numero real")
    return valor



def ingresar_entero(mensaje):
    repetir = True
    while repetir:
        try:
            valor = int(input(mensaje))
            repetir = False
        except:
            print("no es una entrada valida para un numero entero")
    return valor



def ingresar_real_rango(mensaje, valor_minimo, valor_maximo):
    repetir = True
    while repetir:
        valor = ingresar_real(mensaje)
        if valor < valor_minimo or valor > valor_maximo:
            print(f"el valor no esta entre {valor_minimo}, y {valor_maximo}")
        else:
            repetir = False
    return valor



def ingresar_entero_rango(mensaje, valor_minimo, valor_maximo):
    repetir = True
    while repetir:
        valor = ingresar_entero(mensaje)
        if valor < valor_minimo or valor > valor_maximo:
            print(f"el valor no esta entre {valor_minimo}, y {valor_maximo}")
        else:
            repetir = False
    return valor



def ingresar_entero_mayor_que(mensaje, valor_minimo):
    repetir = True
    while repetir:
        valor = ingresar_entero(mensaje)
        if valor <= valor_minimo:
            print(f"El valor no es mayor que {valor_minimo}")
        else:
            repetir = False
    return valor 



def ingresar_real_mayor_que(mensaje, valor_minimo):
    repetir = True
    while repetir:
        valor = ingresar_real(mensaje)
        if valor <= valor_minimo:
            print(f"El valor no es mayor que {valor_minimo}")
        else:
            repetir = False
    return valor 



def mostrar_mensaje(mensaje):
    print (mensaje)



def repetir_caracter(caracter, cantidad):
    mensaje =""
    for i in range (0, cantidad):
        mensaje += caracter
    return mensaje



def ingresar_texto(mensaje):
    texto=input(mensaje)
    return texto



def ingresar_n_textos(mensaje, cantidad):
    textos= [""]*cantidad
    for i in range(0, len(textos)):
        textos[i] = ingresar_texto (f"{mensaje} {i+1} de {cantidad}: ")
    return textos



def ingresar_n_real_rango(mensaje, cantidad,valor_min, valor_max ):
    valores= [0.0]*cantidad
    for i in range(0, len(valores)):
        valores[i] = ingresar_real_rango (f"{mensaje} {i+1} de {cantidad}: ",valor_min, valor_max)
    return valores



def ingresar_n_entero_rango(mensaje, cantidad,valor_min, valor_max ):
    valores= [0.0]*cantidad
    for i in range(0, len(valores)):
        valores[i] = ingresar_entero_rango (f"{mensaje} {i+1} de {cantidad}: ",valor_min, valor_max)
    return valores



def obtener_indices_mayores_iguales_que(lista_valores, valor_referencia):
    indices = []
    for i in range(0, len(lista_valores)):
        if lista_valores[i] >= valor_referencia:
            indices += [i]
    return indices
    


def obtener_indices_menores_iguales_que(lista_valores, valor_referencia):
    indices = []
    for i in range(0, len(lista_valores)):
        if lista_valores[i] < valor_referencia:
            indices += [i]
    return indices



def obtener_elementos(lista):
    mensaje = ""
    for elementos in lista: 
        mensaje += f"{elementos}\n"
    return mensaje



def obtener_elementos_indices(lista, indice):
    mensaje = ""
    for i in indice:
        mensaje += f"{lista[i]}\n"
    return mensaje