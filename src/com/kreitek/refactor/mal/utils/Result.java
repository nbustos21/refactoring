package com.kreitek.refactor.mal.utils;

import com.kreitek.refactor.mal.domain.Documentos;

public class Result {
    public static void resultEncabezado(){
        System.out.println("=====================");
        System.out.println("Vamos a refactorizar!");
        System.out.println("=====================");
    }
    public static Boolean validacionDNI(Documentos dni){
        return dni.validarDNI()==1;
    }
    public static void resultado(Documentos dni){
        Boolean validador = validacionDNI(dni);
        System.out.println( dni.enumTipo+" "+dni.numDNI+" es: " + validador.toString());
    }
}
