// Las expresiones lambda se forman de la siguiente estructura:

// Argumentos    Operador      Expresión
//  (x, y)          ->           {x + y}
//                       más de una sentencia requiere {}
import java.util.*;
public class DemoExpresionesLambda{
    private int codigo;
    private String moneda;
    private String descripcion;
    private float valor;

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getMoneda(){
        return moneda;
    }
    public void setMoneda(String moneda){
        this.moneda = moneda;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(){
        this.descripcion = descripcion;
    }
    public float getValor(){
        return valor;
    }
    public void setValor(float valor){
        this.valor = valor;
    }

    public DemoExpresionesLambda(int codigo, String moneda, String descripcion, float valor){
        this.codigo = codigo;
        this.moneda = moneda;
        this.descripcion = descripcion;
        this.valor = valor; 


    }
    public static void main(String[] args){
        // List<String> listaNombres = new ArrayList<>();
        
        // listaNombres.add("Ecuador");
        // listaNombres.add("México");
        // listaNombres.add("Colombia");
        // listaNombres.add("Perú");
        
        // listaNombres.forEach(pais -> System.out.println("El país es: " + pais));

        // List<Integer> lista = new ArrayList<>();
        // lista.add(10);
        // lista.add(5);
        // lista.add(18);
        // lista.add(21);
        // lista.add(42);
        // lista.add(12);
        //                                         //.forEach(System.out::println)
        // lista.stream().filter(edad -> edad >= 18 && edad <= 35).forEach(lis -> System.out.println("Edades: " + lis));

        List<DemoExpresionesLambda> lista = new ArrayList<>();
        lista.add(new DemoExpresionesLambda(1, "BITCOIN", "BTC", 6000));
        lista.add(new DemoExpresionesLambda(1, "ETHEREUM", "ETH", 3000));
        lista.add(new DemoExpresionesLambda(1, "DODGECOIN", "dog", 5));

        // lista.forEach(token -> System.out.println("Moneda: " + token.getMoneda()));
        lista.stream().filter(valor -> valor.getValor() > 5000).forEach(lis -> System.out.println("Moneda: " + lis.getMoneda() + "\n"
        + "y su valor es: " + lis.getValor()));


    }

}