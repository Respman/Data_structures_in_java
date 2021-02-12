import java.util.*;
import java.io.*;

public class test{
	test(){
		super();
	}
	public static void main (String[] args) throws Exception{
        myVector<ball> balls = new myVector<ball>();
		ball b;
		for (int i = 0; i < 3; i++){
			b = new ball((int)(Math.random()*20),"A");
			balls.append(b);
		}
		System.out.println(balls);
		try{
			balls.remove_index(2);
		}catch(VectorException e){
            System.out.println(e.getMessage());
        }
		System.out.println(balls);

	}
}
