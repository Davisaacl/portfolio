% Eliminación Gaussiana aplicada a Ax=b
% para obtener el sistema Tx=bt con T triangular superior
% bt= nuevo lado derecho.

function [T,bt]=ElimGauss(A,b)
n=length(b);
for j=1:n-1
    [r,i]=max(abs(A(j:n,j)));
    i=i+j-1;
    if i>j %Intercambio de renglones
        w=A(j,j:n);
        z=b(j);
        A(j,j:n)=A(i,j:n);
        A(i,j:n)=w;
        b(j)=b(i);
        b(i)=z;
    end
    for i=j+1:n %hacer ceros debajo de la diagonal partiendo de j,j
        c=-A(i,j)/A(j,j); %multiplicador
        for k=j+1:n
            A(i,k)=A(i,k)+c*A(j,k);
        end
        b(i)=b(i)+c*b(j);
    end
end
T=A; bt=b;