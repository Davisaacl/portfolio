#Cauchy método de inversión

#Algoritmo y función para hacer una muestra Cauchy


#Código a prueba
x <- NULL;
n = 5000; gamma = 0; beta = 1

for(i in 1:n) x[i] <- beta*(tan(pi*(runif(1,0,1)-1/2))) + gamma

hist(x, prob = T, breaks=100, xlab="muestra", ylab="densidad", xlim=c(-20,20), ylim=c(0,0.4))
curve(dcauchy(x, location = gamma, scale = beta, log = FALSE), from = -20, to = 20, add = T, col = "red")

#Obtenemos las medias muestrales (recortadas a las n que nos pide)

mean(x)
j=1;
for (i in seq(from=50, to=5000, by=50)){
  mediaTru[j] <- mean(x,trim=i/5000)
  j=j+1;
  mediaTru
}


