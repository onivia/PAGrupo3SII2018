#include <iostream>
using namespace std;

int sumar(int n1, int n2) {
    return (n1+n2);
}

int restar(int n1, int n2) {
    return (n1-n2);
}

int operacion(int (*pf)(int,int),int n1, int n2) {
    int resultado = 0;

    resultado = pf(n1,n2);
    
    return resultado;
}

int main() {    
    int r = 0;
    int (*wrapper[])(int,int) = {restar,sumar};    
    
    r = operacion(wrapper[0],50,20);    
    
    cout<<r<<endl;

    return 0;
}
