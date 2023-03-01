{r, echo = FALSE}
Num.Paciente <- rep(1:10)
falla <- c("Si","No")
fallo <- sample(falla, prob = c(0.1, 0.9), size = 10, replace = TRUE)
horarios <- c(-2,-1,0,1,2)
tiempo.llegadas <- rep(0,10)
for (i in 1:10) {
  tiempo.llegadas[i] <- sample(horarios, prob = c(0.1,0.2,0.4,0.2,0.1), size = 1, replace = TRUE)
}
tiempos.consultas <- rep(2:9)
consultas <- rep(0,10)
for (i in 1:10) {
  consultas[i] <- sample(tiempos.consultas,
                         prob = c(0.1,0.1,0.1,0.2,0.2,0.1,0.1,0.1),
                         size = 1,
                         replace = TRUE)
}
tabla <- data.frame(Num.Paciente,fallo,tiempo.llegadas,consultas)
colnames(tabla) <- c("Paciente","Falló","Tiempo de llegada","Tiempo de consulta")
tabla
