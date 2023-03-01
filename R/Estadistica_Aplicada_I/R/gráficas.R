# Mientras llegan
library(ggplot2)
n = 100 #variable
sim = rnorm(n,2,0.5)
x = seq(min(sim),max(sim),length.out=100)
y=dnorm(x,2,0.5)
ggplot() + geom_line(aes(x=x,y=y)) + geom_density(aes(x=sim), color="red",kernel="gaussian") +
 geom_line(aes(x=x,y=y)) + geom_density(aes(x=sim), color="blue",kernel="rectangular") +
 geom_line(aes(x=x,y=y)) + geom_density(aes(x=sim), color="green",kernel="epanechnikov")
ggsave("gráficas.pdf",width=6,height=4)
