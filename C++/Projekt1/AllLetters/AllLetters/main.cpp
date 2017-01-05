#include <iostream>


wchar_t x;
int main()
{
    for(int i = 0; i<10000; i++){
        x = i;
        std::cout << x;
    }
    return 0;
}

