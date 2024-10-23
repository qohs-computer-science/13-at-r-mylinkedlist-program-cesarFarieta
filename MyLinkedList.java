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
