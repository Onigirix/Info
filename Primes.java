import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int toCheck = n.nextLine();
        if (checkPrime(toCheck)){
            System.out.println(n + " ist eine Primzahl");
        }else{
            System.out.println(n + "ist keine Primzahl");
        }
        
    }

    public static boolean checkPrime(int){
        int t = 0; //Teileranzahl auf 0
        int i = 1; //Laufvariable auf 1
        while (i<=n){
            if(n%i == 0){
                t++; //Teileranzahl erhöhen
            }
            t++ //Laufvariable erhöhen
        }
        if(t == 2){ //Teileranzahl = 2?
            return true;
        }
        return false;
    }
}