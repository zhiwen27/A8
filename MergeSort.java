import java.util.ArrayDeque;
import java.util.Collections;

public class MergeSort {
  
  public static CardPile sort(CardPile unsorted, SortRecorder record) {
    
    ArrayDeque<CardPile> queue = new ArrayDeque<CardPile>();
    while(unsorted.size() > 0){
      CardPile temp = new CardPile();
      temp.add(unsorted.removeFirst());
      queue.add(temp);
    }
    CardPile A = new CardPile();
    CardPile B = new CardPile();
    CardPile C = new CardPile();
    while (queue.size() > 1){
      A = queue.removeFirst();
      B = queue.removeFirst();
      while ((A.size() > 0) || (B.size() > 0)){
        if (A.get(0).compareTo(B.get(0)) > 0){
          C.add(A.removeFirst());
        }
        else{
          C.add(B.removeFirst());
        }
      }
      if (A.size() > 0){
        C.append(A);
      }
      else if (B.size() > 0){
        C.append(B);
      }
      record.next();        // tell it this is a new step
      for (CardPile pile: queue) { // add all piles
        record.add(pile);
      }
      queue.add(C);
    }
  
    // ***********************************************************
    // Here is where you'll do the "work" of MergeSort:
    //   - Use queue to store the intermediate piles
    //   - Don't forget to register the new state with the
    //     recorder after each merge step:
    //        record.next();        // tell it this is a new step
    //        for (CardPile pile: queue) { // add all piles
    //           record.add(pile);
    //        }
    // ***********************************************************

    return queue.remove();
  }

  /*
- Begin by placing each element of `unsorted` into its own new singleton `CardPile` and add all those piles to a queue.
- While more than one list remains on the queue:
  - Remove the first two lists from the queue and merge them, preserving their sorted order.
  - Put the result back at the end of the queue.
 */

  public static void main(String args[]) {

    // set up a class to record and display the sorting results
    SortRecorder recorder = new SortRecorder();

    // set up the deck of cards
    Card.loadImages(recorder);
    CardPile cards = new CardPile(Card.newDeck(true), 2, 2);

    // mix up the cards
    Collections.shuffle(cards);

    // in your program, this would be a call to a real sorting algorithm
    cards = MergeSort.sort(cards, recorder);

    // We can print out the (un)sorted result:
    System.out.println(cards);

    // make window appear showing the record
    recorder.display("Card Sort Demo: MergeSort");
  }
}