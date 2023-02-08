package Test;

import java.util.Scanner;

public class TestNo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inputkan sebuah angka integer : ");
        int input = scanner.nextInt();
        int matrix[][] = new int [input][input];

        for(int i = 0; i<matrix.length;i++){
            int bilangan1 = 1;
            int bilangan2 = input;
            System.out.println("");

            for(int j = 0; j < matrix[i].length;j++){
                if(i%2 == 0){
                    matrix[i][j] = bilangan2;
                    System.out.print(matrix[i][j] + " ");
                    bilangan2--;
                }
                else{
                    matrix[i][j]=bilangan1;
                    System.out.print(matrix[i][j] + " ");
                    bilangan1++;
                }
            }
        }
        scanner.close();
    }
}
