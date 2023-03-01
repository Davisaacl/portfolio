# Pregunta 2

library(EnvStats)
library(tidyverse)


# Muestra de la Pareto
x <- NULL; n <- 1000; alpha <- 5; beta <- 125000
for(i in 1:n) x[i] <- beta/((runif(1,0,1))^(1/alpha))
hist(x, prob = T, breaks=10, xlab = "Muestra", ylab = "densidad")
curve(dpareto(x, beta, shape = alpha), from = beta, to = 450000, add = T, col = "red" )


# Función de distribución empírica
Fn_x <- ecdf(x)
plot(Fn_x,main="Función Distribución Empírica")

# Comparación empírica vs teórica
curve(ppareto(x, beta, shape = alpha), from = 0, to = 600000, add = T, col = "green")

# Media y varianza
media<- mean(x)
varianza <- var(x)


# inciso b
#Para p general
# Probabilidad de bancarrota de la aseguradora

probaQuiebre <- function(t, p){
  quiebre <- 0;
  
  quiebre <- 125000^5/( (10000000 + t * 1000* 5500)^5 / (t*p)^5 );
    
    
  quiebre
}

#Prueba
# p = 0.01 y para 5, 10 y 20 años
probaQuiebre(5,0.01)
probaQuiebre(10,0.01)
probaQuiebre(20,0.01)

# p = 0.1 y para 5, 10 y 20 años
probaQuiebre(5,0.1)
probaQuiebre(10,0.1)
probaQuiebre(20,0.1)

# p = 0.15 y para 5, 10 y 20 años
probaQuiebre(5,0.15)
probaQuiebre(10,0.15)
probaQuiebre(20,0.15)

# p = 0.20 y para 5, 10 y 20 años
probaQuiebre(5,0.2)
probaQuiebre(10,0.2)
probaQuiebre(20,0.2)



# Activos al final de t años
# t = tiempo, p = probabilidad.
activosAño <- function(t, p){
  z <- NULL;
  i <- 1;
  
  z[1] <- 10000000 + 1000*5500;
  
  while (i <= t && z[i]>=0){
    
    z[i+1] <- z[i] + 1000*5500 - p * media
    i <- i+1
  }
  z
  
}

#prueba

# p = 0.01 y para 5, 10 y 20 años
activosAño(5,0.01)
activosAño(10,0.01)
activosAño(20,0.01)

# p = 0.1 y para 5, 10 y 20 años
activosAño(5,0.1)
activosAño(10,0.1)
activosAño(20,0.1)

# p = 0.15 y para 5, 10 y 20 años
activosAño(5,0.15)
activosAño(10,0.15)
activosAño(20,0.15)

# p = 0.2 y para 5, 10 y 20 años
activosAño(5,0.2)
activosAño(10,0.2)
activosAño(20,0.2)

#Inciso c
# t = num años, p = prob reclamos

dineroAccionistas <- function (t, p){
  z <- NULL;
  accionistas <- rep(0,t);
  i <- 1;
  z[1] <- 10000000 + 1000*5500 - p * media;
  
  
  while (i <= t  &&  z[i] >= 0){
    
    
    if (z[i] > 10000000){
      accionistas[i] <- z[i] - 10000000
      z[i] <- z[i]-accionistas[i]
    }
    z[i+1] <- z[i] + 1000*5500 - p * media
    
    i <- i+1
  }
  accionistas
}

#Prueba
# p = 0.01 y para 5, 10 y 20 años
dineroAccionistas(5, 0.01)
dineroAccionistas(10, 0.01)
dineroAccionistas(20, 0.01)

# p = 0.1 y para 5, 10 y 20 años
dineroAccionistas(5, 0.1)
dineroAccionistas(10, 0.1)
dineroAccionistas(20, 0.1)

# p = 0.15 y para 5, 10 y 20 años
dineroAccionistas(5, 0.15)
dineroAccionistas(10, 0.15)
dineroAccionistas(20, 0.15)

