/*HECHOS*/
/*relacion entre el objeto (a,b)*/
parent(nathan,steve).
parent(nathan,edith).
parent(david,john).
parent(jim,david).
parent(steve,jim).
parent(david,adrian).
parent(jim,homero).
parent(homero,bart).
parent(homero,lisa).
parent(homero,magie).
parent(edith,ramon).
parent(edith,felipe).

/*REGLAS*/
/*el nombre de la regla grandparent(a,b)
debe de estar relacionado dos hechos diferentes que contengan un objeto
en comun.*/
grandparent(A,B) :- parent(A,B).
grandparent(A,B) :- parent(A,X),parent(X,B).
/* La regla brother (a,b) la relacion entre 2 hechos deben de tener que el objeto sea igual en este caso hace relacion a un padre que sea igual para dar la relacion de hermano
*/
brother(A,B) :- parent(A,X),parent(B,Y), Y==X.

ancestor(A,B) :- parent(A,B).
ancestor(A,B) :- parent(A,X),ancestor(X,B).

/*CONSULTAS*/
/*
?- ancestor(X,john).
grandparent(lisa,bart).
*/
