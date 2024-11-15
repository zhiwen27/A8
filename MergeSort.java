import java.util.ArrayDeque;
import java.util.Collections;

public class MergeSort {
  
  public static CardPile sort(CardPile unsorted, SortRecorder record) {
    record.add(unsorted);
    ArrayDeque<CardPile> queue = new ArrayDeque<CardPile>();
    while(unsorted.size() > 0){
      CardPile temp = new CardPile();
      temp.add(unsorted.remove());
      queue.add(temp);
    }
    while (queue.size() > 1){
      CardPile A = queue.removeFirst();
      CardPile B = queue.removeFirst();
      CardPile C = new CardPile();
      while ((A.size() > 0) && (B.size() > 0)){
        if (A.getFirst().compareTo(B.getFirst()) < 0){
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
      queue.add(C);
      record.next();
      for (CardPile pile: queue) {
        record.add(pile);
      }
    }
    return queue.remove();
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
    cards = MergeSort.sort(cards, recorder);

    // We can print out the (un)sorted result:
    System.out.println(cards);

    // make window appear showing the record
    recorder.display("Card Sort Demo: MergeSort");
  }
}