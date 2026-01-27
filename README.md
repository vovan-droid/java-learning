# Figures-drawer

## Overview

This is my pet project „Figure Drawer“ that allows the user to draw any figure on a console (for example any kind of triangles, or a rectangle or even a house) with just knowing a size of a figure - all the calculation and actual drawing is done by the program itself.

For now the drawing is happening in the console. But the service is written in a way that it can be easily expandable to also have a UI interface.

## Why this project

I intentionally chose this „simple“ topic for a project with a minimum business logic, because I wanted to focus on a technical richness of the project rather than showing off in richness of business features. My goal here was to focus on deepening my knowledge  in a programming language Java, design patterns and engineering practices.

## Technologies that were used

- Java features
    - OOP ???
    - Inner, nested classes
    - Stream API
    - Call chainig
- Design patterns:
    - Builder
    - Factory
    - Strategy - for testing purpose
    - Singleton (was eventually removed from the project)
    - To be added: Unit tests, using input/output Stream
- Maven for managing dependencies
- JUnit 5 for tests

## Levels of decomposition

1. Pattern - a core class, containing methods - atomic „patterns“, from which any figure can be potentially built. Already optimised for building complicated lines.
2. Drawer - a higher level abstraction above Pattern class. Used for building actual figures using patterns from Pattern class.
3. Runner - a „starting point“ of our application, where we just specify what kind of figure we want to draw.