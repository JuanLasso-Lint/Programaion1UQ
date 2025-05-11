from apoyo import ingresar_entero_rango, mostrar_mensaje

MIN_VALOR_TABLA = 0
MAX_VALOR_TABLA = 10
MIN_TABLA = 0
MAX_TABLA = 20

def main():
    numero_tabla = ingresar_entero_rango("ingrese la tabla:  ", MIN_TABLA, MAX_TABLA)
    tabla = generar_tabla(numero_tabla, MIN_VALOR_TABLA,MAX_VALOR_TABLA)
    mostrar_mensaje(tabla)

def generar_tabla(numero_tabla, min_valor_tabla, max_valor_tabla):
    tabla = f"\n TABLA DE MULTIPLICAR DE {numero_tabla}\n\n"
    for i in range (min_valor_tabla, max_valor_tabla+1):
        producto = numero_tabla * i
        tabla += f"{numero_tabla:2d} x {i:2d} = {producto:3d}\n"
    return tabla

main()