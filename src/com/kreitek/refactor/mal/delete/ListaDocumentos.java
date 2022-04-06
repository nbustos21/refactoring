package com.kreitek.refactor.mal.delete;

import com.kreitek.refactor.mal.utils.TipoDocumento;
import com.kreitek.refactor.mal.domain.Documentos;
import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.List;


public class ListaDocumentos extends Main{
    public static List<Documentos> documentos = new ArrayList<>();
    public static void insertarDocumentos(){
        documentos.add(new Documentos(TipoDocumento.DNI, "11111111H",null));
        documentos.add(new Documentos(TipoDocumento.DNI, "24324356A",null));
        documentos.add(new Documentos(TipoDocumento.NIE, "X0932707B",null));
        documentos.add(new Documentos(TipoDocumento.NIE, "Z2691139Z",null));
        documentos.add(new Documentos(TipoDocumento.CIF, "W9696294I",null));
        documentos.add(new Documentos(TipoDocumento.CIF, "W9696294A",null));
    }
}
