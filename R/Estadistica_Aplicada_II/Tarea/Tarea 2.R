#Seccion 1
X<- c(60,62,61,55,53,60,63,53,52,48,49,43)
Y <-c(23,23,25,25,26,26,29,30,30,32,33,31)
Xm <-mean(X)
Ym<- mean(Y)
cor(X,Y)
t<- c(0,1,2,3,4,5,6,7,8,9,10,11)
tm<- mean(t)

b1tx<-{length(X)*sum(X*t)-sum(X)*sum(t)}/{length(t)*sum(t^2)-{sum(t)}^2}
b0tx<- Xm-b1tx*tm

Xt <-b0tx+b1tx*t
Xgt<-X-Xt

b1ty<-{length(Y)*sum(Y*t)-sum(Y)*sum(t)}/{length(t)*sum(t^2)-{sum(t)}^2}
b0ty<- Ym-b1ty*tm

Yt <-b0ty+b1ty*t
Ygt<-Y-Yt

cor(Xgt,Y)
cor(Xgt,Ygt)
cor(X,Y)

#Seccion 2
X1 <-c(10,8,13,9,11,14,6,4,12,7,5)
Y1<-c(8.04,6.95,7.58,8.81,8.33,9.96,7.24,4.26,10.84,4.82,5.68)

X2<-c(10,8,13,9,11,14,6,4,12,7,5)
Y2<-c(9.14,8.14,8.74,8.77,9.26,8.10,6.13,3.10,9.13,7.26,4.74)

X3<-c(10,8,13,9,11,14,6,4,12,7,5)
Y3<-c(7.46,6.77,12.74,7.11,7.81,8.84,6.08,5.39,8.15,6.42,5.73)

X4<-c(8,8,8,8,8,8,8,19,8,8,8)
Y4<-c(6.58,5.76,7.71,8.84,8.47,7.04,5.25,12.5,5.56,7.91,6.89)

b1x1<-{length(Y1)*sum(Y1*X1)-sum(Y1)*sum(X1)}/{length(X1)*sum(X1^2)-{sum(X1)}^2}
b0x1<- mean(Y1)-b1x1*mean(X1)

b1x2<-{length(Y2)*sum(Y2*X2)-sum(Y2)*sum(X2)}/{length(X2)*sum(X2^2)-{sum(X2)}^2}
b0x2<- mean(Y2)-b1x2*mean(X2)

b1x3<-{length(Y3)*sum(Y3*X3)-sum(Y3)*sum(X3)}/{length(X3)*sum(X3^2)-{sum(X3)}^2}
b0x3<- mean(Y3)-b1x3*mean(X3)

b1x4<-{length(Y4)*sum(Y4*X4)-sum(Y4)*sum(X4)}/{length(X4)*sum(X4^2)-{sum(X4)}^2}
b0x4<- mean(Y4)-b1x4*mean(X4)

#correlaciones
cor(X1,Y1)
cor(X2,Y2)
cor(X3,Y3)
cor(X4,Y4)

#graficos
x<-1:20

y1<-b0x1 + b1x1*x
y2<-b0x2 + b1x2*x
y3<-b0x3 + b1x3*x
y4<-b0x4 + b1x4*x
par(mfrow=c(2,2))

plot(x,y1,type = "l",
     ylim = c(4, 12),
     xlim = c(4, 15) )
points(X1, Y1,type = "p")

plot(x,y2,type = "l",
     ylim = c(4, 12),
     xlim = c(4, 15) )
points(X2, Y2,type = "p")

plot(x,y3,type = "l",
     ylim = c(4, 15),
     xlim = c(4, 15) )
points(X3, Y3,type = "p")

plot(x,y4,type = "l",
     ylim = c(4, 15),
     xlim = c(4, 20) )
points(X4, Y4,type = "p")
