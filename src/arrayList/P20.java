package arrayList;

class MyList<T> {
	private Object[] elements ;
	private int size = 0;
	private static final int DEFAULT_CAP = 10;
	
	public MyList() {
		elements = new Object[DEFAULT_CAP];
	}
	
	public void add( T item) {
		if(size == elements.length) {
			Object[] newArr = new Object[elements.length*2];
			
			System.arraycopy(elements, 0 , newArr, 0 , size);
		    
			elements = newArr;
		}
		elements[size++] = item;
		
	}
	
	@SuppressWarnings("unchecked")
	
	public T get(int index) {
		if(index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		return (T) elements[index];
	}
}

public class P20 {
	
	public static void main(String args [] ) {
		
	}

}
