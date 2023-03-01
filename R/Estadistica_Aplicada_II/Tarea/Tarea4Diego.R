#Tarea 4
per<-c(1:18)
edad<-c (21,27,32,37,42,47,52,57,62,21,27,32,37,42,47,52,57,62)
gen<- c(1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0)
ingreso<-c(141080,205230,224710,260170,273140,280930,272880,267060,259510,
           111540,145170,162150,161990,157770,159060,162170,157550,152400)
X <- matrix(c(edad,gen),ncol =2)
m<- t(X)%*%X
m1<-solve(m)
m2<-t(X)%*%ingreso
b<-m1%*%m2

x<-rbind(edad,gen)
Yg<-t(x)%*%b 
Y<- ingreso
Ym<-mean(ingreso)

#No hay parámeto beta 0 en el modelo

SCE <- t(b) %*% t(X) %*% ingreso
SCR <- t(ingreso) %*% ingreso - t(b) %*% t(X) %*% ingreso
SCT <- SCR + SCE
R<- 1 - SCE/SCT

FdeR <- qf(0.95,3,15,lower.tail = TRUE)

CME = SCE/2
CMR = SCR/(length(ingreso) - 2)

Fcalculada = CME / CMR

FdeR <- qf(0.95,3,15,lower.tail = TRUE)

#Hacemos pruebas de hipótesis
#H0: Bi = 0 para toda i vs. HA: Bi != 0 para alguna i con alpha = 0.05
#Obtenemos valor-p

p_value <- pf(Fcalculada,3,15,lower.tail = FALSE)