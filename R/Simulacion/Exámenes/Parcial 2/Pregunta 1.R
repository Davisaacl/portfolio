# Pregunta 1 parte 1
library(VGAM)
# Muestra aleatoria de una función de densidad Rayleigh por medio de variables antitéticas
X <- NULL; Y <- NULL; n <- 10000; sigma <- 10; x <- NULL;

for (i in 1:n){
  aux <- runif(1,0,1);
  X[i] <- sigma * sqrt(log(1/(1-aux)^2));
  Y[i] <- sigma * sqrt(log(1/(aux)^2));
  
  x[i] <- (X[i] + Y[i])/2;
}
#x <- (X+Y)/2;

hist(x, prob = T, breaks=20, xlab="muestra", ylab="densidad")
curve(drayleigh(x, scale = sigma, log = FALSE), from = 0, to = 100, add = T, col = "red")

varAnti <- var(x);
varAnti
