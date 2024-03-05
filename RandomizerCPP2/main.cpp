#include "menu.h"

#define TEST

int main()
{
    menu *mainMenu = new menu();
#ifndef TEST
    mainMenu->login();
#endif
    mainMenu->core();

    delete mainMenu;
    mainMenu = nullptr;
    return 0;
}
