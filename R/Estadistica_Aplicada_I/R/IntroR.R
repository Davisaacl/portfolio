3 + 5
4 - 3

#3 + 4 esto es un comentario
3 + 4 esto es un comentario

#Las operaciones usuales
3 + 2 * log(7) + exp(2) + log(7, base = 2)
pi

#vectores
vector1 <- c(2, 4, 1, 5, 3)
vector1
vector1 + 1
vector1[2] #Los arrays empiezan en 1, no en cero

#Forma de borrar el vector
rm(vector1)

#Matrices (son números)
A <- matrix(c(1,2,3,4), ncol = 2)
A
B <- matrix(c(5,6,7,8), ncol = 2)
B
rm(b)

#La multiplicación de matrices está definida entrada por entrada (NO COMO EN ÁLGEBRA LINEAL)
A * B 

#Multiplicación como definida en Álgebra Lineal (Como Friedberg)
A %*% B

A + 3

#Formas rápidas de generar un vector
1:10
seq(4, 5, length.out = 100)

# Simulación de variables
# Siempre empiezan con r

# Pedir ayuda ?rnorm
?rnorm #Ayuda para la distribución normal

rnorm(100) #Simula una normal estándar
set.seed(8) # Que todos tengamos el mismo número aleatorio
x <- rnorm(100)
x
set.seed(8)
x <- rnorm(100)
x

#Forma rápida de histograma
hist(x)


rm(x)
x <- rnorm(100)
x
hist(x)
hist(rnorm(1000))

# Estadísticas de resumen
summary(x)
median(x)
mean(x)
var(x)
sum(x) #La suma de todos


#Guardar variables
x <- rnorm(100, mean = 1, sd = 2)
y <- rnorm(100, mean = -1, sd = 0.4)
z <- sample(c("Red","Blue"), 100, replace = TRUE)
z

datos <- data.frame(x, y, z)

#El directorio es donde guardas tus datos
setwd("~/Escuela/ITAM/Estadística Aplicada I/R")
save(datos, file = "Datos1.Rda")
save(datos, A, B, file = "DatosyMatrices.Rda")

#Borrar todo
rm(list = ls())

#Cargar datos
load("DatosyMatrices.Rda")


3 == 3 # Pregunta si es verdad
x <- 3 # Asignar el valor 3
x == 3 # Pregunta si x == 3
x > 6
x <= 10

(0.1 + 0.1 + 0.1) == 0.3 #TRUE #Problemas de representación de números
0.1
options(digits = 22)
0.1
options(digits = 6)

#Instalar paquetes
install.packages("beepr")
beep(2)
library(beepr)
beep(3)


#Para hacer gráficas necesitamos otro paquete
install.packages("ggplot2") #Se hace una vez en la vida
library(ggplot2)

# REVISAR EJEMPLOS
Example1 <- read.csv("C:/Users/david/Downloads/Example1.csv")

ggplot() + geom_point(aes(x = Alturas, y = Peso), data = Example1) + ggtitle("Puntos bonitos") +
    xlab("Altura (metros)") + ylab("Peso (kilogramos)") + theme_classic()


ggplot() + geom_point(aes(x = Alturas, y = Peso), data = Example1, color = "tomato3", size = 5)


ggplot() + geom_histogram(aes(x = Alturas, y = ..density..), data = Example1, color = "blue", fill = "orange", 
    bins = 25) + geom_density(aes(x = Alturas), data = Example1, size = 2)

#Voy a comparar esto contra una normal real
x      <- seq(-2, 2, length.out=100)
y      <- dnorm(x)
sim_x <-rnorm(500)
datos  - data.frame(x, y)

ggplot() + geom_line(aes(x = x, y = y), data = Example1) + geom_density(aes(x = sim_x), color = "red")
