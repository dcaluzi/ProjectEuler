import java.lang.reflect.Array;
import java.util.ArrayList;

public class p1_multiples3_5 {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        do{
            if(i%3 == 0 || i%5 == 0){
                sum+= i;
            }
            i++;
        }while(i < 1000);


        System.out.println(sum);
    }

}
