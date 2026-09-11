package StreamApi;

import java.util.Arrays;
import java.util.List;

public class ParallelStream {
	public static void main(String[] args) {		
		
		List<Integer>numbers= Arrays.asList(10,20,30,40,50,60,70);
		
		numbers.parallelStream()    //Parallel Stream
		.map(n->{
			System.out.println("Processing "+n+ " Thread "+Thread.currentThread().getName());
			return n*2;
		}).forEach(System.out::println);
	}

}
