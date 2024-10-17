package Streams;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MapStreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> arr = Arrays.asList(2,3,4,5);
		
		List<Integer> square = arr.stream().map(x->x*x).collect(Collectors.toList());
		
		System.out.println(square);
		
		arr.stream().map(x->x*x).sorted().forEach(y->System.out.print(y + " "));
		
		List<Integer> arr1 = Arrays.asList(3,5,1,6,8,9,2);
		
		int c = arr1.stream().filter(x-> x%2==0).reduce(0, (count,i) -> ++count);
		
		System.out.println(c);

	}

}
