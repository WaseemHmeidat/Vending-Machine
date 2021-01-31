# Vending-Machine
Introduction
Vending machines can be be of different types. Some vending machines are dedicated to coffee, some are dedicated to drinks, and others are dedicated to snacks. For this assignment, you will implement a Snack Vending machine. 

Deliverables:
Implement the SnackMachine code.


Specifications of the Snack Machine 
The Snack Machine has the following characteristics:
Money Slots: the machine accepts money of the following types:
CoinSlot: There are four denominations: • 10c • 20c • 50c • $1 
CardSlot : all cards accepted
Notes Slot :20$ and 50$ only
Machine only accepts USD currency
Snack Slots
The machine has five rows to display snack items.
Each row has 5 columns to pile the items.
Each column has a number.
Keypad
Users can select the items to be purchased using a keypad.



Purchase a Snack Use Case

Basic Flow
This use case begins when the customer wants to purchase snacks.
The customer selects a number by pressing on the keypad. 
The VM displays a message that the snack is available for the selected number and displays its price.
The customer inserts the money.
The VM validates the money.
The VM accepts the money. 
The VM displays the accumulated amount of money each time a new money is entered.
The VM monitors the amount of the accepted money, If the money is enough, the VM dispenses the selected snack to the customer. 
The VM determines if any change should be sent back to customer.
The VM displays the change at panel. 
Then, the VM dispenses change.
