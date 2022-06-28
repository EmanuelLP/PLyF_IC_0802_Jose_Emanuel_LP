/*HECHOS*/
/*rutas(ubicacion,accion,evento)*/
rutas(goNorte,00,goNorte).
rutas(goNorte,10,goNorte).
rutas(goNorte,01).
rutas(01,waitNorte).
rutas(goNorte,11).
rutas(11,waitNorte).
rutas(waitNorte,00).
rutas(00,goEste).
rutas(waitNorte,01).
rutas(01,goEste).
rutas(waitNorte,10).
rutas(10,goEste).
rutas(waitNorte,11).
rutas(11,goEste).
rutas(goEste,00).
rutas(00,goEste).
rutas(goEste,01).
rutas(01,goEste).
rutas(goEste,10).
rutas(10,waitEste).
rutas(goEste,11).
rutas(11,waitEste).
rutas(waitEste,00).
rutas(00,goNorte).
rutas(waitEste,01).
rutas(01,goNorte).
rutas(waitEste,10).
rutas(10,goNorte).
rutas(waitEste,11).
rutas(11,goNorte).
*/


/*REGLAS*/
/*si esta en la misma ubicacion y la accion se cumple va a evento*/
accion(A,B):- rutas(A,B).
accion(A,B):- rutas(A,X),accion(X,B).






