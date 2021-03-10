# 30-days-of-code-hackerrank

<https://www.hackerrank.com/domains/tutorials/30-days-of-code>

## **Java Concepts learnt from Tutorials and additional notes**

### Day 1 - Data Types

Given:
`Scanner scan = new Scanner(System.in);`
How do `scan.next()` and `scan.nextLine()` work while reading tokens?

For input:

> d f \
> Coding is interesting. I like to practise  \
> coding!

scan.next() will read the next token d.

**scan.nextLine()** will read f i.e **from the end of last token until the beginning of the next line**

scan.nexLine() will read the line "Coding...practise"

scan.nextLine() will read "coding!"

### Day 2 - Operators

Dividing an int type value with a value greater than it will result in 0. \
For example,

```java
int a = 8;

double b = 8; 

a = 8/100; // Answer is 0 

b = 8/100; // Answer is 0.08
```

### Day 6 - Let's Review

> Casting only works for certain types of relationships, such as between primitives or objects that inherit from another class.

#### **The method _toCharArray()_ in Java**

Strings in Java are a sequence of characters and are objects.
String._toCharArray_  is used to break the string down to its component characters. For example,

```java
String str = "Hello world!";
char[] arr = str.toCharArray();
```

### Day 7 - Arrays

> **Data Structures** \
A way of organizing data that enables efficient storage, retrieval, and use.

#### **The attribute _length_ of arrays and the method _length()_ used with String objects in Java**

The attribute _length_ is used to get the size of an array. The syntax is:

```java
arrayName.length;
```

The method _length()_ is used with String objects returns the number of characters contained in String objects. The syntax is:

```java
stringName.length();
```

### Day 8 - Dictionaries and Maps

A Java Map maps keys to values. A map cannot contain duplicate keys.

NOTE : Both the _key_ and the _value_ must be Objects and not primitives.

#### **Map Methods**

- _containsKey(Object key)_ \
Returns true if this map contains a mapping for the specified key.
- _containsValue(Object value)_ \
Returns true if this map maps one or more keys to the specified value.
- _get(Object key)_ \
Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
- _put(K key, V value)_ \
Associates the specified value with the specified key in this map

### Day 12 - [Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/multipleinheritance.html)

A subclass inherits all the members(fields, methods, and nested classes) from its superclass. Since **Constructors** are not members they are not inherited but they can be invoked from subclasses using the keyword _super_. The invocation of super class constructor from a subclass contructor should always be the first line of the subclass constructor.

Java supports **Single inheritance** of classes or Single Inheritance of **_state_** (ability to inherit fields from multiple classes) and **Multiple inheritance** of **_type_** by means of interfaces. The main reason for this is that classes can have fields whereas interfaces cannot.

- **Multiple inheritance of state** - Suppose a class extends multiple classes and an object of the subclass is created by instantiating the subclass. This object will inherit fields from all of the subclass' superclasses. The problem will arise when the constructors and methods from different superclasses instantiate the same field and the compiler wouldn't know which constructor or method should take the precedence.

- **Multiple inheritance of implementation** - It is the ability to inherit method definitions from multiple classes. The Compiler cannot determine which method to invoke on encountering superclass methods with the same name. This can be overcome using the [**_Default methods_**](https://docs.oracle.com/javase/tutorial/java/IandI/defaultmethods.html). The default methods defined in the interfaces that a class implement can have the same name. It's the Java Compiler that determines which default method the class should use.

- **Multiple inheritance of type** - It is the ability of a class to implement more than one interface. An object can have multiple types:
  - the type of its own class and
  - the types of all the interfaces that the class implements. \
  The value of a [variable declared using the type interface](https://docs.oracle.com/javase/tutorial/java/IandI/interfaceAsType.html) can reference any object that is instantiated from any class that implements the interface.

### Day 14 - Scope

> When dealing with a class variable (field), it's always best to explicitly refer to it using the this keyword. For example: 

``` java
class DemoClass{
    private int x;
    
    public MyClass(int x){
     this.x = x;
    }
}
```
