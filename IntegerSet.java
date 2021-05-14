public class IntegerSet {
    private static final int MIN = 0;
    private static final int MAX = 100;
    private boolean[] arreglo;

     public IntegerSet() {
        arreglo = new boolean[MAX + 1]; 
        // boolean por default inicializados en falso
    } //constructor

    public static IntegerSet union(IntegerSet conjunto1, IntegerSet conjunto2) {
        IntegerSet res = new IntegerSet();
        for (int i = 0; i <= MAX; ++i) {
            res.arreglo[i] = conjunto1.arreglo[i] | conjunto2.arreglo[i];
        }//for i
        return res;
    }// union

    public static IntegerSet intersection(IntegerSet conjunto1, IntegerSet conjunto2) {
        IntegerSet res = new IntegerSet();
        for (int i = 0; i <= MAX; ++i) {
            res.arreglo[i] = conjunto1.arreglo[i] & conjunto2.arreglo[i];
        }//for i
        return res;
    }// intersection


    public void insertElement(int i) {
        arreglo[i] = true;
    }//insertElement

    public void deleteElement(int i) {
        arreglo[i] = false;
    }//deleteElement

    
    public String toSetString() {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= MAX; i++) {
            if (arreglo[i])
                sb.append(i).append(",");
            else
                sb.append("-").append(",");
        }// for i
        return sb.toString();
    }// toSetString

      public static boolean isEqualTo(IntegerSet conjunto1, IntegerSet conjunto2) {
        return java.util.Arrays.equals(conjunto1.arreglo, conjunto2.arreglo); 
    }//isEqualTo

}//class IntegerSet
