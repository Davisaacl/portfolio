#--- Codigo de R con algunos ejercicios de clase --- 
#--- Prof. Luis E. Nieto ---

datos<-read.table("http://allman.rhon.itam.mx/~lnieto/index_archivos/Base1995.txt",header=TRUE)
dim(datos)
names(datos)

#Ej1
y<-datos$Peso
x<-datos$Estatura
plot(x,y)
fit<-lm(y~x)
#fit<-lm(Peso~Estatura,data=datos)
print(fit)
#Estimadores puntuales y PH
summary(fit)
#Estimadores por intervalo
confint(fit)
#ANOVA
anova(fit)
#Predicciones
mf<-predict(fit,interval="confidence")
yf<-predict(fit,interval="prediction")
#Graficas
ymin<-min(mf,yf)
ymax<-max(mf,yf)
plot(x,y,ylim=c(ymin,ymax))
abline(lsfit(x,y),col=2)
or<-order(x)
points(x,mf[,1],col=2)
lines(x[or],mf[or,2],col=2,lty=2)
lines(x[or],mf[or,3],col=2,lty=2)
lines(x[or],yf[or,2],col=3,lty=2)
lines(x[or],yf[or,3],col=3,lty=2)

#Análisis de residuos
e <- y-yf[,1]
par(mfrow = c(2,2))
plot(x,e)
abline(h=0,col="grey50")
plot(yf[,1],e)
abline(h=0,col="grey50")
hist(e)
qqnorm(e)

#Estimador de beta_1
sxy <- sum((x-mean(x))*(y-mean(y)))
sxx <- sum((x-mean(x))^2)
beta1 <- sxy/sxx
#Estimado de beta_0
beta0 <- mean(y) - (beta1*mean(x))


#Ej2
y<-datos$Peso
x<-datos$Edad
plot(x,y)
fit<-lm(y~x)
#fit<-lm(Peso~Estatura,data=datos)
print(fit)
#Estimadores puntuales y PH
summary(fit)
#Estimadores por intervalo
confint(fit)
#Predicciones
mf<-predict(fit,interval="confidence")
yf<-predict(fit,interval="prediction")
#Graficas
ymin<-min(mf,yf)
ymax<-max(mf,yf)
plot(x,y,ylim=c(ymin,ymax))
abline(lsfit(x,y),col=2)
or<-order(x)
points(x,mf[,1],col=2)
lines(x[or],mf[or,2],col=2,lty=2)
lines(x[or],mf[or,3],col=2,lty=2)
lines(x[or],yf[or,2],col=3,lty=2)
lines(x[or],yf[or,3],col=3,lty=2)
#Ej2a
y<-y[x<50]
x<-x[x<50]
plot(x,y)
fit<-lm(y~x)
#fit<-lm(Peso~Estatura,data=datos)
print(fit)
#Estimadores puntuales y PH
summary(fit)
#Estimadores por intervalo
confint(fit)
#Predicciones
mf<-predict(fit,interval="confidence")
yf<-predict(fit,interval="prediction")
#Graficas
ymin<-min(mf,yf)
ymax<-max(mf,yf)
plot(x,y,ylim=c(ymin,ymax))
abline(lsfit(x,y),col=2)
or<-order(x)
points(x,mf[,1],col=2)
lines(x[or],mf[or,2],col=2,lty=2)
lines(x[or],mf[or,3],col=2,lty=2)
lines(x[or],yf[or,2],col=3,lty=2)
lines(x[or],yf[or,3],col=3,lty=2)

#Ej3
y<-datos$Peso
x<-datos$Sexo
plot(x,y)
fit<-lm(y~x)
#fit<-lm(Peso~Estatura,data=datos)
print(fit)
#Estimadores puntuales y PH
summary(fit)
#Estimadores por intervalo
confint(fit)
#Predicciones
mf<-predict(fit,interval="confidence")
yf<-predict(fit,interval="prediction")
#Graficas
ymin<-min(mf,yf)
ymax<-max(mf,yf)
plot(x,y,ylim=c(ymin,ymax))
abline(lsfit(x,y),col=2)
or<-order(x)
points(x,mf[,1],col=2)
lines(x[or],mf[or,2],col=2,lty=2)
lines(x[or],mf[or,3],col=2,lty=2)
lines(x[or],yf[or,2],col=3,lty=2)
lines(x[or],yf[or,3],col=3,lty=2)

