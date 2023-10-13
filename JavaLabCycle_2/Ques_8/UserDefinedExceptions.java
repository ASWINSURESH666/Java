/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ques_8;

/**
 *
 * @author HP
 */
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}

class Student {
    private final String name;
    private final int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void validateAge() throws MyException {
        if (age < 0 || age > 100) {
            throw new MyException("Invalid age: " + age + ". Age must be between 0 and 100.");
        }
    }

    @Override
    public String toString() {
        return "Student: " + name + ", Age: " + age;
    }
}