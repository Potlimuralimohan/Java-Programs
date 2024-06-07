package Slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Findanagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String p=sc.next();

        // int res=0;
        // int windowsize=p.length();
        // int start=0;
        // int end=0;

        //char[] charArray=t.toCharArray();
        HashMap<Character,Integer>map = new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(char ch:p.toCharArray())
        {
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }
        //Numbers of Distint letters the pattern have
        int count=map.size();
        int k=p.length();

        int i=0,j=0;

        while (j<s.length()) {
            char ch=s.charAt(j);
            if(map.containsKey(ch))
            {
                map.put(ch, map.get(ch)-1);
                if(map.get(ch)==0)
                {
                    count--;
                }
            }
            if(j-i+1 <k)
            {
                j++;
            }
            else{
                if(count==0)
                {
                    ans.add(i);
                }
                //slide the window
                char ch1=s.charAt(i);
                if(map.containsKey(ch1))
                {
                    map.put(ch1, map.get(ch1)+1);
                    if(map.get(ch1)==1)
                    {
                        count++;
                    }
                }
                i++;
                j++;
            }
            
        }
        System.out.println(ans);


    }
}
