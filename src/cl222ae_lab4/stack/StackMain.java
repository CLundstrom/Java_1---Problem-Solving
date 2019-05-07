package cl222ae_lab4.stack;

import java.util.Iterator;

public class StackMain implements Stack {

	//Setting array to 100 since we can't use lists.
	private Object[] vehicles = new Object[100];
	
	// Only used to test empty list.
	// private static Car[] cars;

	public static void main(String[] args) {
		
		StackMain sm = new StackMain();
		
		sm.push(new Car("Audi", "A6", 2018));
		sm.push(new Car("Volvo", "V70", 2014));
		sm.push(new Car("SAAB", "93", 2008));
		sm.push(new Car("BMW", "M3", 2013));

		System.out.println("Is the stack empty: " + sm.isEmpty());
		System.out.println("Stack size: " + sm.size());

		sm.push(new Car("Volvo", "Amazon", 1956));
		sm.push(new Motorcycle("Suzuki", "GSXR-Hayabusa", 2018));
		sm.push(new Motorcycle("Yamaha", "R1", 2019));

		System.out.println("Stack size: " + sm.size());
		System.out.println();
		System.out.println("Top stack object: " + sm.peek());
		sm.pop();
		System.out.println("Stack size: " + sm.size());

		Iterator<Object> it = sm.iterator();
		
		System.out.println("\nIterating remaining objects: ");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

	@Override
	public int size() {
		if (vehicles == null) {
			return 0;
		}
		int size = 0;
		for (Object vehicle : vehicles) {

			if (vehicle != null) {
				size++;
			}

		}
		return size;
	}

	@Override
	public boolean isEmpty() {

		if (vehicles == null)
			return true;

		for (int i = 0; i < vehicles.length; i++) {

			if (vehicles[i] != null) {

				return false;
			}
		}
		return true;
	}

	@Override
	public void push(Object element) {
		// Size isn't zero-based so it will always add to top of stack.
		vehicles[this.size()] = element;
	}

	@Override
	public Object pop() {
		var obj = vehicles[this.size() - 1];
		//-1 to get the index of top object.
		vehicles[this.size() - 1] = null;
		System.out.println("Removing " + obj + " from the stack.");
		return obj;
	}

	@Override
	public Object peek() {
		return vehicles[this.size() - 1];
	}

	@Override
	public Iterator<Object> iterator() {

		Iterator<Object> iterator = new Iterator<Object>() {
			
			int index = 0;

            @Override
            public Object next() {
                return vehicles[index++];
            }
			
            @Override
            public boolean hasNext() {
            	
            	if (index < size() && vehicles[index] != null) {
            		
            		return true;
            	}
            	else {
            	
            		return false;
            	}
            }

		};
		return iterator;
	}
}
