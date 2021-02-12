class dinamic_array<T> {
	T mas[];
	int current_count;
	int max_count;
	
	dinamic_array(int count){
		this.mas = (T[]) new Object[count];
		current_count = 0;
		max_count = count;
	}
	
	void Add (T value){
		mas[current_count] = value;
		if (current_count == max_count) {
			Object tmp[] = mas;
			max_count = 2*max_count + 10;
			mas = (T[]) new Object[max_count];
			for (int i=0; i<current_count; i++){
				mas[i] = (T) tmp[i];
			}
			mas[current_count] = value;
		}
	}
}
