
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class TestClass implements NumberRangeSummarizer {

	@Override
	public Collection<Integer> collect(String input) {

		List<Integer> i = new ArrayList<>();    //  i.add(null);
		for (int j = 1; j < 30; j++) {
		    i.add(j);
		    Collections.sort(i);
		}

		System.out.println(
		        IntStream.range(1, 30).boxed().map(String::valueOf)
		               .collect(Collectors.joining("-"))
		               
		                            
		);
	
	    return i;
	}

	public String summarizeCollection(Collection<Integer> input,int lowerLimit, int upperLimit) {
		// TODO Auto-generated method stub
		
		for (Integer value : input){
            if(value >= lowerLimit && value <= upperLimit){
                System.out.println(value);
            }
        }
		
		return summarizeCollection(input);
	}

	@Override
	public String summarizeCollection(Collection<Integer> input) {
		// TODO Auto-generated method stub
		return null;
	}

}
