//
// Created by simon on 15/10/2023.
//

#include "menu.h"

generation *gen = new generation();

void menu::login() {
    cout << "Name?" << endl;
    cin >> name;
    cout << "Password?" << endl;
    cin >> password;
    passwordCheck();
}
void menu::core()
{
    int input;
#ifndef TEST
    cout << "Welcome " << name << "!"<< endl;
    cout << "_____________________________" << endl;
#endif
    while(input != 6)
    {
        cout << "Select randomizing option:" << endl;
        cout << "Number (1) | String (2) | Letter (3) | Tester (4) | YesNo (5) | To exit: (6)" << endl;
        cin >> input;
        if (input < 1 || input > 6)
        {
            cout << "Wrong input!" << endl;
            continue;
        }
        switch (input)
        {
            case 1:
                gen->intGen();
                break;
            case 2:
                gen->stringGen();
                break;
            case 3:
                gen->letterGen();
                break;
            case 4:
                gen->testerGen();
                break;
            case 5:
                gen->yesNoGen();
                break;
            case 6:
                break;
        }
    }
}

void menu::passwordCheck()
{
    string pass;
    passFile.open("password.txt", ios::in);
    if (passFile.is_open())
    {
       getline(passFile, pass);
       while (this->password != pass)
       {
            cout << "Wrong password!" << endl;
            cin >> password;
       }
    }
}

string menu::getName()
{
    return name;
}


