package Ls;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class General {
    public static void main( String[] args ) {
        //Ввод листа L
        int[][] L = {
                {0, 0, 3}, {0, 1, 0}, {1, 0, 2}, {0, 2, 1},
                {1, 1, 3}, {2, 0, 2}, {0, 3, 1}, {1, 2, 3},
                {2, 1, 3}, {3, 0, 2}, {1, 3, 0}, {2, 2, 0},
                {3, 1, 0}, {2, 3, 0}, {3, 2, 0}, {3, 3, 1}
        };

        List<Integer> Ls = new ArrayList<>( );
        int vWave = 0;
        for ( int i = 0; i < L.length; i++ ) {
            if ( i == 0 ) {
                vWave = 0;
                Ls.add( L[i][0] );
                Ls.add( L[i][1] );
                Ls.add( L[i][2] );
            } else {
                //Алгоритм заполнения списка Ls
                for ( int j = Ls.size( ); j > 0; j -= 3 ) {
                    if ( L[i][0] >= Ls.get( j - 3 ) & L[i][1] >= Ls.get( j - 2 ) ) {
                        vWave = Ls.get( j - 1 );
                        if ( vWave != L[i][2] ) {
                            Ls.add( L[i][0] );
                            Ls.add( L[i][1] );
                            Ls.add( L[i][2] );
                            j = 0;
                        } else j = 0;
                    }
                }
            }
        }
        //Вывод списка Ls
        for ( int i = 0; i < Ls.size( ); i++ ) {
            if ( i % 3 == 0 ) {
                System.out.print( "(" );
                for ( int k = i; k < i + 3; k++ ) {
                    System.out.print( " " + Ls.get( k ) + " " );
                }
                System.out.print( ")" + "\n" );
            }
        }

        List<Integer> LNew = new ArrayList<>( );
        //Ввод значения с клавиатуры
        Scanner scanner = new Scanner( System.in );
        System.out.println( "Введите элемемнт a'" );
        String input = scanner.nextLine( );    // get the entire line after the prompt
        String[] a = input.split( " " );
        for ( int i = Ls.size( ); i > 0; i -= 3 ) {
            //Поиск в списке
            if ( Integer.parseInt( a[0] ) >= Ls.get( i - 3 ) & Integer.parseInt( a[1] ) >= Ls.get( i - 2 ) ) {
                LNew.add( Ls.get( i - 3 ) );
                LNew.add( Ls.get( i - 2 ) );
                LNew.add( Ls.get( i - 1 ) );
                i = 0;
            }
        }
        //Вывод найденного Lnew
        System.out.println( "Элемент " +   a[0]+ " " + a[1] +" соответсвует " );
        if ( LNew.size( ) > 0 ) {
            System.out.println( LNew.get( 0 ) + " " + LNew.get( 1 ) + " " + LNew.get( 2 ) );
        } else {
            System.out.println( 0 + " " + 0 + " " + 0 );
        }
    }
}
