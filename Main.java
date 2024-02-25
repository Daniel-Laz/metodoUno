import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] numeri= new int[10];
		System.out.println("inserisci 10 numeri");
		for (int i=0;i<10;i++){
		    numeri[i]=in.nextInt();
		}
		if (isUno(numeri))
            System.out.println("i numeri sono tutti 1");
        else
            System.out.println("i numeri non sono tutti 1");
	}
	
	private static boolean isUno(int[] x){
	    boolean uno=true;
	    for (int i=0; i<x.length;i++){
	        if (x[i]!=1)
	            uno=false;
	    }
	    return uno;
	    
	}
}
