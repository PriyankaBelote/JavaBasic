package com.techno.javabasics5.collection;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList implements Iterable {
	private Object[] array;
	private Object[] temp;
	private int position;

	public MyArrayList(int arraySize) {
		this.array = new Object[arraySize];
	}

	public void add(Object element) {
		if (this.position >= array.length) {
			grow();
		}
		array[this.position++] = element;

	}

	@Override
	public String toString() {
		if (position == 0) {
			return "[]";
		}

		String string = "[" + array[0];
		for (int i = 1; i < size(); i++) {
			string += "," + array[i];
		}
		string += "]";
		return string;
	}

	public Object get(int index) {
		return array[index];

	}

	public int size() {
		return this.position;

	}

	private void grow() {
		this.temp = new Object[array.length + 5];
		System.arraycopy(array, 0, temp, 0, array.length);
		array = temp;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new MyItr();
	}

	private class MyItr implements Iterator {
		private int index;

		@Override
		public boolean hasNext() {
			return (index < position) ? true : false;

		}

		@Override
		public Object next() {
			return array[index++];
		}

	}
}
