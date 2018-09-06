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
    
    bool huboIntercambio = true;
    int aux = 0;
    int i = 0;
    while(huboIntercambio) {
        huboIntercambio = false;
        for(int i=0;i<(j-1);i++) {
            if(nums[i]>nums[i+1]) {
                aux = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = aux;
                huboIntercambio = true;
            }
        }
    }
    
    for(i=0;i<j;i++) {
        cout<<nums[i]<<endl;        
    }
}

int main2() {
    
    //escribirArchivo();
    //leerArchivo();
    
    string fullPathArchivo = "C:\\crl\\numeros.txt";
    
    string lineaNums = obtieneLineaArchivo(fullPathArchivo);
    convierteNumerosyOrdena(lineaNums,",");

    return 0;
}
