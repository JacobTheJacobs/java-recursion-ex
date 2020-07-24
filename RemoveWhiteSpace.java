public class HelloWorld{
    
public static String reverseString(String s) {

    if(s == null || s.length() == 0) {
        return null;
    }

    char c = s.charAt(0);
    if(' ' == c) {
        return reverseString(s.substring(1));
    } else {
        System.out.print(s.charAt(0));
        return reverseString(s.substring(1)) + s.charAt(0);
    }
}

     public static void main(String []args){
  
       reverseString("be at l es");
      
     }
}
