# PaymentProcessor
A simple Project where I am using the SOLID principles 
Usos de SOLID en la aplicación: 

Single Responsibility Principle (SRP): Cada clase tiene una única responsabilidad.

Open/Closed Principle (OCP): El código es abierto para la extensión y cerrado para la modificación.

Liskov Substitution Principle (LSP): Podemos utilizar cualquier subclase o derivada de PaymentProcessor(PayPalProcessor, CreditCardProcessor, BankTransferProcessor) en lugar de la clase padre PaymentProcessor sin afectar el comportamiento de nuestro código.

Interface Segregation Principle (ISP): La interfaz PaymentMethod contiene solo los métodos necesarios para representar un procesador de pago.

Dependency Inversion Principle (DIP): La clase PaymentProcessor depende de abstracciones (la interfaz PaymentMethod) en lugar de detalles concretos (PayPalProcessor, CreditCardProcessor, BankTransferProcessor).