#--- Ejemplo Precios---
#-Lectura de datos-
precio<-read.csv("http://allman.rhon.itam.mx/~lnieto/index_archivos/precio.csv")
anticipacion<-read.csv("http://allman.rhon.itam.mx/~lnieto/index_archivos/anticipacion.csv")
precio[,-1]<-as.matrix(precio[,-1])
anticipacion[,-1]<-as.matrix(anticipacion[,-1])
f<-function(x){ifelse(x==-1,NA,x)}
anticipacion<-sapply(anticipacion,f)
n<-dim(precio)[1]
m<-precio$num
y<-as.matrix(precio[,2:11])
x<-as.matrix(anticipacion[,2:11])
dia<-precio$dia
mes<-precio$mes
puente<-precio$puente+1
ano<-precio$ano-2016
pp<-m
ap<-m
for (i in 1:n){
  pp[i]<-mean(y[i,1:m[i]])
  ap[i]<-mean(x[i,1:m[i]])
}

#-Graficas-
plot(ap,pp)

#boxplots de pp (precio promedio)
boxplot(pp~dia,main="precio prom. por dia")
boxplot(pp~mes,main="precio prom. por mes")
boxplot(pp~ano,main="precio prom. por ano")
boxplot(pp~puente,main="precio prom. por tipo")

#Regresion lineal multiple erronea
#ESTO NO SE DEBE HACER
fit<-lm(pp~ap+dia+mes+ano+puente)
summary(fit)

#Lo que si es correcto
#CONVERTIR VARIABLES CATEGORICAS EN VARIABLES AUXILIARES
#
dia1<-ifelse(dia==1,1,0)
dia2<-ifelse(dia==2,1,0)
dia3<-ifelse(dia==3,1,0)
dia4<-ifelse(dia==4,1,0)
dia5<-ifelse(dia==5,1,0)
dia6<-ifelse(dia==6,1,0)
dia7<-ifelse(dia==7,1,0)
#
mes1<-ifelse(mes==1,1,0)
mes2<-ifelse(mes==2,1,0)
mes3<-ifelse(mes==3,1,0)
mes4<-ifelse(mes==4,1,0)
mes5<-ifelse(mes==5,1,0)
mes6<-ifelse(mes==6,1,0)
mes7<-ifelse(mes==7,1,0)
mes8<-ifelse(mes==8,1,0)
mes9<-ifelse(mes==9,1,0)
mes10<-ifelse(mes==10,1,0)
mes11<-ifelse(mes==11,1,0)
mes12<-ifelse(mes==12,1,0)
#
ano1<-ifelse(ano==1,1,0)
ano2<-ifelse(ano==2,1,0)
ano3<-ifelse(ano==3,1,0)
#
puenteNO<-ifelse(puente==1,1,0)
puenteSI<-ifelse(puente==2,1,0)
#
fit<-lm(pp~ap
        +dia2+dia3+dia4+dia5+dia6+dia7
        +mes2+mes3+mes4+mes5+mes6+mes7+mes8+mes9+mes10+mes11+mes12
        +ano2+ano3
        +puenteSI)
summary(fit)
#Forma simplificada sin pasar por variables auxiliares
fit<-lm(pp~ap+factor(dia)+factor(mes)+factor(ano)+factor(puente))
summary(fit)
#Analisis de residuos
e<-residuals(fit)
yf<-predict(fit,interval="prediction")
par(mfrow=c(2,2))
plot(e)
plot(yf[,1],e)
boxplot(e)
qqnorm(e)
#
plot(ap,e)
ap2<-ap^2
ap3<-ap^3
ap4<-ap^4
ap5<-ap^5
fit<-lm(pp~ap+ap2+ap3+ap4+ap5
        +dia2+dia3+dia4+dia5+dia6+dia7
        +mes2+mes3+mes4+mes5+mes6+mes7+mes8+mes9+mes10+mes11+mes12
        +ano2+ano3
        +puenteSI)
summary(fit)
#Forma simplificada CON INTERACCINES
ap2<-ap^2
ap3<-ap^3
fit<-lm(pp~ap+ap2+ap3
        +factor(dia)+factor(mes)+factor(ano)+factor(puente)
        +factor(dia):factor(mes)
        +ap:factor(dia)+ap:factor(mes)
        +ap:factor(dia):factor(mes)
)
summary(fit)