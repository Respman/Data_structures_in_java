interface Requirements<T>{
    void append(T val);
    void remove_last() throws VectorException;
    void remove_index(int ind) throws VectorException;
    void append_in_index(T value, int ind) throws VectorException;
    void clear();
    int get_csize();
    int get_msize();
}

class array<T>{
    public T[] array;
    public array(int size){
        this.array = (T[])new Object[size];
    }
}

public class myVector<T> implements Requirements<T>{
    private array<T> arr;
    private int current_size;
    private int max_size;

    public myVector(){
        this.current_size = 0;
        this.max_size = 10;
        this.arr = new array<T>(max_size);
    }

    public myVector(int size){
        this.current_size = size;
        this.max_size = size + (10 - size%10);
        this.arr = new array<T>(max_size);
    }
    
    public myVector(myVector<T> other) throws VectorException{
        this.max_size = other.get_msize();
        this.change_size();
        try{
            for(int i =0; i<other.get_csize(); i++)
                this.append(other.test_index(i));
        }catch(VectorException e){
            throw new VectorException(e.getMessage());
        }
    }

    private void change_size(){
        array<T> tmp = new array<T>(this.max_size);
        for(int i=0; i<this.current_size; i++){
            tmp.array[i] = this.arr.array[i];
        }
        this.arr = tmp;
    }

    public void append(T element){
        if(current_size == max_size){
            this.max_size += 10;
            this.change_size();
        }
        this.arr.array[current_size] = element;
        current_size +=1;
    }
    
    public void remove_last() throws VectorException{
        if(this.current_size == 0)
            throw new VectorException("Array is empty");
        this.current_size -= 1;
    }
    
    public void remove_index(int ind) throws VectorException{
        if(this.current_size == 0)
            throw new VectorException("List is empty");
        if(ind < 0 || ind >=this.current_size)
            throw new VectorException("Index out of bounds");
        this.current_size -= 1;
        for(int i = ind; i<this.current_size; i++)
            this.arr.array[i] = this.arr.array[i + 1];
    }

    public void append_in_index(T value, int ind) throws VectorException{
        if(ind<0 || ind > this.current_size)
            throw new VectorException("Index out of bounds");
        
        this.current_size ++;
        if(this.current_size == this.max_size){
            this.max_size += 10;
            this.change_size();
        }
        for(int i=this.current_size; i>ind; i--)
            this.arr.array[i] = arr.array[i - 1];
        this.arr.array[ind] = value;
    }
    
    public void clear(){
        this.current_size = 0;
        this.arr = null;
        this.max_size = 10;
    }

    public int get_csize(){
        return this.current_size;
    }

    public int get_msize(){
        return this.max_size;
    }

    public T test_index (int ind) throws VectorException{
        if(ind < 0 || ind >= this.current_size)
            throw new VectorException("Out of bounds");
        return this.arr.array[ind];
    }

    public String toString(){
        if (this.current_size == 0){
            return "Empty vect";
        }
        else{
            String text = "";
            for (int i = 0; i < this.current_size; i ++){
                text += arr.array[i] + " | ";
            }
            return text;
        }
    }
}

class VectorException extends Exception{
    public VectorException(String message){
        super(message);
    }
}
