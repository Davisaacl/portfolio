% Aproximar la raíx cuadrada del número a con el método de Newton usando
% n iteraciones. La aproximación inicial es x0.

function [y]=RaizCuadrada(a,x0,n)
x=zeros(n+1,1);
x(1)=x0;
for i=1:n
    x(i+1)=(x(i)+a/x(i))/2;
end
y=x(n+1);

