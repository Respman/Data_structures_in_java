class element<T> {
	T data;
	element next;

	public String toString() {
		return("Data: " + this.data);
	}
}

class mylist<T> {
	element head;
	element tail;
	int count;

	private element<T> GetPrewElement (element<T> e, T value) {
		if (e == null){
			return(null);
		}else if (e.next == null){
			return(null);
		}else if (e.next.data == value) {
			return(e);
		}else {
			return(GetPrewElement (e.next, value));
		}
	}


	public void RemoveElementByValue(T value) throws mylistError {
		if (this.head == null){
			throw new mylistError("Can't remove element: list is empty");
		}else{
			if (this.head.data == value){
				this.head.next = this.head.next.next;
			}else{
				element<T> elem = GetPrewElement(this.head, value);
				if (elem != null){
					elem.next = elem.next.next;
				}else{
					throw new mylistError("Can't remove element: element " + value + " not in this list");
				}
			}
		}
	}

	private void clear(element<T> e){
		if (e != null){
			clear(e.next);
			e.next = null;
		}
	}

	public void ClearAll() {
		clear(this.head);
		this.head = null;
		this.tail = null;
		this.count = 0;
	}

	private element<T> GetElement (element<T> e, T value) {
		if (e == null){
			return(null);
		}else if (e.data == value) {
			return(e);
		}else {
			return(GetElement (e.next, value));
		}
	}

	public element<T> GetElementByValue(T value) throws mylistError {
		element<T> elem = GetElement(this.head, value);
		if (elem != null){
			return(elem);
		}else{
			throw new mylistError("Element " + value + " not in this list");
		}
	}

	public void RemoveFromHead() throws mylistError {
		if (this.count != 0){
			this.head = head.next;
			count--;
		}else{
			throw new mylistError("Stack Underflow!");
		}

	}

	private element<T> copyTo (element<T> e_to, element<T> e_from){
		e_to.data = e_from.data;
		if (e_from.next != null){
			e_to.next = new element();
			return(copyTo(e_to.next, e_from.next));
		}else{
			return(e_to);
		}
	}

	public mylist(mylist<T> list){
		this.head = new element();
		this.count = list.count;
		this.tail = copyTo(this.head, list.head);
	}

	public mylist(){
		this.head = null;
		this.tail = null;
	}

	void AddToHead (T value){
		element e = new element();
		e.data = value;
		if (head == null) {
			head = e;
			tail = e;
		} else {
			e.next = head;
			head = e;
		}
		count++;
	}
	void AddToTail (T value){
		element e = new element();
		e.data = value;
		if (head == null) {
			head = e;
			tail = e;
		} else {
			tail.next = e;
			tail = e;
		}
		count++;
	}
	int CountOfElements () {
		int len = 0;
		element e = head;
		if (head != null) {
			len++;
			while (e.next != null){
				e = e.next;
				len++;
			}
		}
		return len;
	}

}
