# Interpreter Pattern

The interpreter pattern define how to evaluate sentences in a language. All symbol
of the language can be represented as a class. The interpreter pattern is a 
**GoF** pattern.

# Class Description

## Abstract Expression

This type will represent common operation for all concrete expressions.

## Terminal Expression

A terminal expression represent one symbol of the defined grammar of the language.

## Nonterminal Expression

A non terminal expression contains the interpretation logic for his sub-expressions.

## Context

The context is the object that should be interpret by the interpreter.

# Example

In this example the context is the enum class **Case**. The case **LOWER** will
check if the Terminal expression has more lower case letters than upper case 
letters. The case **UPPER** works vice versa.

# UML

![UML](../../../resource/Interpreter_UML.png)

# Sources

Information: https://en.wikipedia.org/wiki/Interpreter_pattern
Image: https://en.wikipedia.org/wiki/Interpreter_pattern#/media/File:Interpreter_UML_class_diagram.svg