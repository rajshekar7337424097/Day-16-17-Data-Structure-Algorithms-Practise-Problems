package com.bl.datastructure_unorderList;

public class Node<T> {
	
	Node<T> head;
	Node<T> front;
	Node<T> rear;
	Node<T> next;
	T data;
	
	public Node(T date) {
		super();
		this.data = date;
		this.next = null;
	}
	
	public Node<T> getFront(){
		return front;
	}

	public void setFront(Node<T> front) {
		this.front = front;
	}
	
	public Node<T> getRear(){
		return rear;
	}
	
	public void setRear(Node<T> rear) {
		this.rear = rear;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
}
