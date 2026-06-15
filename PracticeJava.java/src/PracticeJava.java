public class PracticeJava {
    public static boolean isEven(int n) {
            return n % 2 == 0; 
        }
    public static int maxNum(int a , int b){
        if (a > b){
            return a;
        }
        else {
            return b;
        }
    }  
    public static void greet(String name){
        System.out.printf("Hello %s! Welcome to Java%n",name);
    }  
    public static double cToF(double c){
        return (c * 9/5) + 32;
    }
    public static void main(String[]args){
        System.out.println(isEven (9));
        System.out.println(maxNum(12,45));
        greet("Javier");
        System.out.println(cToF(100));
    }

}
