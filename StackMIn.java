package StacksAndQueues;

import java.util.Stack;

public class Stackmin {
	
	int findStackMin(Stack s,int[] a ) {
		if(s.isEmpty()) {
			return -1;
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==-99999 && i>=1) {
				return a[i-1];
			}
		}
		return -99999999;
	}
	
	void push(Stack s,int element,int[] a) {
		
		if(s.isEmpty()) {
			s.push(element);
			a[0]=element;
		}
		else {
			for(int i=0;i<a.length;i++) {
				if(a[i]!=-99999 && a[i]>element) {
					if(i+1<a.length) {
						a[i+1]=element;
					}
					
				}
			}
		}
		
	}
	
	int pop(Stack s,int[] a) {
		if(s.isEmpty()) {
			System.out.println("Stack empty cannot delete an element from stack");
		}
		else {
			for(int i=0;i<a.length;i++) {
				if(a[i]==(int)s.peek()) {
					a[i]=(int)s.peek();
					break;
				}
			}
		}
		return (int) s.pop();
	}
	
	public static void main(String[] args) {
		Stackmin s=new Stackmin();
		Stack s1=new Stack();
		int[] a=new int[10];
		for(int i=0;i<a.length;i++) {
			a[i]=-99999;
		}
		
	   s.push(s1, 3, a);
	   System.out.println("min element is "+s.findStackMin(s1, a));
	   s.push(s1, 0, a);
	   System.out.println("min element is "+s.findStackMin(s1, a));
	   s.push(s1, 4, a);
	   System.out.println("min element is "+s.findStackMin(s1, a));
	   s.push(s1, -1, a);
	   System.out.println("min element is "+s.findStackMin(s1, a));
	   System.out.println("popped element is "+s.pop(s1, a));
		
	}

}
