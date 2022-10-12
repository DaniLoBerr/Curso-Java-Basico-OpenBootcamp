package com.ejercicios.ejerciciosJavaBasico.EjercicioTemas789;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/** Sorpréndenos creando un programa de tu elección que utilice
 * InputStream, PrintStream, excepciones, un HashMap y
 * un ArrayList, LinkedList o array. */
/*
    Pues vamos a crear un programa que sirva para ofrecer información
    solicitada por un usuario sobre las enseñanzas de Formación Profesional
    que se ofertan en Asturias de la rama de la informática.

    El usuario seleccionará la FP sobre la cual desea obtener información y
    el programa le descargará un archivo de texto en su disco duro
    local con ella.
 */

public class Ejercicio9 {

    public static void main(String[] args) {

        // Datos FP ASIR
        byte[] infoCentrosASIR = obtenerInfo("/home/dlb/Agenda/Estudios/Cursos/Open Bootcamp/java-basico/sesiones/sesionesJavaBasico/datos-ejercicio9/lista-centros-asir.txt/");
        byte[] infoModulosASIR = obtenerInfo("/home/dlb/Agenda/Estudios/Cursos/Open Bootcamp/java-basico/sesiones/sesionesJavaBasico/datos-ejercicio9/lista-modulos-asir.txt/");
        byte[] infoCompetenciasASIR = obtenerInfo("/home/dlb/Agenda/Estudios/Cursos/Open Bootcamp/java-basico/sesiones/sesionesJavaBasico/datos-ejercicio9/lista-competencias-asir.txt/");

        ArrayList<byte[]> listaInfoASIR = new ArrayList<>();

        listaInfoASIR.add(infoCentrosASIR);
        listaInfoASIR.add(infoModulosASIR);
        listaInfoASIR.add(infoCompetenciasASIR);

        // Datos FP DAM
        byte[] infoCentrosDAM = obtenerInfo("/home/dlb/Agenda/Estudios/Cursos/Open Bootcamp/java-basico/sesiones/sesionesJavaBasico/datos-ejercicio9/lista-centros-dam.txt/");
        byte[] infoModulosDAM = obtenerInfo("/home/dlb/Agenda/Estudios/Cursos/Open Bootcamp/java-basico/sesiones/sesionesJavaBasico/datos-ejercicio9/lista-modulos-dam.txt/");
        byte[] infoCompetenciasDAM = obtenerInfo("/home/dlb/Agenda/Estudios/Cursos/Open Bootcamp/java-basico/sesiones/sesionesJavaBasico/datos-ejercicio9/lista-competencias-dam.txt/");

        ArrayList<byte[]> listaInfoDAM = new ArrayList<>();

        listaInfoDAM.add(infoCentrosDAM);
        listaInfoDAM.add(infoModulosDAM);
        listaInfoDAM.add(infoCompetenciasDAM);

        // Datos FP DAW
        byte[] infoCentrosDAW = obtenerInfo("/home/dlb/Agenda/Estudios/Cursos/Open Bootcamp/java-basico/sesiones/sesionesJavaBasico/datos-ejercicio9/lista-modulos-daw.txt/");
        byte[] infoModulosDAW = obtenerInfo("/home/dlb/Agenda/Estudios/Cursos/Open Bootcamp/java-basico/sesiones/sesionesJavaBasico/datos-ejercicio9/lista-modulos-daw.txt/");
        byte[] infoCompetenciasDAW = obtenerInfo("/home/dlb/Agenda/Estudios/Cursos/Open Bootcamp/java-basico/sesiones/sesionesJavaBasico/datos-ejercicio9/lista-competencias-daw.txt/");

        ArrayList<byte[]> listaInfoDAW = new ArrayList<>();

        listaInfoDAW.add(infoCentrosDAW);
        listaInfoDAW.add(infoModulosDAW);
        listaInfoDAW.add(infoCompetenciasDAW);

        // Mapa de las listas de las 3 FP
        HashMap<String, ArrayList<byte[]>> mapaListasFP = new HashMap<>();

        mapaListasFP.put("IFC301", listaInfoASIR);
        mapaListasFP.put("IFC302", listaInfoDAM);
        mapaListasFP.put("IFC303", listaInfoDAW);

        // Solicitud de datos
        Scanner introduceCodigoFP = new Scanner(System.in);
        System.out.println(
                "Introduce el código de la FP sobre la que quieres solicitar información. Los códigos son los siguientes:\n ASIR = IFC301\n DAM = IFC302\n DAW = IFC303\nIntroduzca aquí su código respetando las mayúsculas: "
        );
        String solicitudInfoFP = introduceCodigoFP.nextLine();

        // Entrega del documento
        for (Map.Entry<String, ArrayList<byte[]>> elementoMapa : mapaListasFP.entrySet()) {
            if (solicitudInfoFP.equals(elementoMapa.getKey())) {
                enviarArchivo(solicitudInfoFP, elementoMapa.getValue());
            }

        }
        System.out.println("El código solicitado no es válido");
    }

    public static byte[] obtenerInfo(String info) {

        byte[] datosArchivo = new byte[0];
        try {
            InputStream flujoDatos = new FileInputStream(info);
            BufferedInputStream bufferFlujoDatos = new BufferedInputStream(flujoDatos);
            datosArchivo = bufferFlujoDatos.readAllBytes();
            flujoDatos.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return datosArchivo;
    }

    public static void enviarArchivo(String codigoFP, ArrayList<byte[]> listaInfoFP) {

        String cicloFormativo = switch (codigoFP) {
            case "IFC301" -> "info-asir";
            case "IFC302" -> "info-dam";
            case "IFC303" -> "info-daw";
            default -> null;
        };

        try {
            PrintStream archivoFinal = new PrintStream("/home/dlb/Descargas/" + cicloFormativo + ".txt");
            for (byte[] infoFP : listaInfoFP) {
                try {
                    archivoFinal.write(infoFP);
                } catch (IOException e) {
                    e.getLocalizedMessage();
                }
            }
            archivoFinal.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
        }

        System.out.println("El documento ha sido enviado");
        System.exit(0);
    }

}
