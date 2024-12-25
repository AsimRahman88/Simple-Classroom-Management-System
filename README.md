# Simple Classroom Management System

## Description
This project implements a **Simple Classroom Management System** in **Java**. It allows instructors to manage student records, grades, and classroom activities efficiently. The system provides a menu-driven interface with various functionalities, including enrolling students, retrieving information, updating scores, and generating report cards.

The project showcases proficiency in Java programming concepts, such as:
- Object-Oriented Programming (OOP)
- Dynamic memory management with arrays
- Input validation and exception handling
- Modular design using encapsulated methods and classes

---

## Features
### 1. Enroll New Student
- Allows the instructor to enroll new students by entering:
  - First Name
  - Last Name
  - Student ID
- Validates the class size to ensure it does not exceed the maximum capacity.
- Outputs:
  - **Success**: Student enrolled successfully.
  - **Error**: Student enrollment failed if the class is full or invalid input is provided.

### 2. Retrieve Student Information
- Displays detailed information for a specific student, including:
  - Name
  - Student ID
  - Assignment scores
  - Lab score
  - Midterm score
  - Final exam score
- Outputs:
  - **Success**: Displays student details if found.
  - **Error**: Student not found.

### 3. Update Scores
- Updates the scores for a specific student:
  - Assignments (4 assignments)
  - Labs
  - Midterm
  - Final exam
- Outputs:
  - **Success**: Scores updated successfully.
  - **Error**: Invalid student ID or input.

### 4. Generate Report Cards
- **Individual Report Card**:
  - Computes and displays the cumulative weighted score and final letter grade for a student.
- **Class Report Card**:
  - Displays all students' scores and grades in a tabular format.
  - Calculates and displays the class:
    - Minimum score for each evaluation
    - Maximum score for each evaluation
    - Average score for each evaluation

### 5. Manage Student Records
- Allows instructors to:
  - Retrieve a student's position in the class list.
  - Update student details (first and last name).
  - Unenroll a student from the class.
- Outputs:
  - **Success**: Operation completed successfully.
  - **Error**: Invalid input or student not found.

### 6. Exit
- Gracefully terminates the application with a thank-you message.

---

## Technical Details
### Programming Language
- **Java**

### Key Concepts
- **Object-Oriented Design**:
  - Encapsulated all functionalities within the `Comp248secU` class.
  - Created reusable methods for modular programming.
- **Data Storage**:
  - Implemented arrays to store and manage dynamic student data (names, scores, etc.).
- **Input Validation**:
  - Ensured proper validation for user input (e.g., integer checks for IDs and scores).
- **Error Handling**:
  - Prevented invalid operations with robust error messages and validations.
- **Report Generation**:
  - Leveraged formatted printing with `System.out.printf` for structured tabular outputs.

---

## How to Run the Program
1. **Compile the Code**:
   ```bash
   javac A4_Q1_Q2.java
