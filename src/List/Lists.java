package List;

public class Lists {
    private int size = 0;
    private ListNode head=null;
    private ListNode tail=null;

    private class ListNode
    {
        private ListNode next;
        private int value;

        ListNode(ListNode next, int value)
        {
            this.next=next;
            this.value=value;
        }

    }

    Lists()
    {
       //head= new ListNode(null,0);
    }


    public boolean addFront(int value)
    {
        if(head==null)
        {
            head = new ListNode(null,value);
            tail=head;
        }
        else
        {
            head = new ListNode(head,value);

        }
        ++size;
        return true;
    }

    public boolean addBack(int value)
    {
        if(head==null)
        {
            head = new ListNode(null,value);
            tail=head;
        }
        else
        {
           tail.next = new ListNode(null,value);
           tail=tail.next;

        }
        ++size;
        return true;
    }

    public void insert(int value, int number){
        if (number<0 || number>= size) { System.out.println("Сюда нельзя вставить"); return; }
        if(number==0) addFront(value);
        else {

            ListNode t = head;
            for (int i = 1; i < number; i++) {
                t = t.next;
            }
            ListNode new_node = new ListNode(t.next, value);
            t.next = new_node;
            ++size;
        }

    }

    public void deleteByVal(int value){

        if(head==null) {
        return;
        }
        if (head==tail)
        {
            if (head.value == value)
            {
                head=tail=null;
                size=0;
                return;
            }
        }
        if (head.value == value)
        {
            head=head.next;
            return;
        }
        else {
            ListNode t = head;
            while (t.next!=null)
            {

                if(t.next.value==value)
                {
                    if (tail==t.next)
                    {
                        tail=t;
                    }
                        t.next=t.next.next;
                        size--;
                }
                else                 t=t.next;

            }
        }

    }

    public void deleteByPos(int index){
        if (index<0 || index>= size) { System.out.println("Нет элемента с таким индексом"); return; }
        if (index == 0)
        {
            head=head.next;
            size--;

            return;
        }
        else {
            ListNode t = head;
            for (int i = 1; i < index-1; i++) {
                t = t.next;
            }
            t.next = t.next.next;
            size--;

            }
        }



    public void print(){

        for(ListNode r = head; r != null; r = r.next)
           System.out.println(r.value);
    }


    public int getSize() {
        return size;
    }
}
