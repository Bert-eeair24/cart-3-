🛒 Online Shopping Cart

[Алмасбеков Урмат]

📄 Description
Online Shopping Cart is a console-based Java application that simulates an online shopping experience. Users can add products to a cart, view cart contents, update product quantities, and remove products. The project showcases object-oriented programming principles and basic data handling through user input and structured output.

 Objectives
Create a functional shopping cart using Java.

Implement object-oriented programming concepts (encapsulation, composition).

Enable dynamic management of products using data structures.

Provide a simple and user-friendly interface for interaction.

Validate and handle user input effectively.

 Project Requirement List (5 points)
Add products to the cart.

View the cart and list all products.

Display total price of items in the cart.

Update quantity of a selected product.

Remove a product from the cart.

Handle empty cart scenarios.

Provide a menu-driven user interface.

Prevent invalid inputs or actions.

Use of ArrayList for dynamic storage.

Utilize OOP concepts (Product, ShoppingCart classes).

 Documentation (10 points)
 Key Classes & Methods:
Product – Represents a product with a name, price, and quantity.

ShoppingCart – Maintains a list of products and supports:

addItem(Product product)

viewCart()

updateItem(int index, int newQuantity)

removeItem(int index)

OnlineShoppingCart – The main class handling the menu and user interactions via Scanner.

 Data Structures:
ArrayList<Product> is used to store and manage the products dynamically.

⚠ Challenges Faced:
Adjusting 1-based user input to 0-based indexing in code.

Ensuring safe and consistent user input validation.

Keeping the interface clear and concise for non-technical users.

 Test Cases and Outputs (5 points)
🔹 Test Case 1: Add and View Cart
Input:

Копировать
Редактировать
1
Phone
599.99
2
2
Expected Output:

pgsql
Копировать
Редактировать
Product added to cart.

--- Your Cart ---
1. Phone - $599.99 x 2 (Total: $1199.98)
Total: $1199.98
🔹 Test Case 2: Update Quantity
Input:

Копировать
Редактировать
3
1
3
Expected Output:

mathematica
Копировать
Редактировать
Quantity updated.
🔹 Test Case 3: Remove Item
Input:

Копировать
Редактировать
4
1
Expected Output:

csharp
Копировать
Редактировать
Product removed from cart.
🔹 Test Case 4: View Empty Cart
Input:

Копировать
Редактировать
2
Expected Output:

csharp
Копировать
Редактировать
Cart is empty.
💾 Files (5 points)
OnlineShoppingCart.java — Main file containing all classes and logic.

Currently, the program operates entirely through console I/O.

Can be extended to use files for saving/loading cart data.

 Code (10 points)
 Valid: The code compiles and runs without errors.

 Clean: Code is organized into logical classes and methods.

 No Comments: Code is mostly self-explanatory and minimal commenting is used.

📸 Screenshots
![image](https://github.com/user-attachments/assets/679ff775-d299-4626-85d4-0aba0a2c940d)

![image](https://github.com/user-attachments/assets/0fb80f3e-d850-4b97-a1ac-4ccdace17681)

Product added

Cart viewed

Quantity updated

Product removed

Cart empty message

Exit confirmation

