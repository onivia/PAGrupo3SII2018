#include <iostream>
#include <cstring>
#include <cstdlib>
using namespace std;

struct Factura {
    int numero;
    double total;
};

struct Cliente {
    int nit;
    char razon[32];
    int cantfacturas;
    Factura *facturas;
};

int main() {
    Cliente *clientes = NULL;
    Factura *facturas = NULL;
    int cantclientes = 0;
    int cantfacturas = 0;
    
    cout<<"Entre cantidad de clientes: ";
    cin>>cantclientes;
    
    clientes =(Cliente *)calloc(cantclientes,sizeof(Cliente));
    for(int i=0;i<cantclientes;i++) {
        cout<<"\nEntre nit del cliente ("<<i+1<<"):";
        cin>>clientes[i].nit;
        cout<<"\nEntre la razon social del cliente ("<<i+1<<"):";
        cin.ignore();
        cin.getline(clientes[i].razon,32);
        cout<<"\nEntre cantidad de facturas para el cliente ("<<i+1<<"):";
        cin>>cantfacturas;
        clientes[i].cantfacturas = cantfacturas;
        facturas =(Factura *)calloc(cantfacturas,sizeof(Factura));
        for(int j=0;j<cantfacturas;j++) {
            cout<<"\n\tEntre el numero de la factura ("<<j+1<<") del cliente ("<<i+1<<"):";
            cin>>facturas[j].numero;
            cout<<"\n\tEntre el total de la factura ("<<j+1<<") del cliente ("<<i+1<<"):";            
            cin>>facturas[j].total;            
        }
        clientes[i].facturas = facturas;
    }

    for(int i=0;i<cantclientes;i++) {
        cout<<"\nEl nit del cliente ("<<i+1<<") es:"<<clientes[i].nit;
        cout<<"\nLa razon social del cliente ("<<i+1<<") es:"<<clientes[i].razon;
        cout<<"\nLa cantidad de facturas del cliente ("<<i+1<<") es:"<<clientes[i].cantfacturas;
        for(int j=0;j<clientes[i].cantfacturas;j++) {            
            cout<<"\n\tEl numero de la factura ("<<j+1<<") es:"<<clientes[i].facturas[j].numero;
            cout<<"\n\tEl total de la factura ("<<j+1<<") es:"<<clientes[i].facturas[j].total;                        
        }
        free(clientes[i].facturas);
        clientes[i].facturas = NULL;
    }
    facturas = NULL;
    free(clientes);
    clientes = NULL;
    
    return 0;
}

