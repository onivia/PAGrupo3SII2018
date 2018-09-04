#include <iostream>
#include <cstring>
using namespace std;

int main() {
    int ivar1 = 10;    
    double dvar1 = 10.53;
    char cvar1 = 't';
    int ivar2[3] = {10,20,30};
    char cvar2[16] = "hola";
    char cvar3[16] = "";
    int ivar3 = 0;
    int ivar4[2][3] = {
        {10,20,30},
        {40,50,60}
    };
    char cvar4[16] = "";
    
    cout<<"hola son las 8:12pm"<<" del 03 de sept 2018"<<endl;
    cout<<ivar1<<endl<<dvar1<<endl<<cvar1<<endl;
    cout<<ivar2[1]<<endl;
    cout<<"tamano arreglo int: "<<sizeof(ivar2)/sizeof(ivar2[0])<<endl;    
    cout<<"cvar2 es: "<<cvar2<<endl;
    
    cout<<"entre numero: ";
    cin>>ivar3;
    cout<<"\nentre cadena: ";
    cin.ignore();
    cin.getline(cvar3,16);
    
    cout<<"ivar3 es: "<<ivar3<<endl;
    cout<<"cvar3 es: "<<cvar3<<endl;
    cout<<"tamano arreglo char cvar3: "<<strlen(cvar3)<<endl;
    cout<<"la posi de 40 en ivar4 es: "<<ivar4[1][0]<<endl;
    
    strcpy(cvar4,"aaja eeche!");
    
    cout<<"cvar4: "<<cvar4<<endl;    
    return EXIT_SUCCESS;
}
