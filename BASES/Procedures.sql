--PROCEDURE GENERAR USUARIO Y LA CONTRASEÑA

--Esta procedure coge como usuario el DNI de la persona y genera una contraseña cogiendola primera letra del nombre y el tipo de usuario que es
--0: Administrador
--1: Usuario
--2: Dueño
CREATE OR REPLACE PROCEDURE PROCE_generarAutoUserPass(v_dni IN VARCHAR , v_nombre IN VARCHAR, v_tipo IN VARCHAR) AS
  userr VARCHAR(30);
  pass VARCHAR(30);
BEGIN 
  userr := LOWER(v_dni);
  pass := LOWER(substr(v_nombre, 1, 1) || v_tipo);
   INSERT INTO login (usuario, contraseña, tipo) VALUES (usuario, contrasenia, v_tipo);
EXCEPTION 
  WHEN OTHERS THEN 
    RAISE_APPLICATION_ERROR (-20100, 'ERROR INEXPERADO AL GENERAR EL LOGIN - USUARIO/CONTRASENIA: '|| SQLERRM);
END;