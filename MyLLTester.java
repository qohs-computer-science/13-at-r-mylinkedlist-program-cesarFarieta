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

  } // end main
  
} // end class
