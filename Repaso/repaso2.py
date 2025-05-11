numeros = [1,2,2,3,4,5,5,6,7]

repetidos = []
provi = []
 
for n in numeros:
    if n not in provi:
        provi.append(n)
    else:
        repetidos.append(n)
print (repetidos)