# p = 0.2 y para 5, 10 y 20 años
dineroAccionistas(5, 0.2)
dineroAccionistas(10, 0.2)
dineroAccionistas(20, 0.2)

# t = tiempo, p = probabilidad
probaQuiebreConAccionistas <- function(t, p){
  quiebre <- NULL;
  Z <- dineroAccionistas(t,p);
  valido <- FALSE;
  i <- 1;
  
  
  while (Z[i] >= 0 && i <= length(Z)){
    valido <- TRUE;
    i <- i+1;
  }
  if (i<=t)
    valido = FALSE;
  
  if (valido == TRUE) {
    quiebre <- 125000^5/( (10000000 + t * 1000 * 5500 - t*Z[i-1]) / (t*p) )^5;
  }
  
  
  quiebre
}

#Prueba

# p = 0.01 y para 5, 10 y 20 años
probaQuiebreConAccionistas(5, 0.01)
probaQuiebreConAccionistas(10, 0.01)
probaQuiebreConAccionistas(20, 0.01)

# p = 0.10 y para 5, 10 y 20 años
probaQuiebreConAccionistas(5, 0.1)
probaQuiebreConAccionistas(10, 0.1)
probaQuiebreConAccionistas(20, 0.1)

# p = 0.15 y para 5, 10 y 20 años
probaQuiebreConAccionistas(5, 0.15)
probaQuiebreConAccionistas(10, 0.15)
probaQuiebreConAccionistas(20, 0.15)

# p = 0.2 y para 5, 10 y 20 años
probaQuiebreConAccionistas(5, 0.2)
probaQuiebreConAccionistas(10, 0.2)
probaQuiebreConAccionistas(20, 0.2)

#Activos con accionistas
activosAñoAccionistas <- function(t, p){
  z <- NULL;
  i <- 1;
  accionistas <- dineroAccionistas(t,p);
  
  z[1] <- 10000000 + 1000*5500 - accionistas[1];
  
  while (i <= t && z[i]>=0){
    
    z[i+1] <- z[i] + 1000*5500 - p * media - accionistas[i]
    i <- i+1
  }
  z
  
}

# p = 0.2 y para 5, 10 y 20 años
activosAñoAccionistas(5,0.01)
activosAñoAccionistas(10,0.01)
activosAñoAccionistas(20,0.01)

# p = 0.2 y para 5, 10 y 20 años
activosAñoAccionistas(5,0.1)
activosAñoAccionistas(10,0.1)
activosAñoAccionistas(20,0.1)

# p = 0.2 y para 5, 10 y 20 años
activosAñoAccionistas(5,0.15)
activosAñoAccionistas(10,0.15)
activosAñoAccionistas(20,0.15)

# p = 0.2 y para 5, 10 y 20 años
activosAñoAccionistas(5,0.2)
activosAñoAccionistas(10,0.2)
activosAñoAccionistas(20,0.2)


# Ganancias totales después de t años
ganancias <- function(t,p){
  activos <- activosAñoAccionistas(t,p);
  accionistas <- dineroAccionistas(t,p);
  ganancias <- 0;
  
  for (i in 1:t) {
    ganancias <- activos[i]-accionistas[i]
  }
  
  ganancias
}
#Prueba

# p = 0.01 y para 5, 10 y 20 años
ganancias(5,0.01)
ganancias(10,0.01)
ganancias(20,0.01)

# p = 0.1 y para 5, 10 y 20 años
ganancias(5,0.10)
ganancias(10,0.10)
ganancias(20,0.10)


# p = 0.15 y para 5, 10 y 20 años
ganancias(5,0.15)
ganancias(10,0.15)
ganancias(20,0.15)

# p = 0.2 y para 5, 10 y 20 años
ganancias(5,0.2)
ganancias(10,0.2)
ganancias(20,0.2)
