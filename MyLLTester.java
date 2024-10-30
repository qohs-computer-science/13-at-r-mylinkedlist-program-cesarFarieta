public class MyLLTester
{
  public static void main(String [] args){
    MyLinkedList happy = new MyLinkedList();
    System.out.println(happy.size());
    System.out.println(happy.isEmpty());
    happy.add("testingAdd");
    happy.addLast("testingAddLast");
    happy.addFirst("testingAddFirst");
    happy.set(5,"testingSet");
    System.out.println(happy.toString());

    System.out.println(happy.get(2));
    
    happy.removeFirst();
    System.out.println("After First Remove \n"+happy);
    happy.remove(3);
    System.out.println("After Remove\n"+happy);
    happy.removeLast();
    System.out.println("After Remove last\n"+happy);
  } // end main
  
} // end class
