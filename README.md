# 30-days-of-code-hackerrank

<https://www.hackerrank.com/domains/tutorials/30-days-of-code>

## Concepts learnt

### Day 1 - Data Types

Given: 
`Scanner scan = new Scanner(System.in);`
How do `scan.next()` and `scan.nextLine()` work while reading tokens?

For input:

> d f \
> Coding is interesting. I like to practise coding!

scan.next() will read the next token d.

**scan.nextLine()** will read f i.e **from the end of last token until the beginning of the next line**

scan.nexLine() will read the line "Coding...practise"

scan.nextLine() will read "coding!"

