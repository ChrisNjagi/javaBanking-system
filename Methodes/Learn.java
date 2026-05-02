public class Learn{
    static void nam(String name){
        System.out.println("Hello " + name);
    }
    static int fac(int n){
        if(n>0){
            return n * fac(n-1);
        }
        else if(n==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        nam("Christopher");
        int result = fac(5);
        System.out.println(result);
    }
}
