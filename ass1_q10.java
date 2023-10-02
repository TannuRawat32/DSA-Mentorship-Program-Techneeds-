import java.util.Scanner;

class FirstClass{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    for(int div = 2; div * div <= n; div++){
      while(n % div == 0){
      n = n/div;
      System.out.println(div);
      }
    }
    if( n != 0){
    System.out.println(n);
    }
    
  }
}
