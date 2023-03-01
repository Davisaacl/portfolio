# Pregunta 10
#### MONTECARLO CRUDO
# Usamos como mínimo -2e-100 y máximo 2e+100

m <- 100000;
Y <- NULL;
aux1 <- NULL;
suma <- 0;
estimacionIntegral <- 0;

Y <- runif(m, -2e+100, 2e+100)

for (i in 1:m){
  aux1[i] <- log(Y[i]^2)*exp(-Y[i]^2);
}

suma <- sum(aux1);
suma
estimacionIntegral <- ((2e+100 - (-2e-100))/ m) * suma;
estimacionIntegral


#### MONTECARLO CRUDO
# Usamos como mínimo -2e-4 y máximo 2e+4 para obtener posibles valores

k <- 100000;
Z <- NULL;
aux2 <- NULL;
suma2 <- 0;
estimacionIntegral2 <- 0;

Z <- runif(k, -2e+4, 2e+4)

for (i in 1:k){
  aux2[i] <- log(Z[i]^2)*exp(-Z[i]^2);
}

suma2 <- sum(aux2);
suma2
estimacionIntegral2 <- ((2e+4 - (-2e+4))/ k) * suma2;
estimacionIntegral2


## Reducción de varianza
# varianza actual
varianza <- 0;
varianza <- var(((2e+4 - (-2e+4))/ k) * (aux2));
varianza


# reducción de varianzas de dos formas
# Usamos variables antitéticas
X <- NULL;
estIntegralVarAnti <- 0;
varAnti <- NULL;


for (i in 1:k){
  X[i] <- -2e+4 + (2e+4 - Z[i]);
  varAnti[i] <- log(X[i]^2)*exp(-X[i]^2);
}



sumaAux <- sum(aux2[1:k/2] + varAnti[1:k/2]);


estIntegralVarAnti <- ((2e+4 - (-2e+4))/ k) * sumaAux;

estIntegralVarAnti

#Varianza con variable antitética
varAnt <- 0;
varAnt <- var(((2e+4 - (-2e+4))/ k) * (aux[1:k/2] + varAnti[1:k/2]));
varAnt



#Segunda forma de reducción de varianza
#Se hace por medio del muestreo de importancia

estIntegralMuestImpor <- 0;
consEstand <- 0;
auxEstimador <- 0;

for (i in 1:k){
  if (Z[i]<1 & Z[i]>-1){
    auxEstimador[i] <- exp(-Z[i]^2);
  }
  else{
    auxEstimador[i] <- exp(-Z[i]^2);
  }
}

estimadorIS <- (1/k)*sum((auxEstimador * log(Z^2))/Z);
estimadorIS

consEstand <- 1/sqrt(pi);

estIntegralMuestImpor <- consEstand * (estimadorIS);
estIntegralMuestImpor


#Varianza con muestreo de importancia 
varMuestreo <- 0;
varMuestreo <- var((1/k)*(auxEstimador * log(Z^2))/Z);
varMuestreo







