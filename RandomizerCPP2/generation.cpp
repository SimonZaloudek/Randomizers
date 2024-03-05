//
// Created by simon on 10/18/2023.
//

#include "generation.h"

#ifndef TEST
string name = (new menu)->getName();
#endif

void generation::intGen() {
    string min, max;
    srand(time(0));
    while (strInput != "n")
    {
        cout << "Min? Max?" << endl;
        cin >> min >> max;
        if (!intInputControl(min, max))
        {
            cout << "Input must be an integer!" << endl;
            continue;
        }
        if (max <= min)
        {
            cout << "Min number cannot be larger or equal than Max number!" << endl;
            continue;
        }
        int num = (rand() % stoi(max) + stoi(min));
        cout << "Random number is: " << num << endl << "Again? y|n" << endl;
        back:
            cin >> strInput;
            if (strInput != "y" && strInput != "n")
            {
                cout << "Wrong input! y|n" << endl;
                goto back;
            }
    }
}

void generation::stringGen()
{

}

void generation::letterGen()
{

}

void generation::testerGen()
{

}

void generation::yesNoGen()
{

}

bool generation::intInputControl(string num1, string num2)
{
    if (check_number(num1) && check_number(num2))
    {
        return true;
    } else
    {
        return false;
    }
}

bool generation::check_number(string str) {
    for (int i = 0; i < str.length(); i++)
        if (!isdigit(str[i]))
        {
            return false;
        } else
        {
            return true;
        }
}
