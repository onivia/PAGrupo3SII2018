package principal;

import java.util.Arrays;

public class Programa {
    public static void main(String[] args) {
        //item1();
        //item2();
        item3(); //sergio medina-27agosto2018
    }
    
    public static void item1() {
        int numero = 8;
        int cantcifras = 1;
        int extractor = 10;
        int separador = 1;        
        int cifra = 0;
        int i = 0;

        while(i < cantcifras) {
            cifra = (numero % extractor) / separador;
            
            System.out.println(cifra);
            
            extractor *= 10; //extractor = extractor * 10;
            separador *= 10; //separador = separador * 10;
            i++;
        }
    }

    public static void item2() {
        String vocal = "Á"; //T/F
        
        boolean[] resultado = validaVocal(vocal);
        
        System.out.println(Arrays.toString(resultado));
    }
    
    private static boolean[] validaVocal(String vocal) {
        boolean[] resultado = {false,false}; //[0]-true-esta tildada; [1]-true-minuscula
        String[] vocalesTildadas = {"á","é","í","ó","ú"};                
        
        for (int i = 0; i < vocalesTildadas.length; i++) {
            if(vocal.toLowerCase().equals(vocalesTildadas[i])) {
                resultado[0] = true;
            }
        }
        if(vocal.toLowerCase().equals(vocal)) {
            resultado[1] = true; //es minuscula            
        }        
        
        return resultado;
    }

    public static void item3() {
        String cadena1 = "holas";
        String cadena2 = "adios";
        
        int contador1 = 0;
        int contador2 = 0;
        
        if(cadena1.length() > cadena2.length()){
            System.out.println("Cadena1");
            muestraCadena(cadena1);
        }else if(cadena2.length() > cadena1.length()){
            System.out.println("Cadena2");
            muestraCadena(cadena2);
        }else{
            System.out.println("Las cadenas son iguales");
        }
     
    }
    
    private static void muestraCadena(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i)); // Mostrar caracter a caracter
        }
    }
    
    public static void item4() {
        String cadena1 = "";
        String cadena2 = "";
        
                
    }
}
