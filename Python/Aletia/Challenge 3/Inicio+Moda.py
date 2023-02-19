
import numpy as np 
import pandas as pd
import matplotlib.pyplot as plt


# Challenge 3

data = pd.read_csv("D:\Cursos\Aletia\Challenge3\ds_salaries.csv")


# Tamaño del dataframe
print("El tamaño del dataframe es", data.size)
# Tamaño de filas y columnas
print("El dataframe tiene las siguientes dimensiones:", data.shape)
# Primeras lineas del dataframe
print(data.head())


# Histograma de los salarios por empleo
#plt.hist(data["salary_in_usd"])

#plt.show()

#Graficar año de trabajo vs salario en dólares usd
#plt.title("Año de trabajo vs Salario en dólares USD")
#plt.bar(data["work_year"],data["salary_in_usd"])
#plt.show()

#Obtener medidas de tendencia central por columna

print("Medidas de tendencia central sobre el salario")
#Media
print("La media es")
print(data["salary_in_usd"].mean())
#Mediana
print("La mediana es")
print(data["salary_in_usd"].median())
#Moda

max = data["salary_in_usd"][0]
num_max = 0
for i in data["salary_in_usd"]:
    cont = data["salary_in_usd"][i]
    if cont > num_max:
        max = data["salary_in_usd"][i].value_counts()
        num_max = cont
print("La moda es")
print(max)


#Histograma de los salarios por empleo
plt.hist(data["salary_in_usd"])
plt.show()
plt.close()
#Graficar año de trabajo vs salario en dólares usd
plt.title("Año de trabajo vs Salario en dólares USD")
plt.bar(data["work_year"],data["salary_in_usd"])
plt.show()



