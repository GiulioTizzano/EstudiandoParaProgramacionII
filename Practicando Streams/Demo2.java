import java.util.stream.Stream;
import java.util.Arrays;
import java.util.*;

public class Demo2{
    public static void main(String[] args){
        // En este pequeño programa, sólo multiplicamos por dos aquellos números que son impares.
        List<Integer> misDatos = Arrays.asList(5, 2, 1, 7);
        // Stream<Integer> streamMisDatos = misDatos.stream().filter(n -> n%2==1).sorted().map(n -> n * 2);
        // streamMisDatos.forEach(System.out::println);

        // Lo importante a saber es que .filter() utiliza como parámetro un predicate
    int resultado = misDatos.stream()
                    .filter(n -> n%2==1)
                    .sorted()
                    .map(n -> n * 2)
                    .reduce(0, (a, b) -> a + b);
        System.out.println(resultado);
                    
        
        
    }


}