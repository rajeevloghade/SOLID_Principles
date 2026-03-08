# SOLID_Principles

S – Single Responsibility Principle (SRP)
A class should have only one responsibility (one job).
Example: Employee class should not both calculate salary and save data to database.

O – Open/Closed Principle (OCP)
Code should be open for extension but closed for modification.
Example: Add a new Shape like Circle without changing existing Shape code.

L – Liskov Substitution Principle (LSP)
A child class should be able to replace its parent class without breaking the program.

I – Interface Segregation Principle (ISP)
Do not force classes to implement methods they don’t use.
Instead, create smaller interfaces.

D – Dependency Inversion Principle (DIP)
Depend on interfaces (abstraction), not concrete classes.
Example: Switch should depend on Switchable interface, not LightBulb class.