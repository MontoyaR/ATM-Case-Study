## ATM Case Study

_Object-Oriented Project_

## Timeline
**August 30, 2019**

-   Briefly glanced through the project and analyzed objectives required.

**September 13, 2019**

-   Added requirements to README using StackEdit

## Requirements
A local bank intends to install a new automated teller machine (ATM) to allow users (i.e.,bank customers) to perform basic financial transactions. Each user can have only one account at the bank. ATM users should be able to view their account balance, withdraw cash (i.e., take money out of an
account) and deposit funds (i.e., place money into an account). The user interface of the automated teller machine contains:

- a screen that displays messages to the user
- a keypad that receives numeric input from the user
- a cash dispenser that dispenses cash to the user and
- a deposit slot that receives deposit envelopes from the user.

The cash dispenser begins each day loaded with 500 $20 bills. [Note: Owing to the limited scope of this case study, certain elements of the ATM described here do not accurately mimic those of a real ATM. For example, a real ATM typically contains a device that reads a user’s account number from an ATM card, whereas this ATM asks the user to type the account number on the keypad. A real ATM also usually prints a receipt at the end of a session, but all output from this ATM appears on the screen.]


Upon first approaching the ATM, the user should experience the following sequence of events (shown in Fig. 33.1): 

![enter image description here](https://lh3.googleusercontent.com/V7ADOMFt7WuD-g9SCXnuK-sgvyY8xVESY6TMCDRMb38u3CBsdWVKjgmUhJH_SnXeGFprNtCJmh9F "Fig. 33.1")

1. The screen displays Welcome! and prompts the user to enter an account number.
2. The user enters a five-digit account number using the keypad.
3. The screen prompts the user to enter the PIN (personal identification number) associated with the specified account number.
4. The user enters a five-digit PIN using the keypad.
5. If the user enters a valid account number and the correct PIN for that account, the screen displays the main menu (Fig. 33.2). If the user enters an invalid account number or an incorrect PIN, the screen displays an appropriate message, then the ATM returns to Step 1 to restart the authentication process.

![enter image description here](https://lh3.googleusercontent.com/Nx--rbLR-Hbj2b0KBDdQC-dBdLj4gFDn2sUJa8fJbUOYmaKaIzcHKR2nv1wtpT3nkkIGKhNDlEC7 "Fig. 33.2")

After the ATM authenticates the user, the main menu (Fig. 33.2) should contain a numbered option for each of the three types of transactions: balance inquiry (option 1), withdrawal (option 2) and deposit (option 3). It also should contain an option to allow the user to exit the system (option 4). The user then chooses either to perform a transaction (by entering 1, 2 or 3) or to exit the system (by entering 4).

If the user enters 1 to make a balance inquiry, the screen displays the user’s account balance. To do so, the ATM must retrieve the balance from the bank’s database. The following steps describe what occurs when the user enters 2 to make a withdrawal:

1. The screen displays a menu (Fig. 33.3) containing standard withdrawal amounts:$20 (option 1), $40 (option 2), $60 (option 3), $100 (option 4) and $200 (option 5). The menu also contains an option to allow the user to cancel the transaction (option 6).

![enter image description here](https://lh3.googleusercontent.com/sFfamTdQZisrWNpBR4VVJa0PIFsR3xXqUTwuRfNMM2ElA0k8QV6ZO4NDpeeb_IO9oAVjufsvTEOL "Fig. 33.3")

2. The user enters a menu selection using the keypad.
3. If the withdrawal amount chosen is greater than the user’s account balance, the screen displays a message stating this and telling the user to choose a smaller amount. The ATM then returns to Step 1. If the withdrawal amount chosen isless than or equal to the user’s account balance (i.e., an acceptable amount), the ATM proceeds to Step 4. If the user chooses to cancel the transaction (option 6), the ATM displays the main menu and waits for user input.
4. If the cash dispenser contains enough cash, the ATM proceeds to Step 5. Otherwise, the screen displays a message indicating the problem and telling the user to choose a smaller withdrawal amount. The ATM then returns to Step 1.
5. The ATM debits the withdrawal amount from the user’s account in the bank’s database (i.e., subtracts the withdrawal amount from the user’s account balance).
6. The cash dispenser dispenses the desired amount of money to the user.


The screen displays a message reminding the user to take the money. The following steps describe the actions that occur when the user enters 3 (when viewing the main menu of Fig. 33.2) to make a deposit:

1. The screen prompts the user to enter a deposit amount or type 0 (zero) to cancel.
2. The user enters a deposit amount or 0 using the keypad. [Note: The keypad does not contain a decimal point or a dollar sign, so the user cannot type a real dollar amount (e.g., $27.25). Instead, the user must enter a deposit amount as a number of cents (e.g., 2725). The ATM then divides this number by 100 to obtain a number representing a dollar amount (e.g., 2725  ÷ 100 = 27.25).]
3. If the user specifies a deposit amount, the ATM proceeds to Step 4. If the userchooses to cancel the transaction (by entering 0), the ATM displays the main menu and waits for user input.
4. The screen displays a message telling the user to insert a deposit envelope.
5. If the deposit slot receives a deposit envelope within two minutes, the ATM credits the deposit amount to the user’s account in the bank’s database (i.e., adds the deposit amount to the user’s account balance). [Note: This money is not immediately available for withdrawal. The bank first must physically verify the amount of cash in the deposit envelope, and any checks in the envelope must clear (i.e., money must be transferred from the check writer’s account to the check recipient’s account). When either of these events occurs, the bank appropriately updates the user’s balance stored in its database. This occurs independently of the ATM system.] If the deposit slot does not receive a deposit envelope within this time period, the screen displays a message that the system has canceled the transaction due to inactivity. The ATM then displays the main menu and waits for user input. 

After the system successfully executes a transaction, it should return to the main menu so that the user can perform additional transactions. If the user exits the system, the screen should display a thank you message, then display the welcome message for the next user.
