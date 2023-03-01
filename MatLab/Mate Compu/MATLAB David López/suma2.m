%Función que calcula 1+1/^2+1/3^2+...+1/p^2 con p entero positivo
function [s] = suma2(p)
s=0;
for n=1:p % Incremento de 1 en 1
    s=s+1/(n*2);
end
