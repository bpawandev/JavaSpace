package com.collection.list.custom;

import java.util.Arrays;

/**
 * 
 * @author Baikati Pawan
 * @param <E>
 *
 */
public class CustomArrayList<E> {
	private int size;
	private static final int INITIAL_CAPACITY = 10;
	private Object[] elements;

	public CustomArrayList() {
		elements = new Object[INITIAL_CAPACITY];
	}

	public void add(E e) {
		if (size == elements.length) {
			ensureCapacity();
		}
		elements[size++] = e;
	}

	private void ensureCapacity() {
		int newCapacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCapacity);
	}

	@SuppressWarnings("unchecked")
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index : " + index + " , size : " + index);
		}
		return (E) elements[index];

	}

	public Object remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException("index : " + index + " , size : " + index);
		}
		Object removedElement = elements[index];
		for (int i = index; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
		size--;
		return removedElement;
	}

	public void show() {
		System.out.print("[ ");
		for (int i = 0; i < size; i++) {
			System.out.print(elements[i] + " ");
		}
		System.out.println("]");
	}
	
	public void size() {
		System.out.println(size);
	}
}
