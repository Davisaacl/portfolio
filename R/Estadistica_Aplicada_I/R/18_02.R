Coronavirus <- read_csv("Escuela/ITAM/Estadística Aplicada I/DropBox/Coronavirus.csv")

library("tidyverse")
Coronavirus <- Coronavirus %>% select(-c(1:5)) #Selecciona y remueve col 1 al 5; %>% a la base de datos muévele esto

#Voy a sumar por columnas sin contar los NA
casos.totales <- colSums(Coronavirus, na.rm = TRUE)
casos.totales

dias <- length(casos.totales)
dias

dias.totales <- 1:dias
dias.totales

#Genero una nueva base de datos
base.virus <- data.frame(x = dias.totales, y = casos.totales)

#Veamos si sigue exponencial, vimos que no
ggplot() + geom_point(aes(x = x, y = y), data = base.virus) + geom_smooth(aes(x = x, y= y), method = "lm",
                                                                          formula = (y ~ exp(x)), data = base.virus)

"Veamos si sigue cuadrática, y sí"
ggplot() + geom_point(aes(x = x, y = y), data = base.virus) + geom_smooth(aes(x = x, y= y), method = "lm",
                                                                          formula = (y ~ poly(x, 2)), data = base.virus)

#Para obtener cuántos casos habrán en el día 16 
#lm es mínimos cuadrados
modelo.parabola <- lm(y~poly(x,2), base.virus)
modelo.parabola

#Para obtener cuántos casos habrán en el día 16 (con polinomios "normales")
#RAW = TRUE es para la base 1, x, x^2, etc.
#RAW = FALSE usa los polinomios "default" que son base ortogonal
modelo.parabola <- lm(y~poly(x, 2, raw = TRUE), base.virus)
modelo.parabola
predict(modelo.parabola, data.frame(x = 16:18))

#OTRO EJERCICIO CON OTRA BASE
delitos <- DELITOSCDMX <- read.csv("Escuela/ITAM/Estadística Aplicada I/DropBox/DELITOSCDMX.csv")

coyoacan <- delitos %>% filter(geo_coordinacion == "COYOACAN")
coyoacan <- delitos %>% filter(geo_coordinacion == "COYOACAN" & cve_delito == "Homicidio doloso")

coyoacan <- coyoacan %>% select(dia_tot)
coyoacan <- coyoacan %>% mutate((diados = dia_tot*2))

#Contar
delitos <- delitos %>% group_by(cve_delito) %>% summarise(Mitotal = sum(dia_tot))
delitos %>% count()
