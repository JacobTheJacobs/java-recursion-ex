public class HelloWorld{
    
    public static int toLowerCase(String str){
        if(str.length()==0) return 0;
        boolean cheacj =Character.isLowerCase(str.charAt(0));
         System.out.println(str.charAt(0));
        if(cheacj){
          return  toLowerCase(str.substring(1))+1;
        }
          System.out.println(str);
        return toLowerCase(str.substring(1));
             
    }

     public static void main(String []args){
         String n= "FSAsdsadASdcCa";
       System.out.println(toLowerCase("FSAsdsadASdcCa"));
      
     }
}
