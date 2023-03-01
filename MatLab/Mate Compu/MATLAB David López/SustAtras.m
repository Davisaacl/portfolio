% Funcion que resuelve un sitema de ecuaciones
% con sustitución hacia atrás. Suponer que la matriz del sistema
% es triangular superor. Sistema: Tx=b

function [x]=SustAtras(T,b)
n=length(b);
x=zeros(n,1);%vector columnas (r,c)
x(n)=b(n)/T(n,n);
for k=1:n-1
    suma=0;
    for j=n-k+1:n
        suma=suma+T(n-k,j)*x(j);
    end
    x(n-k)=(b(n-k)-suma)/T(n-k,n-k);
end
