package com.sesionesJavaBasico.XMLyJSON;

import java.io.InputStream;
import java.io.FileInputStream;

import org.json.*;

public class ParseJSON {

    public static void main(String []args) {

        try {
            // Creamos el inputstream desde un fichero
            InputStream is = new FileInputStream("src/com/sesionesJavaBasico/XMLyJSON/datos.json");

            // Creamos un tokenizador que leera desde nuestro IS
            /*Tokenizador es la herramienta de los compiladores que va leyendo caracter a caracter
            * y va diciendo lo que es cada cosa. COnvierte a memoria la representación textual
            * del JSON*/
            JSONTokener tokener = new JSONTokener(is);

            // Y se lo pasamos a una instancia de la clase JSONObject
            /*El JSON funciona con objetos*/
            JSONObject obj = new JSONObject(tokener);

            // Sacamos las credenciales:
            JSONObject credenciales = obj.getJSONObject("credenciales");

            String usuario = credenciales.getString("usuario");
            String clave = credenciales.getString("clave");

            System.out.println("Usuario " + usuario + " clave " + clave);

            // Dentro de credenciales tenemos los videos:
            JSONArray videos = credenciales.getJSONArray("videos");
            for (Object video : videos) {
                System.out.println(video.toString());
            }

        } catch (Exception e) {
            System.out.println("No puedo leer el fichero: " + e.getMessage());
        }
    }
}