public class MyLinkedList
{
    private ListNode head;
	private ListNode size ;

	public MyLinkedList()
	{
		head = null; 
		size = 0;
	} // end Constructor

    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if (head== null || size==0)
            return true;
        else
            return false;
    }

    public boolean add(Object newItem){

        
        
        ListNode temp=head;
        int ogSize=temp.size();
        while(temp.getNext() != null){
            temp=temp.getNext();
        }
        temp.set(newItem);


        if(ogSize!=head.size())
            return true;
        else
            return false;

        
    }

    public boolean addLast(Object newItem){

        
        
        ListNode temp=head;
        int oldSize=temp.size();
        while(temp.getNext() != null){
            temp=temp.getNext();
        }
        temp.set(newItem);


        if(oldSize!=head.size())
            return true;
        else
            return false;

        
    }


    public boolean addFirst(Object newItem){

        
        
        ListNode temp=head;
        int firstSize=temp.size();

        
        while(temp.getNext() != null){
            temp=temp.getNext();
        }
        temp.setNext(newItem);


        if(firstSize!=head.size())
            return true;
        else
            return false;

        
    }




    public String toString(){
        String result="";
        int loco=1;
        ListNode temp = head;
        while (temp != null)
        {
            result += loco +":"+temp.getValue()+"\n";
            temp = temp.getNext();
            loco++;
        }
        return result;
        
    }

}
