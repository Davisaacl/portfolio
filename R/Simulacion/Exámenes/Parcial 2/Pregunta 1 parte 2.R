#Pregunta 1 parte 2

library(VGAM)
# Muestra aleatoria de una función de densidad Rayleigh por medio de variables antitéticas
U <- NULL; V <- NULL; n <- 10000; sigma <- 10; x <- NULL;


for (i in 1:n){
  U[i] <- sigma * sqrt(-2 * log(runif(1,0,1)));
  V[i] <- sigma * sqrt(-2 * log(runif(1,0,1)));
}
y <- (U+V)/2;

hist(y, prob = T, breaks=20, xlab="muestra", ylab="densidad")
curve(drayleigh(x, scale = sigma, log = FALSE), from = 0, to = 100, add = T, col = "green")


varNormal <- var(y);
varNormal
