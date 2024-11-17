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
      int index = 0;
      while ((index < sorted.size() - 1) && (temp.compareTo(sorted.get(index)) > 0)){
        index ++;
      }
      sorted.insertBefore(temp,sorted.get(index));
    }
    Card last = sorted.removeLast();
    int lastIndex = 0;
    while ((lastIndex < sorted.size() - 1) && (last.compareTo(sorted.get(lastIndex)) > 0)){
      lastIndex ++;
    }
    sorted.insertBefore(last,sorted.get(lastIndex));
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
