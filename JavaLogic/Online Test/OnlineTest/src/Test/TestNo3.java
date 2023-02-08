package Test;

import java.util.Scanner;

public class TestNo3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("inputkan angka integer : ");
       int input = scanner.nextInt();
       int matrix[][] = new int [input][input];
       for(int i = 0; i < matrix.length; i++){
        int bilangan1 = 1;
            for(int j = 0; j < matrix.length; j++){
                matrix[i][j] = bilangan1;
                if(i%2 == 0){
                    if(j%2 == 1){
                        System.out.print(matrix[i][j] + "  ");
                    } else{
                        System.out.print(" - ");
                    }
                }else{
                    if(j%2 == 0 ){
                        System.out.print(matrix[i][j] + "  ");
                    }else{
                        System.out.print(" - ");
                    }
                }   
                bilangan1++;
        }
        System.out.println(" ");
       }
       scanner.close();
    }
}
