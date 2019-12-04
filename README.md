
## ATM Case Study

_Object-Oriented Project_

## Timeline
**August 30, 2019**

-   Briefly glanced through the project and analyzed objectives required.

**September 13, 2019**

-   Added requirements to README using StackEdit
-   Added to Notes

**December 3, 2019**

## Requirements Document

_We begin our design process by presenting a requirements document that specifies the purpose of the ATM system and what it must do. Throughout the case study, we refer often to this requirements document._

A local bank intends to install a new automated teller machine (ATM) to allow users (i.e., bank customers) to perform basic financial transactions. Each user can have only one account at the bank. ATM users should be able to view their account balance, withdraw cash (i.e., take money out of an
account) and deposit funds (i.e., place money into an account). The user interface of the automated teller machine contains:

- a screen that displays messages to the user
- a keypad that receives numeric input from the user
- a cash dispenser that dispenses cash to the user and
- a deposit slot that receives deposit envelopes from the user.

Upon first approaching the ATM, the user should experience the following sequence of events: 


![enter image description here](https://lh3.googleusercontent.com/V7ADOMFt7WuD-g9SCXnuK-sgvyY8xVESY6TMCDRMb38u3CBsdWVKjgmUhJH_SnXeGFprNtCJmh9F "Fig. 33.1")

1. The screen displays Welcome! and prompts the user to enter an account number.
2. The user enters a five-digit account number using the keypad.
3. The screen prompts the user to enter the PIN ***(personal identification number)*** associated with the specified account number.
4. The user enters a five-digit PIN using the keypad.
5. If the user enters a valid account number and the correct PIN for that account, the screen displays the main menu shown below. If the user enters an invalid account number or an incorrect PIN, the screen displays an appropriate message, then the ATM returns to ***Step 1*** to restart the authentication process.

![enter image description here](https://lh3.googleusercontent.com/Nx--rbLR-Hbj2b0KBDdQC-dBdLj4gFDn2sUJa8fJbUOYmaKaIzcHKR2nv1wtpT3nkkIGKhNDlEC7 "Fig. 33.2")

After the ATM authenticates the user, the main menu shown above should contain a numbered option for each of the three types of transactions: balance inquiry ***(option 1) ***, ***, withdrawal ***(option 2)*** and deposit ***(option 3) ***. It also should contain an option to allow the user to exit the system ***(option 4) ***. The user then chooses either to perform a transaction *(by entering 1, 2 or 3)* or to exit the system *(by entering 4)*.

If the user enters 1 to make a balance inquiry, the screen displays the user’s account balance. To do so, the ATM must retrieve the balance from the bank’s database. The following steps describe what occurs when the user enters 2 to make a withdrawal:

1. The screen displays a menu shown below containing standard withdrawal amounts:$20 ***(option 1)*** , $40 ***(option 2)*** , $60 ***(option 3)*** , $100 ***(option 4)*** and $200 ***(option 5)*** . The menu also contains an option to allow the user to cancel the transaction ***(option 6) ***.

![enter image description here](https://lh3.googleusercontent.com/sFfamTdQZisrWNpBR4VVJa0PIFsR3xXqUTwuRfNMM2ElA0k8QV6ZO4NDpeeb_IO9oAVjufsvTEOL "Fig. 33.3")

2. The user enters a menu selection using the keypad.
3. If the withdrawal amount chosen is greater than the user’s account balance, the screen displays a message stating this and telling the user to choose a smaller amount. The ATM then returns to 
**Step 1**. If the withdrawal amount chosen is less than or equal to the user’s account balance (i.e., an acceptable amount), the ATM proceeds to ***Step 4 ***. If the user chooses to cancel the transaction ***(option 6) ***, the ATM displays the main menu and waits for user input.
5. If the cash dispenser contains enough cash, the ATM proceeds to ***Step 5 ***. Otherwise, the screen displays a message indicating the problem and telling the user to choose a smaller withdrawal amount. The ATM then returns to ***Step 1 ***.
6. The ATM debits the withdrawal amount from the user’s account in the bank’s database (i.e., subtracts the withdrawal amount from the user’s account balance).
7. The cash dispenser dispenses the desired amount of money to the user.


The screen displays a message reminding the user to take the money. The following steps describe the actions that occur when the user enters 3 when viewing the main menu to make a deposit:

1. The screen prompts the user to enter a deposit amount or type 0 (zero) to cancel.
2. The user enters a deposit amount or 0 using the keypad. [Note: The keypad does not contain a decimal point or a dollar sign, so the user cannot type a real dollar amount (e.g., $27.25). Instead, the user must enter a deposit amount as several cents (e.g., 2725). The ATM then divides this number by 100 to obtain a number representing a dollar amount (e.g., 2725  ÷ 100 = 27.25).]
3. If the user specifies a deposit amount, the ATM proceeds to ***Step 4***. If the userchooses to cancel the transaction (by entering 0), the ATM displays the main menu and waits for user input.
4. The screen displays a message telling the user to insert a deposit envelope.
5. If the deposit slot receives a deposit envelope within two minutes, the ATM credits the deposit amount to the user’s account in the bank’s database (i.e., adds the deposit amount to the user’s account balance). [Note: This money is not immediately available for withdrawal. The bank first must physically verify the amount of cash in the deposit envelope, and any checks in the envelope must clear (i.e., money must be transferred from the check writer’s account to the check recipient’s account). When either of these events occurs, the bank appropriately updates the user’s balance stored in its database. This occurs independently of the ATM system.] If the deposit slot does not receive a deposit envelope within this period, the screen displays a message that the system has canceled the transaction due to inactivity. The ATM then displays the main menu and waits for user input. 

After the system successfully executes a transaction, it should return to the main menu so that the user can perform additional transactions. If the user exits the system, the screen should display a thank you message, then display the welcome message for the next user.




## Notes:
_**September 13, 2019**_ 

The figure below shows the ***use case diagram*** for the ATM system. The stick figure represents an **actor**, which is an entity that interacts with the system.

![enter image description here](https://lh3.googleusercontent.com/2tNS9fvdK--myhuWxqeXwBZOzbGlCNUMXAFB3Tp7sRg9N2UYDMDS-x52utoQXCrnHhIIprClt4xB)

Use Case Diagrams are used to model the interactions between a system's clients (bank customers) 
 and its use cases. The goal is to show the kinds of interactions users have with a system without providing details.

![enter image description here](https://lh3.googleusercontent.com/E7jwLs1qhQ8-Ox5fkCbLenb42kSQAx38GlPQgaK6vbL5EEGMCQlBguLezc0PRQDGo5RUqV4tX3dn)

These are key nouns and noun phrases to help identify classes that can potentially be implemented into the ATM system. 

 - Bank cannot be modeled as a class because it is not part of the ATM system.
 - Customer and user represent entities, who interact with the ATM but do not need to be modeled as a class in the ATM software.
 - $20 bill and deposit envelope are physical objects in the real world but do not represent parts that are to be automated.
 - Representing money and balance as attributes of classes is appropriate. Likewise, account number and PIN represent important attributes of a bank account because they do not exhibit behaviors.
 - Though the requirements document frequently describes a “transaction” in a general sense, it is best to use the object-oriented concept of inheritance by modeling the three types of transactions (balance inquiry, withdrawal, and deposit) as individual classes.

*Determined Classes:*

 - ATM
 - screen
 - keypad
 - cash dispenser
 - deposit slot
 - account
 - bank database
 - balance inquiry
 - withdrawal deposit

 _**September 14, 2019**_ 

The *solid diamonds* attached to the ATM class's association line indicate that ATM has a composition relationship with classes **Screen** , **Keypad** , **CashDispenser** , and **Depositslot**. *Composition* implies  a *whole/part relationship*.

—  In other words, ATM is formed of one object of class Screen, one object of class Keypad, one object of class CashDispenser, and one object of class Depositslot. This is an example of **inheritance**: A class that is derived from another class is called a _subclass_ (also a _derived class_, _extended class_, or _child class_). The class from which the subclass is derived is called a _superclass_ (also a _base class_ or a _parent class_).

![enter image description here](https://lh3.googleusercontent.com/4Y8W3Bee6BApSdxC30_5jE-2Draldfyw1j-n1t5bl5nVjGFqlcSoX7sQTzMqvPvBFsBGlAeJRo89)
![enter image description here](https://lh3.googleusercontent.com/8PUhs2lwp7JyUChgLV3FJjxhSLsrGFch3AoOFdvSLe0k-9gK-q9jdOiMRX_NcewF9x0IPekIErrC)

The diagram below is a graphical model of the ATM's system structure. It includes classes **Database** and **Account**, and several associations did not include in the one above. It shows that class ATM has a one-to-one relationship with class Database—one ATM object *authenticates users against* one BankDatabase object. The BankDatabase has 0..* to indicate that it has a one-to-many relationship with Account since there can be many Accounts store int the Database.

![enter image description here](https://lh3.googleusercontent.com/826ubVGggZ35WJT7wVe0ndQwJm4yVzA0M-9DK9S8HjHLjBFNabYHlLtoHWYzKU5KUCiCjbYOTLf2)

**Identifying Class Attributes**

Class have **attributes** (data) and **operations** (behaviors). Class *attributes* are implemented as **fields**, and class *operations* are implemented as **methods**.

Consider the attributes of some real-world objects: A person’s attributes include height, weight and whether the person is left-handed, right-handed or ambidextrous. A radio’s attributes include its station, volume, and AM or FM settings. A car’s attributes include its speedometer and odometer readings, the amount of gas in its tank and what gear it’s in. A personal computer’s attributes include its manufacturer (e.g., Dell, Sun, Apple or IBM), type of screen (e.g., LCD or CRT), main memory size and hard disk size.

The figure below lists the words or phrases from the requirements document that describe each class.

—The phrase "user is authenticated" describes a state of the ATM, so we include userAuthenticated as a **Boolean** attribute in class ATM.

![enter image description here](https://lh3.googleusercontent.com/LMssb7tnXduAwGSsHGegN_jAdqBzaefo22yxlng1GKw0a81EFo3OTt2ob0yni5pKNrqznN7niUtN)

The class diagram below lists some of the attributes for the classes in our system. UserAuthenticated attribute writing as a boolean variable: **userAuthenticated Boolean = false;** The attribute declaration contains three pieces of information—attribute name: userAuthenticated, attribute type: Boolean and the attribute can be represented by a primitive data type.

_Verbs and verb phrases for each class in the ATM system:_

![enter image description here](https://lh3.googleusercontent.com/BLs-GRxaJ4g0qDjbUdPvXefCAnQ0qxZBKxHxW6GEG8YXb5CyRkbFg2aiebK0mqjrReAwt102_4tO)

**Identifying Object's States and Activities**

Each object in a system goes through a series of states. An object's state is indicated by the value of its attributes at a given time. **State Machine Diagrams** model several states of an object and show under what circumstances the object changes states.

An **Activity Diagram** models aspects of system behavior from an object's workflow *(sequence of events)* during program execution. The UML represents an **action** in an activity diagram as an action state modeled by a **rectangle** with its left and right sides replaced by arcs curving outward. Each action state contains an action expression that specifies an action to be performed. A **solid circle** with an attached stick " → " arrowhead designates the **initial state**. An **arrow with a stick** " → " arrowhead **connects two action states**, indicating the order in which the actions represented by the action states occur. The **solid circle enclosed** **in an open circles** represents the **final state**.

![enter image description here](https://lh3.googleusercontent.com/zn8vh1foVOMpcAuvPiQIrVYM1t7jUm0wkRF4KHQlW21pKT97jD3pRT4dpucWnbgmLla0vBH-mo_K)

**Identifying Class Operations**

An operation is a service that objects of a class provide to clients (users) of the class.

Consider the operations of some real-world objects. A radio’s operations include setting its station and volume (typically invoked by a person’s adjusting the radio's controls). A car’s operations include accelerating (invoked by the driver’s pressing the accelerator pedal), decelerating (invoked by the driver’s pressing the brake pedal or releasing the gas pedal), turning and shifting gears. Software objects can offer operations as well—for example, a software graphics object might offer operations for drawing a circle, drawing a line, drawing a square and the like. A spreadsheet software object might offer operations like printing the spreadsheet, totaling the elements in a row or column and graphing information in the spreadsheet as a bar chart or pie chart.

![enter image description here](https://lh3.googleusercontent.com/p52uVyrETgpt7BZUhqnf58fkN3Fe6JiqKkjl6cEkBBL4uPIm-I2hwpO6-xewFiBasywQnp_WOzGV)

To identify operations, we examine the verb phrases listed for each class above. The “executes financial transactions” phrase associated with class ATM implies that class ATM instructs transactions to execute. Therefore, classes BalanceInquiry, Withdrawal and Deposit each need an operation to provide this service to the ATM. We place this operation (which we’ve named execute) in the third compartment of the three transaction classes in the updated class diagram. During an ATM session, the ATM object will invoke these transaction operations as necessary.

![enter image description here](https://lh3.googleusercontent.com/bwcJMpZU6DZj3QrfzNyNztGA95ODaHWGHP5LeVruvrzEA-OwW1oNnrxmz0NrHtY6shs6RXl7S3HQ)
