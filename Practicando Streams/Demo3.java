import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

// The Stream API in java is used to process collections of objects. That is, it simply is a sequence of objects
// which has a set of pipeline methods which can manipulate the data. It also has some terminal methods which 
// aid in storing the new manipulated information in the collection. Each time we apply a method to a Stream of 
// data, the Stream method returns another Stream of data.

// INTERMEDIATE OPERATIONS:

// 1. map: the map method is used to return a Stream consisting of the results of applying a given function
// to the elements of the Stream.
// Example: Squaring the numbers of a List.
public class Demo3{
    public static void main(String[] args){
        List<Integer> listaNumeros = Arrays.asList(1, 2, 3, 4, 5);
        // List number = Arrays.asList(1, 2, 3, 4, 5);
        // List numberSquared = (List) number.stream().map(x->x*x).collect(Collectors.toList());
        // System.out.println(numberSquared);
        List<Integer> numberSquared = Arrays.asList();
        numberSquared = listaNumeros.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(numberSquared);

        // The next important intermediate operation is the method filter, filter is a method that is used
        // to select elements as per de predicate passed as an argument.
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        List<String> result = Arrays.asList();
        result = (List) names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        // Now we use the sorted() intermediate method which is utilized to sort the stream.
        List<String> nombresDesordenados = Arrays.asList("Reflection", "Collection", "Stream");
        List<String> nombresOrdenados = Arrays.asList();
        nombresOrdenados = nombresDesordenados.stream().sorted().collect(Collectors.toList());
        System.out.println(nombresDesordenados);
        System.out.println(nombresOrdenados);


        // Now we are going to proceed to the terminal operations:
        // The first terminal operation is collect(), it is used to return the result of the intermediate
        // operations performed on the Stream.

        List<Integer> nums = Arrays.asList(1, 3, 4, 5, 2);
        List<Integer> numsSquared = Arrays.asList();
        numsSquared = (List) nums.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(numsSquared);

        // The next terminal operation is forEach(), this method is used to iterate through every element
        // of the Stream.

        List<String> listaDeNombres = Arrays.asList("Giulio", "Luca", "Macarena", "Nino");
        listaDeNombres.stream().forEach(x -> System.out.println(x));

        // The next terminal operation is the reduce() method which is used to reduce the elements
        // of a stream into a single value. The reduce() method takes a BinaryOperator as a parameter.

        List<Integer> numeri = Arrays.asList(2, 3, 4, 5, 6);
        int even = numeri.stream().filter(x -> x % 2 == 0).reduce(0, (x,y) -> x + y);
        System.out.println(even);

    }
}
