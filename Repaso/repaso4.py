from apoyo import ingresar_texto, mostrar_mensaje, obtener_elementos

def main():
    numeros = ingresar_texto ("ingrese los numeros: ")
    ordenar = ordenar_numeros (numeros)
    mensaje = generar_mensaje (ordenar)
    mostrar_mensaje(mensaje)

def ordenar_numeros (numeros):
    orden = sorted(numeros, reverse = True)
    return orden

def generar_mensaje(ordenar):
    mensaje = f"Numenros en desendente son \n"
    mensaje += obtener_elementos (ordenar)
    return mensaje


main()