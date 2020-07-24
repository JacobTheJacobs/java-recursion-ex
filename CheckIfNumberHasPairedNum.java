public class HelloWorld{
    
    public static boolean sum(int n){
        if(n==1) return true;
        if(n%2==0){
            sum(n-1);
          return true;
        }
        return false;
    }

     public static void main(String []args){
        System.out.println(sum(4023));
     }
}
