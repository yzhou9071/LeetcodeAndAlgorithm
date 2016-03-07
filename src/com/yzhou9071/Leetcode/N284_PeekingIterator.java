package com.yzhou9071.Leetcode;

import java.util.Iterator;

public class N284_PeekingIterator implements Iterator<Integer> {
	Integer peekIndex;
	Iterator<Integer> iterator;
	
	public N284_PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
	    this.iterator = iterator;
	    this.peekIndex = iterator.hasNext()?iterator.next():null;
	}

    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
		return peekIndex;
	}

	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
		if(peekIndex == null)
			throw new java.util.NoSuchElementException();
		
		Integer tmp = peekIndex;
		peekIndex = iterator.hasNext()?iterator.next():null;
		return tmp;	    
	}

	@Override
	public boolean hasNext() {
	    return peekIndex!=null;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
	}
}
