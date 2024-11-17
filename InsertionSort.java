import java.util.Collections;

public class InsertionSort {
  
  /**
   * Insertion Sort
   * @param unsorted unsorted list
   * @param record a recorder to demonstrate each step
   * @return sorted list
   */
  public static CardPile sort(CardPile unsorted, SortRecorder record) {
    record.add(unsorted);

    CardPile sorted = new CardPile();
    sorted.add(unsorted.removeFirst());
    record.next();
    record.add(sorted);
    record.add(unsorted);
  
    while (unsorted.size() > 0){
      Card temp = unsorted.removeFirst();
      Card node = null;
      for (Card c: sorted){
        if (c.compareTo(temp) < 0){
          node = c;
        }
      }
      if (node == null){
        sorted.addFirst(temp);
      }
      else{
        sorted.insertAfter(temp, node);
      }
      record.next();
      record.add(sorted);
      record.add(unsorted);
    }
    return sorted;
  }

  public static void main(String args[]) {

    // set up a class to record and display the sorting results
    SortRecorder recorder = new SortRecorder();

    // set up the deck of cards
    Card.loadImages(recorder);
    CardPile cards = new CardPile(Card.newDeck(true), 2, 2);

    // mix up the cards
    Collections.shuffle(cards);

    // in your program, this would be a call to a real sorting algorithm
    cards = InsertionSort.sort(cards, recorder);

    // We can print out the (un)sorted result:
    System.out.println(cards);

    // make window appear showing the record
    recorder.display("Card Sort Demo: InsertionSort");
  }
}
