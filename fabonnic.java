import java.text.BreakIterator;
import java.util.Scanner;
class fab{
    Scanner sc=new Scanner(System.in);
    int f;

    fab(){
        System.out.println("Enter the length fabonnic series");
        f=sc.nextInt();
    }

    int fib(int range){
        if(range<=1){
            return range;
        }
        return fib(range-1)+ fib(range-2);
    }
    
    void showSeries(){
        for(int i=0;i<this.f;i++){
            System.out.print(fib(i)+",");
        }
    }
}
public class fabonic {
        public static void main(String[] args) {
        System.out.println("i am her");
        fab m=new fab();
        m.showSeries();
    }
}
