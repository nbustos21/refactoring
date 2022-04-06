package com.kreitek.refactor.mal;

import com.kreitek.refactor.mal.domain.Documentos;
import com.kreitek.refactor.mal.utils.Result;
import com.kreitek.refactor.mal.utils.TipoDocumento;

class  Main {
    public static void main(String args[])
    {
        Result.resultEncabezado();

        Documentos dniCorrecto = new Documentos(TipoDocumento.DNI, "11111111H", null);
        Result.validacionDNI(dniCorrecto);
        Result.resultado(dniCorrecto);

        Documentos dniIncorrecto = new Documentos(TipoDocumento.DNI, "24324356A", null);
        Result.validacionDNI(dniIncorrecto);
        Result.resultado(dniIncorrecto);

        Documentos nieCorrecto = new Documentos(TipoDocumento.NIE, "X0932707B", null);
        Result.validacionDNI(nieCorrecto);
        Result.resultado(nieCorrecto);

        Documentos nieIncorrecto = new Documentos(TipoDocumento.NIE, "Z2691139Z", null);
        Result.validacionDNI(nieIncorrecto);
        Result.resultado(nieIncorrecto);

        Documentos cifCorrecto = new Documentos(TipoDocumento.CIF, "W9696294I", null);
        Result.validacionDNI(cifCorrecto);
        Result.resultado(cifCorrecto);

        Documentos cifIncorrecto = new Documentos(TipoDocumento.CIF, "W9696294A", null);
        Result.validacionDNI(cifIncorrecto);
        Result.resultado(cifIncorrecto);
    }
}