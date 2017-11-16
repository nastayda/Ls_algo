package A3;

public class A3 {
    public static void main( String[] args ) {
        int[][] T1 = {{1, 1, 0, 1},
                {0, 0, 0, 1}};
        int[][] T2 = {{1, 0, 1, 0},
                {0, 1, 1,0}};
        int[] x = {0, 1, 0, 1};

        int[][] T = new int[4][4];
        //1) T=T1+T2 каждую строку сложить с текущей строкой матрицы
        for ( int i = 0; i < 4; i++ ) {
            for ( int k = 0; k < 2; k++ ) {
                for ( int h = 1; h >= 0; h-- ) {
                    for ( int j = 0; j < 4; j++ ) {
                        T[i][j] = ( T1[k][j] ^ T2[h][j] );//mod2
                    }i++;
                }
            }
        }
        for ( int h = 0; h < 4; h++ ) {
            for ( int j = 0; j < 4; j++ ) {
                System.out.print(T[h][j] + " ");
            }System.out.println();
        }
        //System.out.println( "hola" );
    }
}
