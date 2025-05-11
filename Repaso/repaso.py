from apoyo import ingresar_n_textos, mostrar_mensaje, obtener_elementos, ingresar_entero
def main():
    cantidad = ingresar_entero("ingrese cantidad de nombres: ")
    nombres = ingresar_n_textos("ingres su nombre: ", cantidad)
    lista= ordenar_lista(nombres)
    mensaje = generar_mensaje (lista)
    mostrar_mensaje(mensaje)

def ordenar_lista(lista):
    nueva_lista = copia_lista(lista)
    for i in range (0, len(nueva_lista)-1):
        for j in range (i+1, len(nueva_lista)):
            if nueva_lista [j] > nueva_lista[i]:
                temp = nueva_lista [i]
                nueva_lista[i] = nueva_lista[j]
                nueva_lista[j] = temp
    return nueva_lista

def copia_lista(lista):
    nueva_lista = []
    for elemento in lista:
        nueva_lista += [elemento]
    return nueva_lista


def generar_mensaje (lista):
    mensaje = obtener_elementos(lista)
    return mensaje

main ()


