# Decorator pattern

The decorator pattern can be used when you need to add / remove different 
responsibilities to an object during the run time. The decorator pattern is a
**GoF** pattern.

# Class description

## Component

A component is the object that can change his responsibilities during run time.
The conrete component is the 'core' of the construct we can build with this pattern.

## Decorator

The decorator is a component and also has a component. With this definition a 
decorator can also have another decorator. When calling the method that is defined
in the component the method call is going recursively till reaching the core. 

# UML

![UML](../../../../resource/Decorator_UML.png)

# Sources

Information: https://en.wikipedia.org/wiki/Decorator_pattern
Image: https://en.wikipedia.org/wiki/Decorator_pattern#/media/File:Decorator_UML_class_diagram.svg