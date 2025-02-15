public class LargestElementInArray {

    //largest element in an array

    public int getLargestElementInArrayBySorting(int a[]){
        // do sorting max we can  achieve here is nlog n time complexity
        return 0;
    }

    public int getLargestElementInArray(int[] array){
        //time complexity - O(N)
        //optimal approach
        int largest = array[0]; //assuming the first element to be largest
        for(int i=1 ; i<array.length ; i++){
            if(largest < array[i])
            {
                largest = array[i];
            }
        }
        return largest;
    }
}
