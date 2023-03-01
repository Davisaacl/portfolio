#Distribución logística con el método de inversión

library("reliaR")

x <- NULL; n <- 5000; gam <- 0; beta <- 1

for(i in 1:n) x[i] <- (-beta*log(1/runif(1)-1))+gam

hist(x, prob = T, breaks=20, xlab = "Muestra", ylab = "densidad")


curve(dlogis(x, location = gam, scale = beta, log = FALSE), from = -10, to = 10, add = T, col = "red" )

mean(x)
j=1;
for (i in seq(from=50, to=5000, by=50)){
  mediaTru[j] <- mean(x,trim=i/5000)
  j=j+1;
  mediaTru
}