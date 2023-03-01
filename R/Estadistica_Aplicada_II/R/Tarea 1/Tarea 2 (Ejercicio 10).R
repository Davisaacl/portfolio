#Tarea 2 Ejercicio 10

#Gráfica y datos
x <- c(1.02,1.11,1.43,1.11,1.01,0.95,1.11,0.87,1.43,1.02,
       1.46,1.55,1.55,1.55,1.40,1.15,1.01,0.99,0.95,0.98)
y <- c(86.91,89.85,90.28,86.34,92.58,87.33,86.29,91.86,
       95.61,89.86,96.73,99.42,98.66,96.07,93.65,87.31,
       95.00,96.85,85.20,90.56)
plot(x,y)

#Estimadores beta0 y beta1
mediaX <- mean(x)
mediaY <- mean(y)

sxx <- sum((x-mediaX)^2)
sxy <- sum((x-mediaY)*(y-mediaY))
syy <- sum((y-mediaY)^2)

beta1 <- sxy/sxx
beta0 <- mediaY - beta1*mediaX

yAjus <- beta0 + beta1*x


#Coeficiente de determinación
R2 <- 1- ( sum((y-yAjus)^2) / syy)

#Coeficiente de determinación ajustado con grados de libertad
R2Ajus <- 1-((sum((y-yAjus)^2)/(length(y)-2))/(syy/length(y)-1))    

#Para los intervalos de confianza
#Cuantil de t 18 grados de libertad y significancia 97%
cuant <- qt(0.985,18)

#Estimación de varianza y desviación estándar
s2 <- sum((y-yAjus)^2/(length(y)-2))
s <- sqrt(s2)

#Beta1
cIzq1 <- beta1 - cuant * (s/sqrt(sxx))
cDer1 <- beta1 + cuant * (s/sqrt(sxx))

#Beta0
cIzq0 <- beta0 - cuant * (s*sqrt(1/length(x) + (mean(x))^2/sxx))
cDer0 <- beta0 + cuant * (s*sqrt(1/length(x) + (mean(x))^2/sxx))

#Prueba de hipótesis para la estadística observada T0
Tobs <- beta1/(s/sqrt(sxx))

#Otra prueba beta1<12 y beta>12 con alpha = 0.05

cuant2 <- qt(0.95,18)
Tobs2 <- (beta1 - 12)/(s/sqrt(sxx))
#Otra forma con el valor p con alpha = 0.05

p <- 1 - pt(Tobs2, 18)
