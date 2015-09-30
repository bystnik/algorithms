package ru.bystnik.interviewTasks;

import java.util.Iterator;
import java.util.List;

public class EvenNumbersIterator implements Iterator<Integer> {

	private Iterator<Integer> innerIterator;
	private List<Integer> list;
	private Integer position;

	public EvenNumbersIterator(List<Integer> list) {
		this.list = list;
		this.innerIterator = list.iterator();
		this.position=0;
	}

	@Override
	public boolean hasNext() {
		while (innerIterator.hasNext()) {
			int nextInt = innerIterator.next();
			position++;
			if (nextInt % 2 == 0) {
				innerIterator=list.listIterator(position-1);
				return true;
			}
			;
		}
		return false;
	}

	@Override
	public Integer next() {
		if (innerIterator.hasNext())
		return innerIterator.next();
		throw new RuntimeException("There are no more even elements!");
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}