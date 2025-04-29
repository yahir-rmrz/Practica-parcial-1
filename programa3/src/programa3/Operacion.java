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
            switch (a.codePointAt(i)) {
                case 48:
                    cod = cod + "a";  
                    break;
                case 49:
                    cod = cod + "b";  
                    break;
                case 50:
                    cod = cod + "c";  
                    break;
                case 51:
                    cod = cod + "d"; 
                    break;
                case 52:
                    cod = cod + "e";  
                    break;
                case 53:
                    cod = cod + "f"; 
                    break;
                case 54:
                    cod = cod + "g";  
                    break;
                case 55:
                    cod = cod + "h";  
                    break;
                case 56:
                    cod = cod + "i";  
                    break;
                case 57:
                    cod = cod + "j";  
                    break;
                case 33:
                    cod = cod + "k";  
                    break;
                case 34:
                    cod = cod + "l";  
                    break;
                case 35:
                    cod = cod + "m";  
                    break;
                case 36:
                    cod = cod + "n";  
                    break;
                case 37:
                    cod = cod + "o";  
                    break;
                case 38:
                    cod = cod + "p";  
                    break;
                case 39:
                    cod = cod + "q";  
                    break;
                case 40:
                    cod = cod + "(r";  
                    break;
                case 41:
                    cod = cod + "s";  
                    break;
                case 42:
                    cod = cod + "t";  
                    break;
                case 43:
                    cod = cod + "u";  
                    break;
                case 44:
                    cod = cod + "v"; 
                    break;
                case 45:
                    cod = cod + "w";  
                    break;
                case 46:
                    cod = cod + "x"; 
                    break;
                case 47:
                    cod = cod + "y";  
                    break;
                case 58:
                    cod = cod + "z";  
                    break;
            }

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
