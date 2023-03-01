# Pregunta 9

cartas <- c(1,2,3,4,5,6,7,8,9,10)
sobres <- c(1,2,3,4,5,6,7,8,9,10)

# Tendremos en consideración la cantidad de fallos y la cantidad de aciertos
# Nos vamos por el complemento, que todo sea fallo es igual a, al complmento de al menos un acierto

probaAlMenosUnAcierto <- function(c, s){
  probabilidad <- 0;
  numFallos <- 0;
  hayUnAcierto <- FALSE;
  permutacion <- sample(c, replace = FALSE)
  i <- 1;
  
  while (i <= 10 && hayUnAcierto == FALSE){
  
    if (permutacion[i] == s[i]){
      hayUnAcierto <- TRUE;
      
     
    }
    numFallos <- numFallos + 1;
    
      i <- i+1;
  }
  
  
  probabilidad <- numFallos/10;
  probabilidad
}


#Llamamos a la función varias veces 
m = 1000
suma <- 0
probaSimulada <- 0

for (i in 1:m){
  suma <- suma + probaAlMenosUnAcierto(cartas,sobres)
  }
probaSimulada <- 1 - suma/m
probaSimulada

