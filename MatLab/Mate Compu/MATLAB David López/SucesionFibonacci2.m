%Nueva sucesión Fibonacci

function [y]=SucesionFibonacci2(n)
y=1;
x1=1;
x2=1;
for j=3:n
    y=x1+x2;
    x1=x2;
    x2=y;
end