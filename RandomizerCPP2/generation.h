//
// Created by simon on 10/18/2023.
//

#ifndef RANDOMIZERCPP2_GENERATION_H
#define RANDOMIZERCPP2_GENERATION_H

#include<iostream>
#include<cstdlib>
#include "menu.h"

using namespace std;

class generation {
private:
    string strInput;
    int intInput;
public:
    void intGen();
    void stringGen();
    void letterGen();
    void testerGen();
    void yesNoGen();
    bool intInputControl(string num1, string num2);
    bool check_number(string str);
};


#endif //RANDOMIZERCPP2_GENERATION_H
