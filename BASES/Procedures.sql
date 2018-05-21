SET serveroutput ON;
--PAQUETE DE BUSCAR EL EQUIPO

--CABECERA DEL PAQUETE
CREATE OR REPLACE PACKAGE PaqueteBuscarEquipo IS
  TYPE c_buscar IS REF CURSOR;
  PROCEDURE buscarJugadoresEquipo (v_jugador OUT c_buscar);
END PaqueteBuscarEquipo;   

--CUERPO DEL PAQUETE
--Esta procedure busca el equipo que crea el dueño usando el nombre del equipo para sacar todos los nombres de los jugadores en un jList de la ventana de Java
CREATE OR REPLACE PACKAGE BODY PaqueteBuscarEquipo IS 
  PROCEDURE buscarJugadoresEquipo (v_jugador OUT c_buscar) 
  IS
  BEGIN 
    OPEN v_jugador FOR
      SELECT * FROM Jugador j, Equipo e WHERE j.id_equipo=e.id_equipo;
    EXCEPTION 
      WHEN OTHERS THEN
        RAISE_APPLICATION_ERROR(-20001, 'ERROR');
  END buscarJugadoresEquipo;
END PaqueteBuscarEquipo; 



