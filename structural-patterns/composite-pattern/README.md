# Definition

The Composite pattern helps you to create tree structures of objects without
the need to force clients to differentiate between branches and leaves
regarding usage. The Composite pattern lets clients treat individual objects
and compositions of objects uniformly.


# Composite Pattern in File System

This project showcases the Composite Pattern in file system. Here Client Driver interact with the objects through the common interface provided by the AbstractFile, without needing to distinguish between individual objects and compositions.

## Components:

1. **AbstractFile Interface**: Component
   - 

2. **Directory concrete Class**: Composite
   - implements methods to manipulate children
   - implements all Component methods, generally by delegating them to its children.
   

3. **File Class**: Leaf

4. **Client Code**:
   - `Driver`: Demonstrates usage of the Composite Pattern.


## Where to Use:

- When you want to represent a part-whole relationship in a tree structure.
- When you want clients to be able to ignore the differences between
- compositions of objects and individual objects.
- When the structure can have any level of complexity and is dynamic.

## Benefits:

- Define class hierarchies consisting of primitive objects and composite objects.
- Makes it easier to add new kind of components.

## Usage:

1. Clone the repository.
2. Run `Driver` to see the pattern in action.

