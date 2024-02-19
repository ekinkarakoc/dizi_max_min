import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {72,51,37,34,81,98,23};
        Arrays.sort(list);

        int min = list[0];
        int max = list[0];

        for(int i:list){
            if (i<min){
                min = i;
            }else if(i>max){
                max = i;
            }
        }

        System.out.println("max = " + max + " min = " + min);

    }
}