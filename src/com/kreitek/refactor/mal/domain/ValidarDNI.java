package com.kreitek.refactor.mal.domain;

public class ValidarDNI {
    public static int validarDNI(Documentos revisarDNI){
        String dniChars="TRWAGMYFPDXBNJZSQVHLCKE";

        String partDNI = revisarDNI.numDNI.trim().replaceAll(" ", "").substring(0, 8);

        char ltrDNI = revisarDNI.numDNI.charAt(8);

        int valNumDni = Integer.parseInt(partDNI) % 23;

        if (revisarDNI.numDNI.length()!= 9 || isNumeric(partDNI) == false || dniChars.charAt(valNumDni)!= ltrDNI) {
            return 0;
        } else {
            return 1;
        }
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
