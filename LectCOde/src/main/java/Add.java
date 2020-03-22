public class Add {
    public static void main(String[] args) {
        System.out.println(Add("123"));
    }
    public static int Add(String str) {
        if(str == null || str.length() == 0){
            return 0;
        }
        long n = 0;
        long j = 0;
       for (int i = str.length()-1; i >= 1; i--) {
            if('0' <= str.charAt(i) && str.charAt(i)<= '9'){
                n = n + (str.charAt(i) - '0')* (long)Math.pow(10,j++);
            }else {
                return 0;
            }
        }
       if(str.charAt(0) == '+'){
           if(n > Integer.MAX_VALUE){
               return 0;
           }else {
               return (int)n;
           }
       }else if(str.charAt(0) == '-'){
           if(-n < -Integer.MAX_VALUE-1){
               return 0;
           }else {
               return (int)-n;
           }
       }else if('0' <= str.charAt(0) && str.charAt(0)<= '9'){
           n =  n + (str.charAt(0) - '0')*(int)Math.pow(10,str.length()-1);
           if(n > Integer.MAX_VALUE){
               return 0;
           }else {
               return (int)n;
           }
       }else {
           return 0;
       }
    }
}
