% Calcular el n-ésimo término de la sucesión de Fibonacci

function [y]=SucesionFibonacci(n)
x=ones(n,1);
for j=3:n
    x(j)=x(j-1)+x(j-2);
end
y=x(n);