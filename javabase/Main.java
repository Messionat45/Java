package javabase;
import java.util.ArrayList;

public class Main{

    // static means the method belongs to the CLASS itself, rather than to an individual OBJECT of that class.
    static int multiply(int a){
        return 8 * a;
    }

    // if static not cretd we eed to carete object of the main cals andthen call this fun
    int multiply2(int a){
        return a *100;
    }

   
    public static void main(String[] args){

         Main obj = new Main(); // created Main class object

        int a = 2;
        System.out.println(a*2);
        String str = "Tejas";
        boolean flag = true;
        char ch = 'a';

        System.out.println(multiply(a));

        int[] arr = {10,20,30, 40};
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //cpp vector is arrylist in java
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(99);
        nums.add(100);
        System.out.println(nums+" ");

        nums.remove(1);
        System.out.print(nums);

        nums.add(100);
        nums.add(101);
        nums.add(102);
        nums.add(103);

        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

        System.out.println(obj.multiply2(a));

    }
}