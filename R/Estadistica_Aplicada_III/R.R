

# Cuantiles
qf(0.95,3,40,lower.tail = TRUE)

qf(0.95,2,30,lower.tail = TRUE)

# Valor p
pf(53.33,3,40,lower.tail = FALSE)

pf(3.75,2,30,lower.tail = FALSE)



# JI CUADRADA
dchisq(x, df, ncp=0, log = F)	#DENSIDAD.
pchisq(6.25, 3, ncp=0, lower.tail = T, log.p = F)	#ACUMULADA.
qchisq(p, df, ncp=0, lower.tail = T, log.p = F)	#CUANTILA
