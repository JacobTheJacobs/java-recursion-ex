public class HelloWorld{
    
public static void reverseString(String input) {
  if(input.length() > 0) {
        reverseString(input.substring(1));
        System.out.print(input.charAt(0));
    }
}

     public static void main(String []args){
  
       reverseString("beatles");
      
     }
}
