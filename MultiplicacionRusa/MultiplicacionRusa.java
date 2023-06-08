public class MultiplicacionRusa{

    public static int mRusaIter(int n, int m){
        int suma = 0;
        while(m > 0){
            if(m % 2 != 0){
                suma += n;
            }
            n *= 2;
            m /=2;
        }
        return suma;
    }
    public static int mRusaRecursivo(int n, int m){
        if(m == 0){
            return 0;
        } else{
            if(m % 2 != 0)
                return n + mRusaRecursivo(n * 2, m / 2);
            else
                return mRusaRecursivo(n * 2, m / 2);
        }
    }
    public static int mRusaRecAux(int n, int m, int suma){
        if(m == 0){
            return suma;
        } else if(m % 2 != 0){
            return mRusaRecAux(n * 2, n / m, suma + n);
        } else{
            return mRusaRecAux(n * 2, m / 2, suma);
        }
    }
    public static int mRusaRec2(int n, int m){
        return mRusaRecAux(n, m, 0);

    }
    

    public static void main(String[] args){
        System.out.println(mRusaIter(50, 17));
        System.out.println(mRusaRecursivo(50, 17));
        System.out.println(mRusaRec2(50, 17));
       
    }
    
}