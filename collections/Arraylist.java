import java.util.*;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
public class Arraylist {
    public static void main(String[] args) {
        // String[] Studentnames=new String[30];
        // Studentnames[0]="Rakesh";
        // Studentnames[29]="Harish";
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(40);
        System.out.println(list);
        List<Integer> list1=new ArrayList<>();
        list1.add(50);
        list1.add(60);
        list1.add(34);
        list.addAll(list1);
        System.out.println("After adding the elements"+list);
        //iterate using for loop
        /* 
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        //using the foreach loop
        for(Integer i:list)
        {
            System.out.println(i);
        } 

        //using the iterator
        Iterator<Integer>it=list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        */
    }
    
}
