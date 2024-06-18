#include <iostream>
#include "Calculator.h"
using namespace std;

int main() {
    cout << "My Calculations" << endl;
    float input1, input2;
    while (true) {
        cout << "Input the first value (0 to exit): ";
        cin >> input1;
        if (input1 == 0) {
            break;
        }
        cout << "Input the second value (0 to exit): ";
        cin >> input2;
        if (input2 == 0) {
            break;
        }
        int a = static_cast<int>(input1);
        int b = static_cast<int>(input2);
        if (input1 == a && input2 == b) {
            int result = Add(a, b);
            cout << "Integer addition: " << a << " + " << b << " = " << result << endl;
        }
        else {
            float result = Add(input1, input2);
            cout << "Float addition: " << input1 << " + " << input2 << " = " << result << endl;
        }
    }
    cout << "Finished!" << endl;
    return 0;
}
