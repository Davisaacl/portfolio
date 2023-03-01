library(ggplot2)
dientes <- read.csv("C:/Users/david/Downloads/dientes.csv")
ggplot(dientes) + geom_boxplot(aes(x = as.character(dose), y = len))
ggplot(dientes) + geom_boxplot(aes(x = as.character(dose), y = len), outlier.color = "firebrick", outlier.size = 5)
ggplot(dientes) + geom_boxplot(aes(x = as.character(dose), y = len), outlier.color = "firebrick", outlier.size = 5) + 
  stat_summary(aes(x = as.character(dose), y = len), fun.y=mean, geom="point", shape="triangle", size=4, color = "blue")
ggplot(dientes) + geom_boxplot(aes(x = as.character(dose), y = len), outlier.color = "firebrick", outlier.size = 5) + 
  stat_summary(aes(x = as.character(dose), y = len), fun.y=mean, geom="point", shape="triangle", size=4, color = "blue") + 
  geom_jitter(aes(x = as.character(dose), y = len), shape=16, position=position_jitter(0.2), alpha = 0.2)
