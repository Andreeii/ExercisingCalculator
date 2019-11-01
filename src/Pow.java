public class Pow {
    public static int  pow(int a, int b){

        int rez = 1 ;

        for (int i = 0 ; i < b ; i++){
            rez *=a;
        }
        return rez;
    }
}
