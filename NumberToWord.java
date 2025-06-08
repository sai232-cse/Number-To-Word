import java.util.Scanner;
public class NumberToWord{
    public static void main(String args[]){
        Scanner snr=new Scanner(System.in);
        String one[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String ten[]={"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
	System.out.println("Enter any number");
        int n=snr.nextInt();
	System.out.println("The given number in words :");
        if(n<=19){
            System.out.println(one[n]);
        }
        else{
            if(n>=100000){
                System.out.print(one[n/100000]+" lakh ");
                n=n%100000;
            }
            if(n>=10000){
                System.out.print(ten[n/10000]+" ");
                n=n%10000;
            }
            if(n>=1000){
                System.out.print(one[n/1000]+" thousand ");
                n=n%1000;
            }
            else{
                System.out.print(" thousand ");
            }
            if(n>=100){
                System.out.print(one[n/100]+" hundred ");
                n=n%100;;
            }
            if(n>=10){
                System.out.print(ten[n/10]+" ");
                n=n%10;
            }
            if(n>=1){
                System.out.print(one[n/1]+" ");
                n=n%1;
            }
        }
    }
}