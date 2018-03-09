package matrixmultiplication;

public class AdvancedMultiplier {
    public String toString() {
        return "BasicMultiplier";
    }

    public IntMatrix multiply(IntMatrix a, IntMatrix b) {
        int dim = a.getDim();
        IntMatrix x = new IntMatrix(dim);
        int[][] C = x.getValues();
        int[][] B = b.getValues();
        int[] Arowi, Crowi, Browi;

        int aValue = 0;
        int i, j, k;
        for(i = 0;i<dim;i++){
            Arowi = a.getValues()[i];
            Crowi = C[i];
            for(k = 0;k<dim;k++){
                Browi = B[k];
                aValue = Arowi[k];
                for(j = dim;--j>=0;){
                    Crowi[j] += aValue*Browi[j];
                }
            }
        }
        return x;
    }
}
