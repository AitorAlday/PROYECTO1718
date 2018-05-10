SET serveroutput ON;
--PAQUETE DE GENERAR EL LOGIN

--CABECERA DEL PAQUETE
CREATE OR REPLACE PACKAGE Proyecto1718 IS
  PROCEDURE generarLogin (v_dni IN VARCHAR , v_nombre IN VARCHAR, v_tipo IN INTEGER);
END Proyecto1718;  

--CUERPO DEL PAQUETE
--Esta procedure coge como usuario el DNI de la persona y genera una contraseña cogiendola primera letra del nombre y el tipo de usuario que es
--0: Administrador
--1: Usuario
--2: Dueño
CREATE OR REPLACE PACKAGE BODY Proyecto1718 IS
  PROCEDURE generarLogin (v_dni IN VARCHAR , v_nombre IN VARCHAR, v_tipo IN INTEGER) AS
    usuario VARCHAR(15);
    pass VARCHAR(15);
  BEGIN 
    usuario := LOWER(v_dni);
    pass := LOWER(substr(v_nombre, 1, 1) || v_tipo);
     INSERT INTO login (usuario, contraseña, tipo) VALUES (usuario, pass, v_tipo);
  EXCEPTION 
    WHEN OTHERS THEN 
      RAISE_APPLICATION_ERROR (-20100, 'ERROR INESPERADO AL GENERAR EL LOGIN - USUARIO/CONTRASEÑA: '|| SQLERRM);
  END generarLogin;
END Proyecto1718;


