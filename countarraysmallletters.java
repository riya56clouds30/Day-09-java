import java.util.*;
public class countarraysmallletters{
    public static void main(String args[])
    {
        String a1="priya";
        int c1[]=new int[26];
        for(int i=0;i<a1.length();i++)
        {
            c1[(((int)(a1.charAt(i))))-97]++;
        }
        System.out.println(Arrays.toString(c1));
        }
}
