package Day3;

import java.util.Arrays;

public class Arraysort {
    public static void main(String[] args) {
        String[] names = {"Jesna", "Arun", "Kavita", "Rakesh", "Pooja"};
        Arrays.sort(names);
        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
    }


}
