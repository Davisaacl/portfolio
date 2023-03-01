# Tarea 1 Aplicada 2

x <- c(5.5,4.8,4.7,3.9,4.5,6.2,6.0,5.2,4.7,4.3,
      4.9,5.4,5.0,6.3,4.6,4.3,5.0,5.9,4.1,4.7)
y <- c(3.1,2.3,3.0,1.9,2.5,3.7,3.4,2.6,2.8,1.6,
       2.0,2.9,2.3,3.2,1.8,1.4,2.0,3.8,2.2,1.5)
plot(x,y)
fit<-lm(y~x)

#Estimador de beta_1
sxy <- sum((x-mean(x))*(y-mean(y)))
sxx <- sum((x-mean(x))^2)
beta1 <- sxy/sxx
#Estimado de beta_0
beta0 <- mean(y) - (beta1*mean(x))

#Regresión ajustada
yAjus <- beta0 + beta1*x

#Residuos
e <- y-yAjus
plot(y,e)

.#Estimación de varianza y desviación estándar
s2 <- sum((y-yAjus)^2/(length(y)-2))
s <- sqrt(s2)

#Errores estándar de beta0 y beta1
errEstBeta0 <- s * sqrt( ((1/length(x))*sum(x^2))/sxx  )
errEstBeta1 <- s/sxy

#Estadística observada
T0 <- (beta1)/(s/sqrt(sxx))
#Cuantil de t con n-2 grados de libertad y alpha=0.05
cuant <- qt(0.975,18)

#Para los intervalos de confianza de beta0, beta1, sigma
#beta1
cIzq1 <- beta1 - cuant * (s/sqrt(sxx))
cDer1 <- beta1 + cuant * (s/sqrt(sxx))

#beta0
cIzq0 <- beta0 - cuant * (s*sqrt(1/length(x) + (mean(x))^2/sxx))
cDer0 <- beta0 + cuant * (s*sqrt(1/length(x) + (mean(x))^2/sxx))

#sigma
cIzqS <- sqrt(((length(x)-2)*s)/(qchisq(0.975,18)))
cDerS <- sqrt(((length(x)-2)*s)/(qchisq(0.025,18)))
