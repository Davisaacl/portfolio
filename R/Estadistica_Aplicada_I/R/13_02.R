library(ggplot2)
seguro.pop <- read.csv("Escuela/ITAM/Estadística Aplicada I/DropBox/Poblacion_Aflilada_Seguro_Popular_INEGI.csv")

ggplot(seguro.pop) +
  geom_bar(aes(x = Entidad, weight = PorcentajeAfiliada, fill = Entidad)) + facet_wrap(~Periodo) + theme_bw() +
  ylab("Algo") + xlab("Algo2") + ggtitle("Título") + theme(axis.title.x = element_text(angle = 90))
