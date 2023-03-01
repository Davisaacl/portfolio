% Definir la función F de R^2 a R^3
% Dada  por F(x1,x2)=(x1^2-x2,x1*x2,ln(1+x1^2+x2^2)) en forma vectorial
function [y]=FuncionMultivariada(x)
y=zeros(3,1);
y(1)=x(1)^2-x(2);
y(2)=x(1)*x(2);
y(3)=log(1+x(1)^2+x(2)^2);