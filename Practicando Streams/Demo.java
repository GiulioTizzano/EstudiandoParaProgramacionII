// Collection in Java is used to store any sort of data which later can be processed.
// That is why we also use what is known as the Stream API which allows the data to be parsed as a Stream of 
// data.
import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;

public class Demo{
    public static void main(String[] args){
        List<Integer> myList = Arrays.asList(4, 1, 8, 2, 10, 11, 13, 15);

        // myList.forEach(n -> System.out.println(n));
        // We can do this or directly store the List<Integer> as a Stream (or any other data structure)
        // and manipulate the data from directly from the Stream.

        // This is how you assign a Stream in Java.
        Stream<Integer> data = myList.stream();
        // Here I'm going to use the sorted() method for the Stream, in order to sort my data. This is
        // possible becuase the method sorted() returns another Stream of data.
        Stream<Integer> sortedData = myList.stream().sorted();
        data.forEach(n -> System.out.println(n));
        sortedData.forEach(n -> System.out.println(n));

        // Now we are going to use a .map() in order to double the values of our List, without having to use
        // an external for loop and having to 'physically changing the data'.

        // We have to pass a lambda expression to the .map() method.
        Stream<Integer> sortedAndMappedData = myList.stream().sorted().map(n -> n * 2);
        sortedAndMappedData.forEach(System.out::println);
    }

    


}