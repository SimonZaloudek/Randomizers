#include <iostream>
#include <vector>

using namespace std;

class Login { // Login and password system
public:
    string name;
    string password;

    void startLogin() // Start of program
    {
        cout << "Name? " << endl;
        cin >> name;
        cout << "Enter password: " << endl;
        passwordVer();
    }

    void passwordVer() // Password verification
    {
        short counter = 0;
        do {
            cin >> password;
            if (password != "niggers") {
                cout << "Wrong password! Try again:" << endl;
                counter++;
            }
            if(counter > 4)
            {
                cout << "hint: i hate ..." << endl;
            }
        }
        while(password != "niggers");
    }

    string getName() // Getter for name
    {
        return name;
    }
};

class Core { // Body of the program
public:
    string input;

    void mainMenu(Login login) // Core menu of the program
    {
        int intInput;

        cout << "Welcome " + login.getName() + "!" << endl;
        cout << "_________________________________________" << endl;
        do {
            cout << "Randomize:" << endl;
            do {
                cout << "number (1) | string (2) | yesNo (3) | test(4) | quit (5)" << endl;
                cin >> intInput;
                if(inputControl(intInput))
                {
                    cout << "Wrong input!" << endl;
                }
            } while(inputControl(intInput));

            switch (intInput) {
                case 1:
                    intGen(); // Int generation
                    break;
                case 2:
                    stringGen(); // String generation
                    break;
                case 3:
                    yesNoGen(login); // YesNo Generation
                    break;
                case 4:
                    testGen(); // Test Generation
                    break;
                case 5:
                    break;
            }
        } while(intInput != 5);
    }

    void intGen() // Int generation
    {
        int minNumber;
        int maxNumber;

        do {
            int random;
            do {
                cout << "Min?" << endl;
                cin >> minNumber;
                cout << "Max?" << endl;
                cin >> maxNumber;
                if(minNumber >= maxNumber)
                {
                    cout << "Wrong input!" << endl;
                    cout << "Min number cannot be higher or equal as Max number..." << endl;
                }
            } while(minNumber >= maxNumber);

            srand(time(0));
            random = (minNumber + (rand() % (maxNumber - minNumber + 1)));
            cout << random << endl;

            restartControl();
        } while(input != "n");
    }

    void stringGen() // String generation
    {
        vector<string> options;
        do
        {
            cout << "Enter words to randomize: (type |decide| to randomize)" << endl;
            do
            {
                getline(cin, input);
                if(input != "decide")
                {
                    options.push_back(input);
                }
            } while(input != "decide");
            srand(time(0));
            int random = 0 + (rand() % options.size());
            cout << options[random] << endl;
            options.clear();

            restartControl();
        } while(input != "n");
    }

    void yesNoGen(Login login) // YesNo generation
    {
        string yesNo;
        vector<string> answer = {"yes", "no"};
        do
        {
            cout << "Enter your question.." << endl;
            cin >> yesNo;
            getline(cin, yesNo);
            if(login.getName() != "Lukas")
            {
                srand(time(0));
                int random = 0 + (rand() % answer.size());
                cout << answer[random] << endl;
            } else {
                cout << "No, rest is very important!!" << endl;
            }

            restartControl();
        } while(input != "n");
    }

    void testGen() // Test generation
    {

        int intInput;
        cout << "Type the required test options:  |2-8|" << endl;
        back:
        cin >> intInput;
        if (intInput < 2 || intInput > 8)
        {
            cout << "Wrong input.. |2-8|" << endl;
            goto back;
        }
        while(input != "n")
        {
            srand(time(0));
            int random = (0 + (rand() % intInput));
            cout << "Answer: " << (char)(97 + random) << endl;
            restartControl();
        }

    }

    bool inputControl(int num) // Input control for menu
    {
        return !(num > 0 && num < 6);
    }

    void restartControl()
    {
        do
        {
            cout << "Again? y/n" << endl;
            cin >> input;
            if(input != "n" && input != "y")
            {
                cout << "Wrong input!" << endl;
            }
        } while (input != "n" && input != "y");
    }
};

int main()
{
    if(true == false) // Core of the program
    {
        while (true != true) {
            cout << "Lukas je BOSS" << endl;
            continue;
        ahoj:;
            break;
            goto ahoj;
            return 5, 5;
        }
    }
    Login login;
    Core core;

    login.startLogin();
    core.mainMenu(login);
}

