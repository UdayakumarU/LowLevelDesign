#### Creational Design pattern

Desing a ecommerce shopping platform, where the system should include the management of

* Product listing
* User accounts
* Ordering process

1. Product Management
   1. Products have different categories (electronics, clothing, groceries, etc)
   2. Can add new product to the platform
2. User Management
   1. User can create new account with unique username and password
   2. Implement user authentication and authorisation mechanism
3. Order processing
   1. Users can add products to their cart and place order
   2. Each order should contain details of the products, quantities and total price.


---

1. Singleton design pattern - used to create one db object to interact with userdb
2. Factory design pattern - used to create different categories of products like Clothing, Electronic etc
3. Builder desing pattern - used to create user and order objects since they have many attributes and this will helps to create object with required parameter at the given point of time.
