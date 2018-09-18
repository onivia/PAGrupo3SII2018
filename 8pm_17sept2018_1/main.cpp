#include <iostream>
#include <cstring>
using namespace std;

struct Producto {
    int codigo;
    char color[16];
    double precio;
};

int main() {    
    Producto *productos = NULL;
    productos = (Producto *)malloc(2*sizeof(Producto)); //new
    
    productos[0].codigo = 100;
    productos[0].precio = 550;
    strcpy(productos[0].color,"NEGRO");
    
    productos[1].codigo = 200;
    productos[1].precio = 9560;
    strcpy(productos[1].color,"AZUL");
    
    for(int i=0;i<2;i++) {
        if(productos[i].codigo==100) {
            cout<<productos[i].codigo<<endl;
            cout<<productos[i].precio<<endl;
            cout<<productos[i].color<<endl;
        }
    }

    return 0;
}
