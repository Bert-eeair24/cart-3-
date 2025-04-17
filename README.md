# 🛒 Online Shopping Cart

**Student:** Алмасбеков Урмат  
**Language:** Java (Console-based)

**![image](https://github.com/user-attachments/assets/49652491-3264-4f7e-859f-6d4efd08e22e)**


---

## 📄 Description

**Online Shopping Cart** is a console-based Java application that simulates a basic e-commerce experience. Users can add products, manage their cart, and update or remove items. This project demonstrates fundamental object-oriented programming (OOP) concepts and dynamic data handling.

---

##  Objectives

- Create a functional shopping cart system using Java  
- Implement OOP principles (encapsulation, composition)  
- Manage cart contents dynamically with `ArrayList`  
- Provide a user-friendly, menu-driven console interface  
- Ensure validation and safe handling of user inputs  

---

##  Project Requirements

1. Add products to the cart  
2. View cart and display all items  
3. Show total price of all products  
4. Update product quantity  
5. Remove product from cart  
6. Handle empty cart scenarios  
7. Provide a clear menu interface  
8. Validate user input and actions  
9. Use `ArrayList` for dynamic product storage  
10. Apply object-oriented design (`Product`, `ShoppingCart` classes)  

---

##  Documentation

###  Key Classes & Methods

- **`Product`**  
  Represents a product with:
  - `name`
  - `price`
  - `quantity`

- **`ShoppingCart`**  
  Manages cart operations:
  - `addItem(Product product)`
  - `viewCart()`
  - `updateItem(int index, int newQuantity)`
  - `removeItem(int index)`

- **`OnlineShoppingCart`**  
  Main class that handles the menu and user interaction via `Scanner`.

###  Data Structures

- `ArrayList<Product>` is used to store and manage the products in the cart.

###  Challenges Faced

- Adjusting user inputs from 1-based to 0-based indexing  
- Validating inputs to prevent errors  
- Designing a clear interface for console use  

---

##  Test Cases

### 🔹 Add and View Cart

**Input:**
1 Phone 599.99 2 2

**Output:**

Product added to cart.

--- Your Cart ---

Phone - $599.99 x 2 (Total: $1199.98) Total: $1199.98

---

### 🔹 Update Quantity

**Input:**

3 1 3

**Output:**

Quantity updated.

---

### 🔹 Remove Item

**Input:**
4 1

**Output:**

Product removed from cart.

---

### 🔹 View Empty Cart

**Input:**
2

**Output:**
Cart is empty

---

##  Files

- `OnlineShoppingCart.java` — Main file containing all logic and classes  
- Current version uses console I/O only  
- Can be extended to save/load cart data using files  

---

##  Code Quality

- ✅ **Valid:** Compiles and runs without errors  
- ✅ **Clean:** Organized with clear class structure  
- ✅ **Minimal Comments:** Code is self-explanatory with minimal commentary  

---

##  Screenshots

> _Demonstration of all required functionalities:_

![Add Product](https://github.com/user-attachments/assets/679ff775-d299-4626-85d4-0aba0a2c940d)  
![View Cart](https://github.com/user-attachments/assets/0fb80f3e-d850-4b97-a1ac-4ccdace17681)
![image](https://github.com/user-attachments/assets/8fbe8593-87fb-4caa-894d-9dd5d33811a3)
![image](https://github.com/user-attachments/assets/a5f17eae-85aa-41e6-a17d-32841fac6bcd)

- 🟢 Product added  
- 🟢 Cart viewed  
- 🟢 Quantity updated  
- 🟢 Product removed  
- 🟢 Empty cart message  
- 🟢 Exit confirmation  

---

🛠 _This project is a part of Java coursework, demonstrating practical implementation of basic OOP principles and dynamic data handling._

