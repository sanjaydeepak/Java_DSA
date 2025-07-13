public class Loop {
    public static void main(String[] args) {
        int n=5;
        int sum=0;
        int i=6;
        while(n>0)
        {
            sum+=i;
            i++; // important if not declared a Infinite loop Occur's
        }
//        do {
//            sum+=i;
//            i++;
//        }while(i<=n);
        System.out.print(sum);
    }
}
