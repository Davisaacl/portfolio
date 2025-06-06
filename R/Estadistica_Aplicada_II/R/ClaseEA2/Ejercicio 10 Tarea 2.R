#Ejercicio Tarea 2 Aplicada 2

#Hacer la gr�fica de dispersi�n
datos<-read.csv("http://allman.rhon.itam.mx/~lnieto/index_archivos/DatosT2Ej10.csv")
y<-datos$Pureza
x<-datos$Hcarb
par(mfrow=c(1,1))
plot(x,y)
#Ajustar el modelo
fit<-lm(y~x)
summary(fit)
#Intervalos de confianza
confint(fit,level=0.97)
#Tabla de an�lisis de varianza
anova(fit)
#Estad�stica T0
n<-nrow(datos)
sxx<-(sum((x-mean(x))^2))
t0<-(fit$coefficients[2]-12)/sqrt(anova(fit)$"Mean Sq"[2]/sxx)
pt(t0,n-2)

#Por lo que nos da, no rechazamos H0. Existe la posibilidad
#de que beta0 sea mayor a 12 pues el n�mero de x estimado
#fue cercano a 12 (i.e. 11.801)

#Hacemos una predicci�n
predict(fit,newdata=data.frame(x=1),interval="confidence")
predict(fit,newdata=data.frame(x=1),interval="prediction")
