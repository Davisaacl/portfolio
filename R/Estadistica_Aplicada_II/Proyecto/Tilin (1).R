

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

plot(X1,y)
plot(X2,y)
plot(X3,y)

#correlación
# mcorrel<- cor(data[,-1])
#pairs(data[,c("ratio","tomato","audience")])

#Primera regresión lineal, y = log(pi/(1-pi))


fit<-lm(y~X1+X3)
print(fit)
anova(fit)
summary(fit)

#ajustada
ajus<-

e<-residuals(fit)
plot(X1,e)
plot(X2,e)
plot(X3,e)


  # Regresión logística
modelo_glm <- glm(y ~ X1+X3, data,
                  family = "gaussian")
print(modelo_glm)
summary(modelo_glm)
ye<-function(X1,X3) -0.442189 -0.298757*X1  + 0.008556*X3
yg<-ye(X1,X3)

confint(modelo_glm)
confint.default(modelo_glm)

#Probabilidad aproximada
p = sum(y)/length(y)
print(p)

proba <- 1/(1+exp(-y))

aux2 <- log(proba/(1-proba))
print(aux_proba)
print(aux2)

### REGRESION LINEAL
modelo_lineal <- lm(aux ~ X1+X3)
modelo_lineal2 <- lm(aux2 ~ X1+X3)


summary(modelo_lineal)


plot(X1,aux)
plot(X3,aux)

#Estimamos probabilidad y = log(pi/[1-pi]) = x1+x2+x3
plot(modelo_glm)

plot(X2,yg)


plot(X1,modelo_glm)
plot(X2,modelo_glm)
plot(X3,modelo_glm)

# Diferencia de residuos
dif_residuos <- modelo_glm$null.deviance - modelo_glm$deviance
print(dif_residuos)

# Resultado de la probabilidad X0
# p = y_ajus/(y_ajus+1)
anova(modelo_glm, test ="F")

aov(modelo_glm)
anova(fit)
# plot(X0,p)
# plot(X1,p)
# plot(X2,p)
# plot(X3,p)
# print(p)

ym <- mean(y)
SCT<- sum(y-ym)
SCR<-

sum(y-yg)
#esperanza = 0
e<-residuals(modelo_glm)
sum(e)
#varianza constante
var(e)
plot(e[2:n],e[1:(n-1)])
#linealidad en variables no se cumple por dicotomicas
plot(X0,y)
plot(X1,yg)
plot(X2,yg)
plot(X3,yg)

anova(yg)


#no hay normalidad de los errores
# par(mfrow=c(2,2))
# plot(e,main="Residuos vs Yf")
# boxplot(e,main="Boxplot de residuos")
# qqnorm(e)
# hist(fit$residuals,breaks=100,xlab="Residuals",ylab="Histograma de Residuos")
# 
#Anova
anova(fit)













# #Análisis de residuos 
# e<-residuals(fit)
# supressWarnings(Yf<-predict(fit,interval="prediction"))
# 
# 
# par(mfrow=c(2,2))
# plot(e,main="Residuos vs Yf")
# boxplot(e,main="Boxplot de residuos")
# qqnorm(e)
# hist(fit$residuals,breaks=100,xlab="Residuals",ylab="Histograma de Residuos")
# 
# #Quitar Residuos 
# sort(e)
# 
# #Prueba Goldfeld-Quandt
# install.packages("lmtest")
# library(lmtest)
# X<-seq(0.01,10,length.out=100)
# Y1<-X+rnorm(length(X),0,1)
# Y2<-X+rnorm(length(X),0,rev(X))
# df<-cbind.data.frame(X,Y1,Y2)
# 
# ggplot(df,aes(x=X))+geom_line(aes(y=Y1))+theme_clean()+theme(plot.background=element_blank(),axis.line=element_line(color="black"))  
# 
# ggplot(df,aes(x=X))+geom_line(aes(y=Y2))+theme_clean()+theme(plot.background=element_blank(),axis.line=element_line(color="black"))
# 
# model1<-lm(Y1~X)
# model2<-lm(Y1~X)
# gqtest(model1)
# gqtest(model2)
# gqtest(model2,alternative="less")
# 
# 
# #Prueba de Bresuch-Pagan
# bptest(model1)
# bptest(model2)
# 
# 
# #Prueba de White
# bptest(model1,~X+I(X^2))
# bptest(model1,~X+I(X^2))
# 

#Normalidad 
#Prueba de Jarque-Bera
install.packages("tseries")
library(tseries)
model1<-lm(y~X)
model2<-lm(y~X)
jarque.bera.test(e)
jarque.bera.test(model2$residuals)
Y<-X+rt(length(X),df=2)
data<-data.frame(Y)
ggplot(data,aes(x=Y))+geom_histogra(fill="white",color="black",bins=20)+theme_clean()+theme(plot.background=element_blank(),axis.line=element_line(color="black"))
model3<-lm(Y~X)
jarque.bera.test(model3$residuals)


#Anderson Darling
install.packages("nortest")
library(nortest)
ad.test(model1$residuals)
ad.test(model3$residuals)


               #Colinealidad 
               #Factor de inflación de la varianza
               datos<-read.csv("doc")
               head(datos)
               modelo<-lm(data=datos,Femoral.Neck~activity+X.Fat+Weight.kg+I(X.Fat*weight.kg))
               install.packages("olsrr")
               library(olsrr)
               ols_vif_tol(modelo)
               
               #Numero de condicion e índice de condidión 
               library(mctest)
               omcdiag(x=cbind.data.frame(datos[,c(2,3,4)], datos$X.Fat*datos$Weight.kg),y=datos[,1])
               imcdiag(x=cbind.data.frame(datos[,c(2,3,4)],datos$X.Fat*datos$Weight.kg),y=datos[,1])
               eigprop(x=cbind.data.frame(datos[,c(2,3,4)],datos$X.Fat*datos$Weight.kg))
               imcdiag(x=cbind.data.frame(datos[,c(2,3,4)],datos$X.Fat*datos$Weight.kg),y=datos[,1])
               
               X <- seq(0.1,1,length.out = 100)
               Y_1 <- X + rnorm(100, sd = 0.5)
               Y_2 <- log(X) + rnorm(length(X), sd = 0.5)
               Y_3 <- as.numeric(100)
               Y_3[1:50] <- X[1:50]
               Y_3[51:100] <- 5*X[51:100]+(1-5)*0.5
               Y_3 <- Y_3 + rnorm(100, sd = 0.2)
               
               data <- cbind.data.frame(X,Y_1,Y_2,Y_3)
               data <- melt(data, id.vars = "X")
               
               ggplot(data, aes(x = X, y = value, color = variable)) +
                 geom_point() + 
                 theme_clean() + 
                 geom_smooth(se = FALSE, linetype = "dotted") + 
                 ylab("Y")
               
               install.packages("gap")            
               library(gap)
               chow.test(Y_1[1:50], X[1:50], Y_1[51:100], X[51:100])
               
               chow.test(Y_2[1:50], X[1:50], Y_2[51:100], X[51:100])
               
               chow.test(Y_3[1:50], X[1:50], Y_3[51:100], X[51:100])
               
               X <- seq(0,1,length.out = 100)
               Y <- X + rnorm(100,0,2)
               modelo <- lm(Y-X)
               
               performance::check_model(modelo)
               X <- seq(0,10,length.out = 100)
               Y <- X^2 + rnorm(100,0,1)
               modelo <- lm(Y~X)
               performance::check_model(modelo)
               
               X_2 <- X^2
               modelo <- lm(Y~X_2)
               performance::check_model(modelo, bins = 40)