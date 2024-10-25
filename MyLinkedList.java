public class MyLinkedList
{
    private ListNode head;
	private int size ;

	public MyLinkedList()
	{// start MyLinkedList
		head = null; 
		size = 0;
	} // end MyLinkedList

    public int size(){// start size
        return size;
    }// end size

    public boolean isEmpty(){// start isEmpty
        if (head== null || size==0)
            return true;
        else
            return false;
    }// end isEmpty

    public boolean add(Object newItem){// start add
        int ogSize=size;
        // check if empty
        // add the special way to an empty list
        if (size == 0)
            head= new ListNode(newItem,null);
        else{
            
            ListNode temp=head;
            while(temp.getNext() != null){// start while
                temp=temp.getNext();
                size++;
            }// end while
            temp.setNext(new ListNode(newItem,null));
        }

        if(ogSize!=size)
            return true;
        else
            return false;

        
    }// end add

    public boolean addLast(Object newItem){// start addLast
        boolean possible = true;
        if(possible== true){// start if
            add(newItem);
            possible= true;
        }// end if 
        else
            possible= false;
        return possible;
        
        
    }// end addLast


    public boolean addFirst(Object newItem){// start addFirst
        head= new ListNode(newItem,null);
        size++;
        return true;
    }// end addFirst


    public Object get(int i){// start get

        ListNode temp = head;
        if (i < 0 || i >= size) 
            throw new IndexOutOfBoundsException();
        else{// start else
            for(int x =0;x<i;x++)
                temp= temp.getNext();
        }// end else  
            
        return temp.getValue();

    }// end get

    public String toString(){//start toString
        String result="";
        int loco=1;
        ListNode temp = head;
        while (temp != null)
        {// start while
            result += loco +":"+temp.getValue()+"\n";
            temp = temp.getNext();
            loco++;
        }// end while
        return result;
        
    }// end toString

}// end class
