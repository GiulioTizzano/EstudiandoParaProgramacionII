import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Demostración completa para cada uno de los métodos aprendidos + los que están en la presentación:

public class Demo4{
    public static void main(String[] args){
        // Crear una lista de números enteros
        List<Integer> listNumbers = Arrays.asList(2, 3, 4, 5);

        // Demonstration for the map method:
        List<Integer> square = Arrays.asList();
        square = listNumbers.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(square);

        // Create a List of type String:
        List<String> listString = Arrays.asList("Giulio", "Francesco", "Tizzano", "Groeneveld");
        // Demonstration of filter method():
        List<String> resultadoFiltro = listString.stream().filter(x -> x.endsWith("d")).collect(Collectors.toList());
        System.out.println(resultadoFiltro);
        // Demonstration for sorted():
        List<String> show = listString.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        // Creating a list of integers:
        List<Integer> numIntegers = Arrays.asList(2, 3, 4, 5, 2);
        Set<Integer> setNumbersSquared = numIntegers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println(setNumbersSquared);

        // Demonstration for the forEach method():
        numIntegers.stream()
                    .map(x -> x * x)
                    .forEach(y -> System.out.println(y));

        // Demonstration of the reduce() method:
        int even = numIntegers.stream().filter(x -> x % 2 == 0).reduce(0, (x, y) -> x + y);
        System.out.println("Este es el resultado: " + even);

        // Estos métodos son de los apuntes mios de clase:

        // Por alfabeto --> sorted(Comparator.naturalOrder)
        List<String> porAlfabeto = listString.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(porAlfabeto);

        // Orden reverso: sorted(Comparator.reverseOrder)
        List<String> porAlfabetoInverso = listString.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(porAlfabetoInverso);

        // Máximo numero de la lista:
        Optional<Integer> maximum = numIntegers.stream().max(Comparator.naturalOrder());
        System.out.println(maximum);

        // Mínimo numero de la lista:
        Optional<Integer> minimum = numIntegers.stream().min(Comparator.naturalOrder());
        System.out.println(minimum);

        // El método distinct() lo que hace es eliminar duplicidades
        List<String> duplicidades = Arrays.asList("Giulio", "Giulio", "Francesco", "Francesco");
        List<String> sinDuplicidades = duplicidades.stream().distinct().collect(Collectors.toList());
        System.out.println(sinDuplicidades);
    }
}