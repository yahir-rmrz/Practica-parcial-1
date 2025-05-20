/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa3;

/**
 *
 * @author yahir
 */
public class Operacion {
    public String Desencriptador(String a) {
        String cod = "";
        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
            int cp = a.codePointAt(i);
            if      (cp >= 48 && cp <= 57) cod += (char)('a' + (cp - 48)); 
            else if (cp >= 33 && cp <= 47) cod += (char)('k' + (cp - 33)); 
            else if (cp == 58)             cod += "z";
            else if (cp == 40)             cod += "(r";              
        }

        return cod;
    }

    public String Encriptador(String a) {
        String codigo = "";
        a = a.toLowerCase();
        for (int i = 0; i < a.length(); i++) {
                System.out.println(a.charAt(i));
            switch (a.codePointAt(i)) {
                case 97:
                    codigo = codigo + "0";  //a
                    break;
                case 98:
                    codigo = codigo + "1";  //b
                    break;
                case 99:
                    codigo = codigo + "2";  //c
                    break;
                case 100:
                    codigo = codigo + "3";  //d
                    break;
                case 101:
                    codigo = codigo + "4";  //e
                    break;
                case 102:
                    codigo = codigo + "5";  //f
                    break;
                case 103:
                    codigo = codigo + "6";  //g
                    break;
                case 104:
                    codigo = codigo + "7";  //h
                    break;
                case 105:
                    codigo = codigo + "8";  //i
                    break;
                case 106:
                    codigo = codigo + "9";  //j
                    break;
                case 107:
                    codigo = codigo + "!";  //k
                    break;
                case 108:
                    codigo = codigo + '"';  //l
                    break;
                case 109:
                    codigo = codigo + "#";  //m
                    break;
                case 110:
                    codigo = codigo + "$";  //n
                    break;
                case 111:
                    codigo = codigo + "%";  //o
                    break;
                case 112:
                    codigo = codigo + "&";  //p
                    break;
                case 113:
                    codigo = codigo + "'";  //q
                    break;
                case 114:
                    codigo = codigo + "(";  //r
                    break;
                case 115:
                    codigo = codigo + ")";  //s
                    break;
                case 116:
                    codigo = codigo + "*";  //t
                    break;
                case 117:
                    codigo = codigo + "+";  //u
                    break;
                case 118:
                    codigo = codigo + ",";  //v
                    break;
                case 119:
                    codigo = codigo + "-";  //w
                    break;
                case 120:
                    codigo = codigo + ".";  //x
                    break;
                case 121:
                    codigo = codigo + "/";  //y
                    break;
                case 122:
                    codigo = codigo + ":";  //z
                    break;
            }

        }

        return codigo;
    }   
    
    public int BuscarA(String a){
    a = a.toLowerCase();
    int c = 0;
        for (int i = 0; i < a.length(); i++) {
           if (a.codePointAt(i) == 97){
              c++;
        }
        }
    return c;
    }
    public int BuscarE(String a){
    a = a.toLowerCase();
    int c = 0;
        for (int i = 0; i < a.length(); i++) {
           if (a.codePointAt(i) == 101){
              c++;
        }
        }
    return c;
    }
    public int BuscarI(String a){
    a = a.toLowerCase();
    int c = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) == 105){
              c++;
        }
        }
    return c;
    }
    public int BuscarO(String a){
    a = a.toLowerCase();
    int c = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.codePointAt(i) == 111){
              c++;
        }
        }
    return c;
    }
    public int BuscarU(String a){
    a = a.toLowerCase();
    int c = 0;
        for (int i = 0; i < a.length(); i++) {
          if (a.codePointAt(i) == 117){
              c++;
        }
        }
    return c;
    }
    
}
