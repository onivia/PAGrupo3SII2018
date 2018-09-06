#include <iostream>
using namespace std;

void f1(int a) {
    a = a + 1;
}

void f2(int arr[]) {
    arr[0] = arr[0] + 1;
}

int main() {
    int var1 = 10;
    int var2[1] = {20};
    
    f1(var1);
    cout<<var1<<endl;
    
    f2(var2);
    cout<<var2[0]<<endl;

    return 0;
}

