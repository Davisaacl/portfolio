% Definir matriz de 100x100
x=ones(100,1);
for j=2:100
    x(j)=1/sin(j);
end
A=zeros(100,100);
for i=1:100
    for j=1:100
        A(i,j)=x(i)^(j-1);
    end
end
