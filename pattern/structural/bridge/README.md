# Bridge Pattern

The bridge pattern can be used when two types should vary independently. This
pattern is often confused with the adapter pattern but both have differen use
cases. When you know from the beginning you want an interaction between two types
you should directly implement the bridge pattern. But when you already in the
project you can use an interface to make two incompatible interfaces work together
afterwards. The bridge pattern is a **GoF** pattern. 

# Class Description

## Abstraction

The abstraction is an abstract type that contain an implementor. The concrete
abstraction will extend this type.

## Implementor

The implementor is an abstract type that define the concrete behavior of the
concrete implementor.

# UML

![UML](../../../resource/Bridge_UML.png)

# Sources

Information: https://en.wikipedia.org/wiki/Bridge_pattern 
Image: https://en.wikipedia.org/wiki/Bridge_pattern#/media/File:Bridge_UML_class_diagram.svg 