## Table of Contents
- [Description](#description)
- [Features](#features)
- [How to Run](#how-to-run)
- [Example Input and Output](#step-3-example-input-and-output)
- [Generating Javadoc](#step-4-generating-javadoc)
- [How to Access the Project](#how-to-access-the-project)
- [Dependencies](#dependencies)


## Description
Java application designed to manage a collection of integers using a stack data structure. The application allows users to input integer values, collects them in a 'LinkedList', and enables sorting and displaying of the list contents. 

It demonstrates the use of:
- Java Collections Framework (`LinkedList` and `Collections.sort()`)
- Standard input reading with `Scanner`

## Features
- Integer Collection: Allows users to input integers for storage in a 'LinkedList'.
- User Interaction: Accepts user input and terminates input collection upon the keyword "done".
- Sorting: Sorts the stack of integers using 'Collections.sort()' after input collection is complete.
- Modular Design: Uses separate classes to handle stack operations and user input, improving maintainability and readability.
- Documentation: Generates Javadoc documentation, providing detailed usage instructions through HTML files.
  

## How to Run

### Step 1: Compilation
Use the following command to compile the program:
```sh
javac SortList1.java
```

### Step 2: Execution
Run the compiled program with:
```sh
java SortList1
```

### Step 3: Example Input and Output
**Input:**
```
Enter integers. Press enter to enter next integer. (type 'done' to finish):
5
3
8
1
done

```

**Output:**
```
Sorted stack:
1 3 5 8
```

### Step 4: Generating Javadoc
To generate the Javadoc documentation for the project, use the following command:
```sh
javadoc -d docs SortList1.java
```

This will create a `docs/` directory containing the generated HTML documentation. You can open `index.html` in a web browser to view the documentation.

## How to Access the Project
1. Clone the repository from GitHub:
    ```sh
    git clone https://github.com/ikeilo1/SortList.git
    ```
2. Navigate to the project directory:
    ```sh
    cd SortList
    ```

## Dependencies
- Java Development Kit (JDK): Required for compiling and running the Java program.
- Javadoc Utility: For generating documentation; part of the JDK.
- Open JDK version 17.0.13
