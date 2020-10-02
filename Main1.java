import java.util.*;
  import java.io.*;
  public class Main1 {
    public static void main(String args[]) throws IOException {
   Scanner sc= new Scanner(System.in);
      int h=sc.nextInt();
     
       for (int i = 0; i <h; i++) {
        
         int k=sc.nextInt();
         int l=factorial(k);
         System.out.println(l);
      }
     
  }
  static int factorial(int n) 
    { 
        if (n == 0) 
            return 1; 
  
        return n * factorial(n - 1); 
    } 
  }