package List;

import List.Lists;

public class Test {
    public static void main (String []args) {
        Lists t = new Lists();

        for (int i=1; i< 5; i++)
        {
            t.addFront(i+10);
        }
        t.print();
        System.out.println("---------------------------------");
        System.out.println(t.getSize());
        System.out.println("---------------------------------");


        t.insert(44,0);
        t.print();
        System.out.println("---------------------------------");
        System.out.println(t.getSize());
        System.out.println("---------------------------------");

        t.deleteByPos(0);
        t.print();
        System.out.println("---------------------------------");

        System.out.println(t.getSize());


    }
}
