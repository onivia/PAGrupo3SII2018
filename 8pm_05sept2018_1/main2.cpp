#include <iostream>
#include <fstream>

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

int main() {
    
    //escribirArchivo();
    leerArchivo();

    return 0;
}

