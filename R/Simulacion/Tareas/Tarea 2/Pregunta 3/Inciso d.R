# Pareto con método de inversón de la distribución acumulada
install.packages("EnvStats")

library(EnvStats)

x <- NULL; n <- 5000; alpha2 <- 2; c <- 1

for(i in 1:n) x[i] <- c/((runif(1,0,1))^(1/alpha2))

hist(x, prob = T, breaks=10, xlab = "Muestra", ylab = "densidad")


curve(dpareto(x, c, shape = alpha2), from = c, to = 40, add = T, col = "red" )


mean(x)
j=1;
for (i in seq(from=50, to=5000, by=50)){
  mediaTru[j] <- mean(x,trim=i/5000)
  j=j+1;
  mediaTru
}