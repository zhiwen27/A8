public class InsertionSortTimer {
  /**
   * Insertion Sort
   * @param unsorted unsorted list
   * @return sorted list
   */
  public static CardPile sort(CardPile unsorted) {

    CardPile sorted = new CardPile();
    sorted.add(unsorted.removeFirst());
  
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
    }
    return sorted;
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
