Project Overview
Project Title: Online Shopping Cart Management System
Student Name: Almasbekov Urmat
Project Description: A Java console application that implements CRUD operations for managing an online shopping cart, allowing users to add, view, update, and remove items from their cart.

Project Objectives
Implement core CRUD (Create, Read, Update, Delete) functionality

Provide a user-friendly command line interface

Demonstrate proper data management techniques

Showcase Java programming fundamentals

Key Features
Add items to shopping cart (name, price, quantity)

View cart contents with total calculation

Update item quantities

Remove items from cart

Simple console-based user interface

Requirements Implemented
Complete CRUD operations implementation

Command line interface with menu system

Basic input validation

Modular code structure (separate Product and ShoppingCart classes)

Clear console output formatting

Proper error handling for invalid inputs

Intuitive user workflow

Real-time cart total calculation

Sequential item numbering

Clean program exit functionality

How to Use
Clone the repository or download the source files

Compile the Java files:

Copy
javac OnlineShoppingCart.java
Run the application:

Copy
java OnlineShoppingCart
Follow the on-screen menu prompts:

Press 1 to add items

Press 2 to view your cart

Press 3 to update quantities

Press 4 to remove items

Press 5 to exit

Code Structure
Product.java - Product class (model)

ShoppingCart.java - Cart management class

OnlineShoppingCart.java - Main application with CLI

Sample Test Cases
Adding items:

Input: "Milk", 2.5, 3

Expected: Item appears in cart with correct total (7.5)

Updating quantity:

Change quantity from 3 to 5

Expected: Item total updates to 12.5

Removing items:

Remove item #1

Expected: Item disappears from cart

Screenshots
[Sample program output would be shown here]

Future Enhancements
File persistence for cart data

Export/import cart functionality

Additional product attributes (category, description)

Graphical user interface version

Evaluation Criteria Met
✓ CRUD operations implemented

✓ Command line interface

✓ Basic input validation

✓ Modular design

✓ Clear documentation

Bonus Features Potential
File-based data persistence

CSV/JSON export-import

Simple GUI version
