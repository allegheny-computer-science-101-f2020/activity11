package activityeleven;

import activityeleven.SinglyLinkedList;

/**
 * An Experiment class that can run a campaign of experiments.
 * Note that this class supports running campaigns of experiments for a
 * different number of rounds for different methods of SinglyLinkedList.
 *
 * @author Janyl Jumadinova
 */

public class Experiment {

  /** Run the experiment campaigns for an algorithm in a SinglyLinkedList. */
  public static void main(String[] args) {

    // Populate the SinglyLinkedList with the specified amount of data.
    SinglyLinkedList<String> list = new SinglyLinkedList<String>();
    /*for (int i = 0; i < 20; i++) {
      list.addLast(Integer.toString(i));
    }*/

    System.out.println("Size: " + list.getSize());
    System.out.println("Is Empty?: " + list.isEmpty());
    System.out.println("First Element: " + list.getFirst());
    System.out.println("Last Element: " + list.getLast());
  }

}
