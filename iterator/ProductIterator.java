import java.util.*;
public class ProductIterator implements ListIterator {

	private ClassProductList classProductList;
	ArrayList products = new ArrayList();
	Iterator itr = products.iterator();
	public boolean hasNext() {
		if(itr.next() == null){
		return false;}
		else{
			return true;
		}
	}

	public void Next() {
		itr.next();
	}

	public void MoveToHead() {
		itr = products.iterator();
	}

	public void Remove() {
		itr.remove();
	}

}
