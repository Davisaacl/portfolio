#Cargar librerías
# install.packages("data.table")
# install.packages("dplyr")
# install.packages("ggplot2")
# install.packages("forecast")
# install.packages("lmtest")
# install.packages("normtest")
# install.packages("stringr")
# install.packages("reshape2")

# library(data.table)
# library(dplyr)
# library(ggplot2)
# library(forecast)
# library(stringr)
# library(lmtest)
# library(reshape2)


#instalar el paquete
#librar(normtest)

#instalar el paquete
library(normtest)

#Leer datos 
dataset<-read.csv("D:/Escuela/Estadística Aplicada II/Víctor Guerrero/Proyecto/Datos_Oscares.csv", header = TRUE, sep = ',')


data<-as.data.frame(dataset)
data<-data[,-7]
print(data)
n<-dim(data)
names(data)

#Nombrar variables 
names(data)=c("Título", "Año", "dinero_recaudado","palabras_mujeres","palabras_hombres", "gano_oscar")
print(names(data))

#RLM 
#data<-as.matrix(data[,-1])
y<-data$gano_oscar
#y<-t(y)
xAux<-as.matrix(data)
x<-as.matrix(data[,4:5])

print(x)
print(xAux)

X1<-data$Año
X2<-data$dinero_recaudado
X3<-data$palabras_mujeres
X4<-data$palabras_hombres

print(X1)
print(X2)
print(X3)
print(X4)

#correlación
cor(data$Año,x)
cor(data[,-1])
pairs(data[,2:4])

var(data[,-1])

#Primera regresión lineal 
fit<-lm(y~X1+X2+X3+X4)
summary(fit)

#Anova
anov<-anova(fit)
print(anov)

#Análisis de residuos 
e<-residuals(fit)
print(e)
Yf<-predict(fit,interval="prediction")
print(Yf)

#No funciona el supressWarnings y no sé por qué
supressWarnings(Yf<-predict(fit,interval="prediction")) 

par(mfrow=c(2,2))
plot(e,main="Residuos vs Yf")
boxplot(e,main="Boxplot de residuos")
qqnorm(e)
hist(fit$residuals,breaks=100,xlab="Residuals",ylab="Histograma de Residuos")

#Quitar Residuos 
sort(e)






#Tocó de R
#X1
datosGrafica <- data.frame(y,X1,X2,X3,X4)
ggplot(data = datosGrafica, aes(x=X1,y = y)) + geom_point()

ggplot(data = datosGrafica, aes(x=X1,y = y)) + geom_line()

ggplot(data = datosGrafica, aes(x=X1,y = y)) + geom_point(size = 0.5) + geom_line()

#X2
ggplot(datosGrafica,aes(x=X2,y=y)) + geom_point()

#X3
ggplot(datosGrafica,aes(x=X3,y=y)) + geom_point()

#X4
ggplot(datosGrafica,aes(x=X4,y=y)) + geom_point()





#Comparaciones

xFrame <- data.frame(x)
print(xFrame)


Xmutate<- xFrame %>% mutate(f_1 = X1, f_2 = log(X2), f_3 = X3^2)
print(Xmutate)
head(x)



X_mezcl <- melt(xFrame, id.vars = "palabras_mujeres")
head(X_mezcl)



ggplot(X_mezcl, aes(x = xFrame, y = value, group = variable)) + geom_line()


ggplot(X_mezcl, aes(x = xFrame, y = value, group = variable)) +
  geom_line()
