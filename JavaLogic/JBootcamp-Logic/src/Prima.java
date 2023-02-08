import java.util.Scanner;

public class Prima {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, awal, akhir,prime;
        System.out.print("Mulai dari angka :");
        awal = scanner.nextInt();
        System.out.print("sampai angka : ");
        akhir = scanner.nextInt();

        for(int i = awal; i <= akhir;i++ ){
            num = 0;
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    num = num +1;
                }
            }
            if(num==2){
                System.out.print(i + " ");
            }
        }
        System.out.println(" ");

        System.out.print("Masukan angka bilangan prima : ");
        prime = scanner.nextInt();
        int cek = 0;
        for(int i = 2 ; i <= prime; i++){
            if(prime%i == 0){
            cek++;
            }
        }
        if( cek==1){
            System.out.println(prime + " adalah bilangan prima");
        }else{
            System.out.println(prime + " ini bukan bilangan prima");
        }



        scanner.close();
    }
}
