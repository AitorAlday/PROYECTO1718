--PROCEDURE GENERAR USUARIO Y LA CONTRASEÑA
CREATE OR REPLACE PROCEDURE PROCE_generarAutoUserPass(v_dni IN VARCHAR , v_nombre IN VARCHAR, v_apellido IN VARCHAR, v_tipo IN VARCHAR, v_codlogin OUT INTEGER) AS
  userr VARCHAR(30);
  pass VARCHAR(30);
BEGIN 
  userr := LOWER(v_dni);
  pass := LOWER(substr(v_nombre,1,1) || v_apellido);
   INSERT INTO login (usuario, contraseña, tipo) VALUES (usuario, contrasenia, v_tipo) RETURNING codlogin INTO v_codlogin;
EXCEPTION 
  WHEN OTHERS THEN 
    RAISE_APPLICATION_ERROR (-20100, 'ERROR INEXPERADO AL GENERAR EL LOGIN - USUARIO/CONTRASENIA: '|| SQLERRM);
END;