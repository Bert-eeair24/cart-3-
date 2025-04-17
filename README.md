#  Online Shopping Cart  

**Author**: [Алмасбеков Урмат]  

## Description  
**Online Shopping Cart** is a console-based Java application that simulates an online shopping experience. Users can:  
- Add products to a cart  
- View cart contents  
- Update product quantities  
- Remove products  

The project demonstrates **object-oriented programming (OOP)** principles and basic data handling through user input and structured output.  

---

## Objectives  
- Create a functional shopping cart using Java.  
- Implement **OOP concepts** (encapsulation, composition).  
- Manage products dynamically using **data structures**.  
- Provide a **user-friendly** console interface.  
- Validate and handle user input effectively.  

---

## Project Requirements  
1. Add products to the cart.  
2. View the cart and list all products.  
3. Display the **total price** of items in the cart.  
4. Update the quantity of a selected product.  
5. Remove a product from the cart.  
6. Handle **empty cart** scenarios.  
7. Provide a **menu-driven** user interface.  
8. Prevent invalid inputs or actions.  
9. Use **`ArrayList`** for dynamic storage.  
10. Utilize **OOP concepts** (`Product`, `ShoppingCart` classes).  

---

##  Documentation  

###  Key Classes & Methods  
| Class          | Methods & Description |
|----------------|-----------------------|
| **`Product`**  | Represents a product with `name`, `price`, and `quantity`. |
| **`ShoppingCart`** | Manages cart operations: <br> • `addItem(Product product)` <br> • `viewCart()` <br> • `updateItem(int index, int newQuantity)` <br> • `removeItem(int index)` |
| **`OnlineShoppingCart`** (Main) | Handles user interactions via `Scanner`. |

###  Data Structures  
- **`ArrayList<Product>`** – Stores and manages products dynamically.  

###  Challenges Faced  
- Converting **1-based user input** to **0-based indexing** in the code.  
- Ensuring **input validation** for a smooth user experience.  
- Keeping the interface **clear and intuitive**.  

---

## Test Cases & Outputs  

###  Test Case 1: Add and View Cart  
**Input:**  
Phone
599.99
2
2
**Expected Output:**  
Product added to cart.

--- Your Cart ---

Phone - 
599.99
x
2
(
T
o
t
a
l
:
599.99x2(Total:1199.98)
Total: $1199.98

###  Test Case 2: Update Quantity  
**Input:**  
3
1
3
**Expected Output:**  
Quantity updated.

###  Test Case 3: Remove Item  
**Input:**  
4
1
**Expected Output:**  
Product removed from cart.

###  Test Case 4: View Empty Cart  
**Input:**  
2
**Expected Output:**  
Cart is empty.

---

## Files  
- **`OnlineShoppingCart.java`** – Main file containing all classes and logic.  
- *(Future extension: File storage for saving/loading cart data.)*  

---

##  Screenshots  

| Action | Screenshot |
|--------|------------|
| **Product Added** | ![Add Product](https://github.com/user-attachments/assets/...) |
| **Cart Viewed** | ![View Cart](https://github.com/user-attachments/assets/...) |
| **Quantity Updated** | ![Update Quantity](https://github.com/user-attachments/assets/...) |
| **Product Removed** | ![Remove Product](https://github.com/user-attachments/assets/...) |
| **Empty Cart Message** | ![Empty Cart](https://github.com/user-attachments/assets/...) |

---

##  Code Quality  
✔ **Valid** – Compiles and runs without errors.  
✔ **Clean** – Well-organized into classes/methods.  
✔ **Minimal Comments** – Self-explanatory code.  

---
