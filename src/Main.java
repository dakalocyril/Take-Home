import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
	
	/*public static void main(String args[])
	{
	*/
		
		public static void numbersInRange(ArrayList<Integer>numbers, int lowerLimit, int upperLimit){
	        for (Integer value : numbers){
	            if(value >= lowerLimit && value <= upperLimit){
	                System.out.println(value);
	            }
	        }
	    }
		//Scanner scanner = new Scanner(System.in);
		//List<Integer> result = new ArrayList<>();
		/*
		List<Integer> i = new ArrayList<>();    //  i.add(null);
		for (int j = 1; j < 30; j++) {
		    i.add(j);
		    Collections.sort(i);
		}
//System.out.println(i.stream().map(String::valueOf)
//		        .collect(Collectors.joining(",")));
		
		System.out.println(
		        IntStream.range(1, 30).boxed().map(String::valueOf)
		               .collect(Collectors.joining("-"))
		
		              
		                            
		);
		*/
		/*
		result.add(1);
		result.add(2);
		result.add(3);
		result.add(5);
		result.add(7);
		result.add(9);
		result.add(11);
		result.add(13);
		result.add(15);
		result.add(17);
		*/
		//System.out.println(result);
//		TestClass test = null;
//		System.out.println(test.start);
		
		//System.out.println(test);
		//NumberRangeSummarizer rc=new Nu();
		
		//System.out.println(rc.summarizeCollection("1,2,34"));
	}

//}
