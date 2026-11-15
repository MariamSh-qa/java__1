# Java Beginner Revision Notes

A beginner-friendly summary of the concepts covered in the seven Java
files discussed in this repository.

## Repository files covered

These notes are based on the following files:

-   `Main.java`
-   `PrimitivePractice.java`
-   `PracticeOperations.java`
-   `Increment.java`
-   `IncrementDecrement.java`
-   `Boolean.java`
-   `Char.java`

> Focus on understanding how Java works rather than memorizing code.

------------------------------------------------------------------------

## 1. Primitive data types --- `Main.java` and `PrimitivePractice.java`

Java has 8 primitive data types:

  Type        What it stores        Example
  ----------- --------------------- --------------------------
 - `byte`      Small whole numbers   `byte age = 20;`
 - `short`     Whole numbers         `short number = 300;`
 - `int`       Whole numbers         `int age = 24;`
 - `long`      Large whole numbers   `long number = 10000L;`
 - `float`     Decimal numbers       `float price = 5.7f;`
 - `double`    Decimal numbers       `double price = 5.7;`
 - `boolean`   True or false         `boolean active = true;`
 - `char`      One character         `char grade = 'A';`

### Remember

-   `float` needs `f` at the end, for example `5.7f`.
-   `double` is the default decimal type.
-   `char` uses single quotes, for example `'A'`.
-   `String` uses double quotes, for example `"Hello"`.

------------------------------------------------------------------------

## 2. Declaration and initialization --- `Main.java`

Declaration and initialization are two different steps.

``` java
int age;  // Declaration

age = 5;  // Initialization
```

You can also do both together:

``` java
int age = 5;
```

-   **Declaration** = creating a variable.
-   **Initialization** = giving a variable its first value.
-   **Assignment** = giving or changing a variable's value.

------------------------------------------------------------------------

## 3. Arithmetic operators --- `PracticeOperations.java`

  Operator   Meaning          Example
  ---------- ---------------- --------------------------------
-  `+`        Addition         `7 + 3 = 10`
-  `-`        Subtraction      `7 - 3 = 4`
-  `*`        Multiplication   `7 * 3 = 21`
-  `/`        Division         `7 / 3 = 2` (integer division)
-  `%`        Remainder        `7 % 3 = 1`

### Integer division vs decimal division

``` java
int a = 7;
int b = 3;

System.out.println(a / b);          // 2
System.out.println((double) a / b); // 2.333333...
```

Even if you save `a / b` into a `double`, Java first performs integer
division when both operands are `int`.

------------------------------------------------------------------------

## 4. Assignment operators --- `Increment.java`

These operators update a variable using its current value.

  Operator   Equivalent
  ---------- ---------------------
-  `+=`       `age = age + value`
-  `-=`       `age = age - value`
-  `*=`       `age = age * value`
-  `/=`       `age = age / value`
-  `%=`       `age = age % value`

Example:

``` java
int age = 5;
age += 2;

System.out.println(age); // 7
```

------------------------------------------------------------------------

## 5. Increment and decrement --- `IncrementDecrement.java`

  Operator   Meaning
  ---------- --------------------------------------------
  `a++`      Use the current value, then increase by 1.
  `++a`      Increase by 1 first, then use the value.
  `a--`      Use the current value, then decrease by 1.
  `--a`      Decrease by 1 first, then use the value.

Example:

``` java
int a = 5;

System.out.println(a++); // 5
System.out.println(++a); // 7
```

-   The first line prints `5` and then increases `a` to `6`.
-   The second line increases `a` to `7` first and then prints `7`.

------------------------------------------------------------------------

## 6. Boolean and comparison operators --- `Boolean.java` and `PrimitivePractice.java`

  Operator   Meaning
  ---------- --------------------------
 - `==`       Equal to
 - `!=`       Not equal to
 - `>`        Greater than
 - `<`        Less than
 - `>=`       Greater than or equal to
 - `<=`       Less than or equal to

Example:

``` java
int a = 5;
int b = 5;

boolean result = a == b;

System.out.println(result); // true
```

### Do not confuse

-   `=` means assignment.
-   `==` means comparison.

------------------------------------------------------------------------

## 7. Characters --- `Char.java`

When you use `+` between two `char` variables, Java converts them to
their numeric Unicode values and adds them.

``` java
char symbol = 'a';
char symbol2 = 'b';

System.out.println(symbol + symbol2);
```

Output:

``` text
195
```

Why?

-   `'a'` has Unicode value `97`.
-   `'b'` has Unicode value `98`.
-   `97 + 98 = 195`.

### Type casting

You can use type casting to convert a `char` to an `int`:

``` java
char letter = 'A';

System.out.println((int) letter); // 65
```

The Unicode value of uppercase `A` is `65`.

------------------------------------------------------------------------

## Revision checklist

Use this checklist to track your understanding:

-   [ ] I understand all 8 primitive data types.
-   [ ] I can explain declaration, initialization and assignment.
-   [ ] I understand arithmetic operators (`+`, `-`, `*`, `/`, `%`).
-   [ ] I understand integer division versus decimal division.
-   [ ] I can use `+=`, `-=`, `*=`, `/=` and `%=`.
-   [ ] I understand pre-increment and post-increment.
-   [ ] I understand comparison operators and Boolean values.
-   [ ] I understand `char`, Unicode and type casting.

------------------------------------------------------------------------

