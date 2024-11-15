import java.util.Collections;

public class SelectionSort {
  
  public static CardPile sort(CardPile unsorted, SortRecorder record) {
    // register the starting configuration with the recorder
    record.add(unsorted);
    // Here is the result list you will be creating
    CardPile sorted = new CardPile();
    int placeHolder = 0;
    while (unsorted.size() > 0){
      for (int i = 0; i < unsorted.size() - 1; i++){
        placeHolder = i;
        for (int j = i + 1; j < unsorted.size() - 1; j++){
          if (unsorted.get(j).compareTo(unsorted.get(j + 1)) > 0){
            placeHolder = j;
          }
        }
      }
      Card temp = unsorted.get(placeHolder);
      unsorted.remove(placeHolder);
      sorted.add(temp);
      record.next(); // tell it this is a new step
      record.add(sorted); // the allegedly sorted pile
      record.add(unsorted); // the unsorted pile
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
    cards = SelectionSort.sort(cards, recorder);

    // We can print out the (un)sorted result:
    System.out.println(cards);

    // make window appear showing the record
    recorder.display("Card Sort Demo: SelectionSort");
  }
}
