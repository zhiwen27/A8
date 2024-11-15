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
      int index = -1;
      for (int i = 0; i < sorted.size(); i ++){
        if (temp.compareTo(sorted.get(i)) > 0){
          index = i;
        }
      }
      if (index == -1){
        sorted.addFirst(temp);
        record.next();
        record.add(sorted);
        record.add(unsorted);
      }
      else{
        sorted.insertAfter(temp,sorted.get(index));
        record.next();
        record.add(sorted);
        record.add(unsorted);
      }
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
