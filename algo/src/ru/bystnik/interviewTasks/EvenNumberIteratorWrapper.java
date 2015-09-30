package ru.bystnik.interviewTasks;

import java.util.Iterator;

public class EvenNumberIteratorWrapper implements Iterator<Integer> {

	private Iterator<Integer> innerIterator;
	private Integer next;

	public EvenNumberIteratorWrapper(Iterator<Integer> iterator) {
		this.innerIterator = iterator;
		setNext();
	}

	private void setNext() {
		while (innerIterator.hasNext()) {
			Integer nextVal = innerIterator.next();
			if (nextVal % 2 == 0) {
				next = nextVal;
				return;
			}
		}
		next = null;
	}

	@Override
	public boolean hasNext() {
		return next != null;
	}

	@Override
	public Integer next() {
		Integer nextVal = next;
		setNext();
		return nextVal;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();

	}

}
