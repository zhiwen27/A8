import java.util.ArrayDeque;

public class MergeSortTimer {
  
  /**
   * Merge Sort
   * @param unsorted unsorted list
   * @return sorted list
   */
  public static CardPile sort(CardPile unsorted) {
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
    }
    return queue.remove();
  }

  public static void main(String args[]) {
    if (args.length<1) {
      System.err.println("Please specify how many cards to sort!");
    } else {
      Card[] deck = Card.newDeck(true);
      CardPile cards = new CardPile();
      for (int i = 0; i < Integer.parseInt(args[0]); i ++) {
        cards.add(deck[(int)(52*Math.random())]);
      }
      sort(cards); 
    }
  }
}