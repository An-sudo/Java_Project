import sun.lwawt.macosx.CSystemTray;

import java.sql.Array;
import java.util.ArrayList;


public class main {
    static int Algroithm(int nums){
        if(nums > 0){
            return nums + Algroithm(nums -1);
        }else{
            return 0;
        }
    }

    static void recursionMethod(int nums){
        if(nums<1){
            System.out.println("This number is less than 1");
        }else{
            recursionMethod(nums-1);
            System.out.println(nums);
        }
    }

        public static void main(String[] args){

            ArrayList<String>  food = new ArrayList<String>();
            food.add("hotdog");
            food.add("pizza");
            food.add("hotpot");
            for(int i  = 0 ; i < food.size();i++){
                    System.out.println(food.get(i));
            }


            int temp = Algroithm(10);
            System.out.println("This is recursion result:" + temp);
            System.out.println("**********************************************");
            recursionMethod(10);

            ArrayList<Integer> temp1 =  new ArrayList<Integer>();
        }


}
