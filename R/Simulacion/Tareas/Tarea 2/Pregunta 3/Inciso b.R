install.packages("reliaR")

library(reliaR)
# Distribución Gumbell con inversa de la distribución acumulada


x <- NULL; n <- 5000; gam <- 0; beta <- 1

for(i in 1:n) x[i] <- gam - beta*(log(-log(runif(1,0,1))))

hist(x, prob = T, breaks=20, xlab = "Muestra", ylab = "densidad")


curve(dgumbel(x, gam, beta, log = FALSE), from = -3, to = 40, add = T, col = "red" )

mean(x)
j=1;
for (i in seq(from=50, to=5000, by=50)){
  mediaTru[j] <- mean(x,trim=i/5000)
  j=j+1;
  mediaTru
}
mediaTru
