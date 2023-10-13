/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ques_2;

/**
 *
 * @author HP
 */
public class DynamicArray {
    private int[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArray(int initialCapacity) {
        this.array = new int[initialCapacity];
        this.size = 0;
    }

    public void printArray() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void addElement(int element) {
        ensureCapacity();
        array[size++] = element;
    }

    public void addElement(int element, int position) {
        if (position < 0 || position > size) {
            System.out.println("Invalid position to add element.");
            return;
        }
        ensureCapacity();

        for (int i = size; i > position; i--) {
            array[i] = array[i - 1];
        }

        array[position] = element;
        size++;
    }

    public void removeElement(int position) {
        if (position < 0 || position >= size) {
            System.out.println("Invalid position to remove element.");
            return;
        }

        for (int i = position; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    public int searchElement(int element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            int newCapacity = (size == 0) ? 1 : size * 2;
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
}