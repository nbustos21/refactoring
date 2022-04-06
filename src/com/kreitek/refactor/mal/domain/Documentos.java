package com.kreitek.refactor.mal.domain;

import com.kreitek.refactor.mal.utils.TipoDocumento;

import java.util.Date;

public class Documentos {
    public TipoDocumento enumTipo;
    public String numDNI;
    public Date fchValidez;
    public Documentos(TipoDocumento tipo, String numDNI, Date fchValidez) {
        this.enumTipo = tipo;
        this.numDNI = numDNI;
        this.fchValidez = fchValidez;
    }
    public int validarDNI() {
        switch (this.enumTipo) {
            case DNI:
                return ValidarDNI.validarDNI(this);
            case CIF:
                return ValidarCIF.validarCIF(this);
            case NIE:
                return ValidarNIE.validarNIE(this);
            default:
                return -99;
        }
    }
}
