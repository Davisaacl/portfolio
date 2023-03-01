% Definir una matriz de 501x501 que represewnte una imagen en blanco
% y negro

A=zeros(501,501);
for i=1:250
    for j=i+1:501-i
        A(i,j)=255;
        A(502-i,j)=255;
    end
end
imagesc(A)
colormap gray
