# Pregunta 5 (Cadenas de Markov)
install.packages("markovchain")

library("markovchain")

n <- 100;
estadoInicial <- c(0,0,0,0,1);
P <- matrix(c(0, 0, 0, 0, 1,
              0, 8/13, 3/13, 1/13, 1/13,
              1/16, 3/16, 3/8, 1/4, 1/8,
              0, 1/11, 4/11, 5/11, 1/11,
              0, 1/8, 1/2, 1/8, 1/4),
            byrow=T, nrow=5)


# Se denota -1 a que no hay ataques
cadenaAtaques <- new("markovchain", states = c("80","134","139","445","-1"),
                     transitionMatrix  = P, name = "Ataques a Puertos de computadora");

estadoNveces <- function(estadoIni, numVeces, matriz){
  estadoN <- estadoInicial* (cadenaAtaques)^numVeces;
  estadoN;
}

estado100veces <- estadoNveces(estadoInicial, n, P);
estado100veces;

distribucionEstacionaria <- steadyStates(cadenaAtaques);

distribucionEstacionaria;
