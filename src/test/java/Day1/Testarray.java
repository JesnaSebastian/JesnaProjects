package Day1;

public class Testarray {
    public static void main(String[] args) {
        String s="1234";
        char[] arr=s.toCharArray();
        for (char elemet: arr)
        {
            System.out.println(elemet);
        }
        int sum=0;
        for(int i=0;i<= arr.length;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum" +sum);

    }

}
