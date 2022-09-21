/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Hand implements  Comparable<Hand> {
    private ArrayList<Card> cards;
    public Hand(){
        cards=new ArrayList<>();
    }
    public void add(Card card){
        cards.add(card);
    }
    public void print (){
        Iterator<Card> iterator = cards.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public List<Card> getCards() {
        return cards;
    }
    public void sort(){
        List <Card> cardList = cards.stream().sorted().collect(Collectors.toList());
        cards.removeAll(cards);
        cards.addAll(cardList);
    }
    public int compareTo(Hand comparable){
        int hand1sum= cards.stream().mapToInt(var->var.getValue()).sum();
        int hand2sum=comparable.cards.stream().mapToInt(var->var.getValue()).sum();
        if (hand1sum==hand2sum){
            return 0;
        } else if (hand1sum>hand2sum) {
            return 1;
        }else {
            return -1;
        }
    }
    public void sortBySuit() {
        Collections.sort(this.cards, new BySuitInValueOrder());
    }

}