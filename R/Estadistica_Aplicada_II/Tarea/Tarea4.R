#Tarea 4

#Explicar el ingreso a través de las demás variables

per<-c(1:18)
edad<-c (21,27,32,37,42,47,52,57,62,21,27,32,37,42,47,52,57,62)
gen<- c(1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0)
ingreso<-c(141080,205230,224710,260170,273140,280930,272880,267060,259510,
           111540,145170,162150,161990,157770,159060,162170,157550,152400)

ingresoBarra <- sum(ingreso) / length(ingreso)

X <- matrix(c(edad,gen),ncol =2)
m<- t(X)%*%X
m1<-solve(m)
m2<-t(X)%*%ingreso
b<-m1%*%m2

x<-rbind(edad,gen)
Yg<-t(x)%*%b 


#No hay parámeto beta 0 en el modelo

SCE <- t(b) %*% t(X) %*% ingreso 
SCR <- t(ingreso) %*% ingreso - t(b) %*% t(X) %*% ingreso
SCT <- SCR + SCE

SCTformula <- t(ingreso) %*% ingreso
R <- 1 - SCE/SCT


CME = SCE/3
CMR = SCR/(length(ingreso) - 3)


#Hacemos pruebas de hipótesis
#H0: Bi = 0 para toda i vs. HA: Bi != 0 para alguna i con alpha = 0.05
#Obtenemos valor-p

Fcalculada = CME / CMR
FdeR <- qf(0.95,3,15,lower.tail = TRUE)
p_value <- pf(Fcalculada,3,15,lower.tail = FALSE)


#Vector de errores
e <- ingreso - Yg

# promedio de erroes
ebarra <- sum(e) / length(ingreso) # No suma cero porque no hay beta0

#gráfica de errores 
eiNueva <- NULL
eiAnterior <- NULL

n <- length(ingreso)

for (i in 2:n-1){
  eiNueva[i] <- e[i+1]
  eiAnterior[i] <- e[i]
}

eiNueva
eiAnterior

plot(eiAnterior, eiNueva) #No se cumple que los errores son no autocorrelacionados

#Varianza constante
#Graficar ei con Ygi
plot(Yg,e)




#Ajustado
edadCuadrado <- edad^2
edad
ingresoCuadrado <- gen^2



ingresoCuadradoBarra <- sum(ingresoCuadrado) / length(ingresoCuadrado)

XAjus <- matrix(c(edad,edadCuadrado,gen),ncol =3)
mNueva<- t(XAjus)%*%XAjus
m1Nueva<-solve(mNueva)
m2Nueva<-t(XAjus)%*%ingresoCuadrado
bNueva<-m1Nueva%*%m2Nueva

 

xNueva<-rbind(edadCuadrado,genCuadrado)
YgNueva<-t(x)%*%b 
length(m1Nueva)
length(m2Nueva)
