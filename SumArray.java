public class HelloWorld{
    
public static int sum(int a[]){
 return sum(a,a.length-1);
}
private static int sum(int a[], int n){ 
 if(n==0)
 return a[0];
 else
 return a[n]+ sum(a,n-1);
 }

     public static void main(String []args){
  
      int[] a= {1,2,5,3,1};
      System.out.println(sum(a));
     }
}
