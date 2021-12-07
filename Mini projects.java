package mohamed;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;


public class mo {
    public static void main(String[] args) {
        
        System.out.println("Starting ......");
        Scanner Buck = new Scanner(System.in);
        int y = 1 ;
        while(y==1){
        System.out.println("[1] Calculate the area of different shapes");
        System.out.println("[2] Calculate Matrix");
        System.out.println("[3] Convert octal to decimal and vice versa");
        System.out.println("[4] Count vowel char");
        System.out.print("Chose: ");
        int t = Buck.nextInt();
        if(t==1)
        {
        System.out.println("[1] Cycle               [2] Triangle");
        System.out.println("[3] Rectangle           [4] Cube");
        System.out.println("[0] Close");
        System.out.print("Chose: ");
        int x = Buck.nextInt();
        if(x == 1){
            System.out.print("Redius: ");
            int R = Buck.nextInt();
            System.out.println("Area: " + (3.14*R*R));
        }
        if(x == 3){
            System.out.print("Length: ");
            int L = Buck.nextInt();
            System.out.print("Width: ");
            int W = Buck.nextInt();
            System.out.println("Area: " + (L*W));
        }
        if(x == 2){
            System.out.print("Hight: ");
            int H = Buck.nextInt();
            System.out.print("Base: ");
            int B = Buck.nextInt();
            System.out.println("Area: " + (0.5*H*B));
        }
        if(x == 4){
            System.out.print("Length: ");
            int A = Buck.nextInt();
            System.out.println("Area: " + (6*A*A));
        }
        }


        if(t==2){
        int n;
        System.out.print("How much numbers you are get in process? ");
        n = Buck.nextInt();
        int[] num=new int[n];
        for(int i = 0 ; i<n;i++){
            num[i]=Buck.nextInt();
        }
        System.out.println("[1] Addition               [2] Substraction");
        System.out.println("[3] Multiblication         [0] Close");
        System.out.print("Select the operation: ");
        int h = Buck.nextInt();
        long result;
        if(h == 1){
            result = 0;
            for(int i = 0 ; i<n ; i++) result += num[i];
            System.out.println("Result: " + result);
        }
        if(h == 2){
            result = 0;
            for(int i = 0 ; i<n ; i++) result -= num[i];
            System.out.println("Result: " + result);
        }
        if(h == 3){
            result = 1;
            for(int i = 0 ; i<n ; i++) result *= num[i];
            System.out.println("Result: " + result);
        }
        }


        if(t==3){
        System.out.println("[1] Convert to decimal                    [2] Convert to octal");
        System.out.println("[0] Close");
        System.out.print("Choise: ");
        int l = Buck.nextInt();
        if(l==1){
            long R;
            System.out.print("Octal number: ");
            R = Buck.nextInt();
            int i = 0;
            long sol=0;
            while(R!=0){
                sol += (R%10)*Math.pow(8,i);
                R = R/10;
                i++;
            }
            System.out.println("Decimal number: " + sol);
        }
        int[] Num = new int[100];
        int D;
        int i = 0;
        if(l==2){
            System.out.print("Decimal number: ");
            D = Buck.nextInt();
            while(D!=0){
            Num[i]= D%8;
            D = D/8;
            i++;
            }
            System.out.print("Octal: ");
            i--;
            for(;i>=0;i--){
                System.out.print(Num[i]);
            }
            System.out.println();
        }
        }
        
        
        if(t==4)
        {
            System.out.println("[1] Start                      [0] Close");
            System.out.print("Chose: ");
            int p = Buck.nextInt();
            if(p!=0){
            int count = 0;
            System.out.print("String:(not use space with input) ");
            String A = Buck.next();
            A = toLowerCase(A);
            int L = A.length();
            char arr[] = new char[L];
            A.getChars(0,L,arr,0);
            for(int o = 0 ; o<L ; o++){
                if(arr[o]=='a'||arr[o]=='e'||arr[o]=='i'||arr[o]=='o'||arr[o]=='u'){
                    count++;
                }
            }
            System.out.println("Vowel: " + count);
            }
            }
        System.out.println("****************[END]*******************");
        System.out.println("[0] Exit                       [1] Continue");
        System.out.print("Chose: ");
        y = Buck.nextInt();
        }
} 
        }
