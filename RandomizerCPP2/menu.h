//
// Created by simon on 15/10/2023.
//

#ifndef RANDOMIZERCPP2_MENU_H
#define RANDOMIZERCPP2_MENU_H

#include<iostream>
#include "generation.h"
#include<fstream>

using namespace std;

class menu {
private:
    string name;
    string password;
    fstream passFile;
public:
    void login();
    void passwordCheck();
    void core();
    string getName();
};


#endif //RANDOMIZERCPP2_MENU_H
