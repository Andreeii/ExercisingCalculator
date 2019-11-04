public class Main {
    public static void main (String[]args){

       int a = 2;
       int b = 6;
       int count = 10 ;
        System.out.println(Pow.pow(a,b));
        System.out.println(Prod.prod(a,b));
        System.out.println(Sum.sum(a,b));
        System.out.println(Cit.cit(a,b));
        RecursiveFibonaci.printFibonacci(count );
        System.out.println();

// to do fibonaci , implement into a method
//        int n1=0,n2=1,n3;
//        System.out.print(n1+" "+n2);
//        for(int i=2;i<count;++i)
//        {
//            n3=n1+n2;
//            System.out.print(" "+n3);
//            n1=n2;
//            n2=n3;
//        }
//end of fibonaci
        int sum  = 9;
        int arrr[] = {1,3,5,2,4,7,6,9,8};

        for (int i = 0 ; i < arrr.length-i;i++){
            for (int j = 0 ; j < arrr.length;j++){
                if(arrr[i]+arrr[j] == sum){
                    System.out.println(arrr[i] + " "+ arrr[j]);
                }
            }
        }
    }
}
