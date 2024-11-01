public class MyLLTester
{
  public static void main(String [] args){
    MyLinkedList happy = new MyLinkedList();
    System.out.println("Initial size:"+happy.size());
    System.out.println("Initial isEmpty:"+happy.isEmpty());
    System.out.println();

    happy.add("testingAdd");
    happy.add("testingAddP2");
    happy.add("testingAddP3");
    System.out.println("Initial add:\n" +happy);

    happy.addLast("testingAddLast");
    happy.addLast("testingAddLastP2");
    happy.addLast("testingAddLastP3");

    System.out.println("After addLast:\n" +happy);

    happy.addFirst("testingAddFirst");
    happy.addFirst("testingAddFirstP1");
    happy.addFirst("testingAddFirstP2");
    happy.addFirst("testingAddFirstP2");

    System.out.println("After addFirst:\n" +happy);

    System.out.println("Before set:\n" +happy);

    happy.set(5,"testingSet5");
    happy.set(2,"testingSet2");
    happy.set(3,"testingSet3");
    happy.set(4,"testingSet4");

    System.out.println("After set:\n" +happy);


    System.out.println("Second Element:"+happy.get(2));
    System.out.println("Fourth Element:"+happy.get(4));
    System.out.println("Third Element:"+happy.get(3));
    System.out.println("Sixth Element:"+happy.get(6));
    System.out.println();

    System.out.println("Before remove:\n" +happy);

    happy.removeFirst();
    System.out.println("After First Remove \n"+happy);
    happy.remove(3);
    System.out.println("After Remove\n"+happy);
    happy.removeLast();
    System.out.println("After Remove last\n"+happy);

    System.out.println("After All Remove:\n" +happy);


    System.out.println("End Result:\n "+ happy.toString());

  } // end main
  
} // end class
