#include <iostream>
#include <fstream>
#include <stdlib.h>

using namespace std;

void escribirArchivo() {
    fstream archivo;
    archivo.open("C:\\crl\\salida.txt", ios::out | ios::app);
    archivo<<"linea 1\r\n";
    archivo<<"linea 2\r\n";
    archivo.close();
}

void leerArchivo() {
    fstream archivo;
    string linea;
    
    archivo.open("C:\\crl\\salida.txt", ios::in);
    if(archivo.is_open()) {
        while(getline(archivo,linea)) {
            cout<<linea<<endl;        
        }
        archivo.close();
    }
}

string obtieneLineaArchivo(string fullpatharchivo) {
    fstream archivo;
    string linea;
    
    archivo.open(fullpatharchivo, ios::in);
    if(archivo.is_open()) {
        getline(archivo,linea);
        archivo.close();
    }
    
    return linea;
}

void ordenaxSeleccion(int arreglo[], int tamanoArreglo) {
    int posiMenor = 0;
    int aux = 0;
    
    for(int i=0;i<tamanoArreglo-1;i++) {
        posiMenor = i;
        for(int j=(i+1);j<tamanoArreglo;j++) {
            if(arreglo[j]<arreglo[posiMenor]) {
                posiMenor = j;
            }            
        }
        //hacer intercambio
        aux = arreglo[i];
        arreglo[i] = arreglo[posiMenor];
        arreglo[posiMenor] = aux;
    }
}

void convierteNumerosyOrdena(string linea, string separador) {
    string lineaaux = linea;
    string snumero = "";
    int posi = 0;
    int nums[10] = {-1};
    int j = 0;
    
    while(lineaaux.size() > 0) {
       posi = lineaaux.find(separador);
       //if(posi > lineaaux.size() && lineaaux.size() > 0) {
       if(posi < 0) {
           snumero = lineaaux.substr(0,lineaaux.size());
           lineaaux = "";           
       }
       else {
           snumero = lineaaux.substr(0,posi);
           lineaaux = lineaaux.substr(posi+1,lineaaux.size());
       }
       nums[j++] = atoi(snumero.c_str());
    }
    
    
    //1. llamar al metodo que ordena
    //2. mostrar el arreglo, ya debe mostrarse de manera ordenada
    
}

int main() {
    
    //escribirArchivo();
    //leerArchivo();
    
    string fullPathArchivo = "C:\\crl\\numeros.txt";
    
    string lineaNums = obtieneLineaArchivo(fullPathArchivo);
    convierteNumerosyOrdena(lineaNums,",");

    return 0;
}
