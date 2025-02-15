package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamApi {

    //largest number in list
    public int findLargest(List<Integer> list){
        Optional<Integer> largestNumber = list.stream().max(Comparator.naturalOrder());
        return largestNumber.get();
    }

    //minimum number in list
    public int findMinimum(List<Integer> list){
        Optional<Integer> minimumNumber = list.stream().min(Comparator.naturalOrder());
        return minimumNumber.get();
    }
}
