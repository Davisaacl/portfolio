install.packages("MASS")


library(data.table)
library(dplyr)
library(ggplot2)
library(forecast)
library(stringr)
library(MASS)

#Leer datos 
dataset<-read.csv("D:/Escuela/Estadística Aplicada II/Víctor Guerrero/Proyecto/Datos_Oscar2.csv", header = TRUE, sep = ',')

data<-as.data.frame(dataset)
n<-dim(data)

#Nombrar variables
names(data)=c("titulo","Año", "dinero_recaudado","ratio","oscar","tomato","audience")

#RLM
y<-data$oscar
y<-as.double(y)
x<-as.matrix(data[,3:4])


X1<-data$ratio
X2<-data$tomato
X3<-data$audience

#correlación
# mcorrel<- cor(data[,-1])
#pairs(data[,c("ratio","tomato","audience")])

#Primera regresión lineal, y = log(pi/(1-pi))


fit<-lm(y~X1++X2+X3)
anova(fit)
summary(fit)


# Regresión logística
modelo_glm <- glm(y ~ X1++X2+X3, data,
                  family = "gaussian")
print(modelo_glm)
summary(modelo_glm)

confint(modelo_glm)

confint.default(modelo_glm)


#Estimamos probabilidad y = log(pi/[1-pi]) = x1+x2+x3
print(modelo_glm)

plot(X1,modelo_glm)
plot(X2,modelo_glm)
plot(X3,modelo_glm)

# Diferencia de residuos
dif_residuos <- modelo_glm$null.deviance - modelo_glm$deviance
print(dif_residuos)

# Resultado de la probabilidad X0
# p = y_ajus/(y_ajus+1)


# plot(X0,p)
# plot(X1,p)
# plot(X2,p)
# plot(X3,p)
# print(p)


#esperanza = 0
e<-residuals(fit)
sum(e)

#varianza constante
var(e)

#linealidad en variables no se cumple por dicotomicas
plot(X0,y)
plot(X1,y)
plot(X2,y)
plot(X3,y)


#no hay normalidad de los errores
par(mfrow=c(2,2))
plot(e,main="Residuos vs Yf")
boxplot(e,main="Boxplot de residuos")
qqnorm(e)
hist(fit$residuals,breaks=100,xlab="Residuals",ylab="Histograma de Residuos")

