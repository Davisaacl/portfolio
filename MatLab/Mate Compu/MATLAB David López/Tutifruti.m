% Ejemplo de una funci�n en MATLAB llamada Tutifruti
function [T,d]=Tutifruti(a,b,W)
d=det(W);
u=a+b;
T=[u, a-b; a*b, a/b]; % Las variables dentro de la funci�n no las reconoce por s� solas.
