package Test;

import java.util.Scanner;

public class TestNo2 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Inputkan angka integer : ");
       int input = scanner.nextInt();
       int matrix[][] = new int [input][input];
       int bilangan1 = 1;
       for (int i = 0; i < matrix.length;i++){
        for (int j = 0; j < matrix.length;j++){
            if(j%2 == 0){
                matrix[i][j] = i + bilangan1;
            } else{
                matrix[i][j] = matrix.length - i;
            }
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println(" ");
       }
       scanner.close();
    }
}
