#include <iostream>
using namespace std;

void f1(char *p) {
    cout<<p<<endl;
}

int main() {    
    char cadena[] = "Hola hola";
    
    void (*pf)(char *) = &f1;
    
    pf(cadena);    

    return 0;
}

