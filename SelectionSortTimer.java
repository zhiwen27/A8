public class SelectionSortTimer {
  
  /**
   * Selection Sort
   * @param unsorted unsorted list
   * @return sorted list
   */
  public static CardPile sort(CardPile unsorted) {
    CardPile sorted = new CardPile();
    while (unsorted.size() > 0){
      Card min = unsorted.getFirst();
      for (Card c: unsorted){
        if (min.compareTo(c) > 0){
          min = c;
        }
      }
      unsorted.remove(min);
      sorted.add(min);
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
