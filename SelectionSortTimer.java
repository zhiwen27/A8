public class SelectionSortTimer {
  
  public static CardPile sort(CardPile unsorted) {
    CardPile sorted = new CardPile();
    while (unsorted.size() > 0){
      Card min = unsorted.getFirst();
      for (int i = 0; i < unsorted.size(); i++){
        if (min.compareTo(unsorted.get(i)) > 0){
          min = unsorted.get(i);
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
