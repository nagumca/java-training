package com.indegene.oops;

public class Book {
	private int noOfCopies;

	Book(int bookCnt){
		System.out.println("Calling book constructor");
		setNoOfCopies(bookCnt);		
	}

	public void setNoOfCopies(int count) {
		if(count > 0) {
			this.noOfCopies = count;
		}
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void increaseCopies(int incCount) {
		setNoOfCopies(this.noOfCopies + incCount);
	}

	public void decreaseCopies(int decCount) {
		int currentCopyCnt = this.noOfCopies;
		if(decCount > 0 && decCount < currentCopyCnt) {
			setNoOfCopies(this.noOfCopies - decCount);
		}
	}

}
