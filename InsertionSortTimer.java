public class InsertionSortTimer {
  
  public static CardPile sort(CardPile unsorted) {

    CardPile sorted = new CardPile();
    sorted.add(unsorted.removeFirst());
  
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
      }
      else{
        sorted.insertAfter(temp,sorted.get(index));
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
