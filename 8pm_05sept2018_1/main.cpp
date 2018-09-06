#include <iostream>
#include <cstring>
using namespace std;

void item9() {
    char cadena[16] = "hola";
    
    for(int i=strlen(cadena)-1;i>=0;i--) {
        cout<<cadena[i]<<endl;
    }    
}

void item10() {
    int nums[] = {1,4,2,8,3,3,2,9,6};
    bool huboIntercambio = true;
    int aux = 0;
    
    while(huboIntercambio) {
        huboIntercambio = false;
        for(int i=0;i<(sizeof(nums)/sizeof(nums[0]))-1;i++) {
            if(nums[i]<nums[i+1]) {
                aux = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = aux;
                huboIntercambio = true;
            }
        }
    }
    
    for(int i=0;i<(sizeof(nums)/sizeof(nums[0]));i++) {
        cout<<nums[i]<<endl;        
    }
}

int main1() {
    item10();    
    
    return 0;
}

