# Exception Handling in Java

This folder contains Java programs that demonstrate the concepts of Exception Handling. These examples help understand how Java handles runtime errors and how to write robust programs using exception handling mechanisms.

## 📚 Topics Covered

- Introduction to Exceptions
- Try-Catch Block
- Multiple Catch Blocks
- Finally Block
- Arithmetic Exception
- Array Index Out Of Bounds Exception
- Number Format Exception
- Exception Handling Best Practices

## 📂 Programs Included

| File Name | Description |
|------------|------------|
| Exception1.java | Basic Exception Handling Example |
| Exception2.java | Handling Arithmetic Exceptions |
| Exception3.java | Handling Array Index Exceptions |
| Exception4.java | Demonstration of Multiple Catch Blocks / Finally Block |

## 🛠️ Technologies Used

- Java
- JDK 8+
- VS Code / Eclipse / IntelliJ IDEA

## 🚀 How to Run

1. Compile the Java file:

```bash
javac Exception1.java
```

2. Run the program:

```bash
java Exception1
```

Repeat the same process for other files.

## 🎯 Learning Outcomes

After completing these programs, you will be able to:

- Understand Java exceptions and their types.
- Handle runtime errors effectively.
- Use try, catch, and finally blocks.
- Write more reliable and maintainable Java programs.

## 📖 What is Exception Handling?

Exception Handling is a mechanism in Java that allows a program to detect and handle runtime errors, preventing unexpected program termination.

Example:

```java
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Cannot divide by zero");
}
```

## 🤝 Contributions

Contributions and improvements are welcome. Feel free to fork the repository and submit a pull request.

## 📜 License

This project is open-source and available for learning purposes.

---

⭐ If you found these examples helpful, consider giving this repository a star.
