% Ver tonos de gris como imagen de una matriz
A=zeros(256,256);
for i=1:256
    for j=1:256
        A(i,j)=i-1;
    end
end
imagesc(A)
