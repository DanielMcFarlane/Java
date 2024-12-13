------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE:
PURPOSE OF PROJECT:
VERSION or DATE:
HOW TO START THIS PROJECT:
AUTHORS:
USER INSTRUCTIONS:

Instructions: 

Review the provided Engine, Trailer, and skeleton Car classes. 

Complete the Car Class: 

Inside the Car class, complete the following tasks: 

Create a private field for the car's engine to establish a composition relationship with the Engine class. 

Create a private field for the car's trailer to establish an aggregation relationship with the Trailer class. 

Implement a constructor for the Car class. Inside the constructor, create an Engine object and set it as the car's engine (composition). 

Implement a method to attach a trailer to the car. This method should take a Trailer object as a parameter and set it as the car's trailer (aggregation). 

Implement a method to start the car. Inside this method, call the start method of the car's engine object and print a message indicating that the engine is started. 

Implement a method to indicate whether the car is towing a trailer. Check if a trailer is attached to the car (i.e., the trailer variable is not null). If a trailer is attached, print a message indicating that the car is towing the trailer. If no trailer is attached, print a message indicating that the car is not towing a trailer. 

Test Your Car Class: 

Create instances of the Car class with and without a Trailer. Demonstrate how the composition and aggregation relationships work. 

Start the car and indicate whether it is towing a trailer using the appropriate methods. 

Additional Challenge (): 

Modify the Car class to allow detaching a trailer from the car. 
