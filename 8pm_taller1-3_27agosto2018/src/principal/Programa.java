package principal;

import java.util.Arrays;
import java.util.Random;

public class Programa {
    public static void main(String[] args) {
        //item1();
        //item2();
        //item3(); //sergio medina-27agosto2018
        //item5();        
        //item6();
        item8();
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

    public static void item5() {
        int[] nums = {1,2,1,2,3};
        
        /*
        ordenaAscendentemente(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("el mayor es: " + nums[nums.length - 1]);        
        System.out.println("el menor es: " + nums[0]);
        */
        int numMasRepetido = getNumeroMasRepetido(nums);
        
        if(numMasRepetido != -1)
            System.out.println("El numero mas repetido es: " + numMasRepetido);
        else
            System.out.println("no hay repetidos o es INDETERMINADO");
    }
    
    public static void item6() {
        //[3,7]
        //dif = 4
        //A(5) -> idesde + 4 = 7
        int idesde = 3;
        int ihasta = 7;
        int diferenciaRango = 0;
        
        Random numAleatorioDiferencia = new Random();
        diferenciaRango = ihasta - idesde;
        int numAleatorioRango = idesde + numAleatorioDiferencia.nextInt(diferenciaRango + 1);
        
        System.out.println(numAleatorioRango);
    }
    
    public static void item8() {
        //bottom-top drive
        
        String[] contrasenas = generarContrasenasValidas(5);
        
        System.out.println(Arrays.toString(contrasenas));        
    }
    
    private static String[] generarContrasenasValidas(int cantContrasenas) {
        String[] simbolos ={"a","e","i","o","u","b","c","d","f","g","0","1","2","3","4","_","*","+","%"};
        String[] contrasenas = new String[cantContrasenas];
        String contrasena = "";
        
        int i = 0;
        while(i < contrasenas.length) {
            contrasena = generarContrasenaValida(simbolos, cantContrasenas);
            if(!estaRepetidaContrasena(contrasenas, contrasena)) {
                contrasenas[i] = contrasena;
                i++;                                                
            }
        }
        
        return contrasenas;
    }
    
    private static boolean estaRepetidaContrasena(String[] contrasenas, String contrasena) {
        boolean estaRepetida = false;
        
        for (int i = 0; i < contrasenas.length; i++) {
            if(contrasenas[i] != null && contrasenas[i].equals(contrasena)) {
                estaRepetida = true;
                break;                
            }                
        }
        
        return estaRepetida;        
    }
    
    private static String generarContrasenaValida(String[] simbolos, int longContrasena) {
        //{"a","e","i","o","u","b","c","d","f","g","0","1","2,"3","4","_","*","+","%"}        
        String[] contrasena = new String[longContrasena];
        String resultado = "";
        
        
        contrasena[0] = simbolos[getAleatorio(0, 15)];
        
        int i = 1;
        while(i < longContrasena) {
            contrasena[i] = simbolos[getAleatorio(0, 18)];
        
            if(valideRepeticionesSimbolo(contrasena, contrasena[i], 2)) {
                i++;
            }
        }
        
        for (int j = 0; j < contrasena.length; j++)
            resultado += contrasena[j]; //resultado = resultado + contrasena[j];
        
        return resultado;
    }
    
    private static boolean valideRepeticionesSimbolo(String[] contrasena, String simbolo, int cantMaxRepeticiones) {
        int cantRepeticionesSimbolo = 0;
        boolean esValidaRepeticiones = false;
        
        for (int i = 0; i < contrasena.length; i++) {
            if(contrasena[i] != null && contrasena[i].equals(simbolo))
                cantRepeticionesSimbolo++;
        }
        
        esValidaRepeticiones = (cantRepeticionesSimbolo > 1) ? false : true;        
        
        return esValidaRepeticiones;
    }
    
    private static int getAleatorio(int desde, int hasta) {        
        int diferenciaRango = 0;
        
        Random numAleatorioDiferencia = new Random();
        diferenciaRango = hasta - desde;
        int numAleatorioRango = desde + numAleatorioDiferencia.nextInt(diferenciaRango + 1);        
        
        return numAleatorioRango;
    }
    
    private static int getNumeroMasRepetido(int[] arreglo) {
        //1. obtener un arreglo con las repeticiones
            //{2,4,2,1,2,2} - {3,0,2,0,1,0} 
        //2. obtener la posicion de la repeticion mayor en el arreglo de repeticiones,
        // para luego obtener en el arreglo original el valor que mas se repite.
        /*
        {1,0,1,0} -> -1 indeterminado
        {0,0} -> -1 no hay repeticiones
        {0,2,1} -> 1
        {0} -> 0
        {2} -> 0
        */       
        
        int numMasRepetido = -1;
        int[] arregloRepeticiones = getArregloRepeticiones(arreglo);
        int posiMasRepetido = getPosicionRepeticionMayor(arregloRepeticiones);       
        
        if(posiMasRepetido >= 0)
            numMasRepetido = arreglo[posiMasRepetido];
        
        return numMasRepetido;        
    }
    
    private static int[] getArregloRepeticiones(int[] arreglo) {
        int[] arregloRepeticiones = new int[arreglo.length];
        
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = (i+1); j < arreglo.length; j++) {
                if(arreglo[i] == arreglo[j]) {
                    arregloRepeticiones[i]++;                    
                }                
            }            
        }

        return arregloRepeticiones;
    }
    
    private static int getPosicionRepeticionMayor(int[] arregloRepeticiones) {
        int posiMayor = 0;
        
        //Busco el mayor en el arreglo de repeticiones
        for (int i = 0; i < arregloRepeticiones.length - 1; i++) {
            if(arregloRepeticiones[i+1] > arregloRepeticiones[posiMayor]) {
                posiMayor = i + 1;                
            }
        }
        
        //valido que las repeticiones de ese mayor no coincidan con las de otro numero
        for (int i = 0; i < arregloRepeticiones.length; i++) {
            if(arregloRepeticiones[i] == arregloRepeticiones[posiMayor] && i != posiMayor) {
                posiMayor = -1;
                break;
            }                
        }
        
        return posiMayor;
    }
    
    private static void ordenaAscendentemente(int[] arreglo) {
        boolean huboIntercambio = true;
        int aux = 0;
        
        while(huboIntercambio) {
            huboIntercambio = false;
            for (int i = 0; i < arreglo.length - 1; i++) {
                if(arreglo[i] > arreglo[i+1]) {
                    aux = arreglo[i+1];
                    arreglo[i+1] = arreglo[i];
                    arreglo[i] = aux;
                    huboIntercambio = true;
                }                
            }                        
        }
    }
}
