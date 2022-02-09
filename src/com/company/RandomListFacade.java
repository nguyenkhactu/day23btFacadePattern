package com.company;

import java.util.List;

public class RandomListFacade {
    private RandomList randomList;
    private ListFilter listFilter;
    private ListPrinter listPrinter;

    public RandomListFacade(RandomList randomList, ListFilter listFilter, ListPrinter listPrinter) {
        this.randomList = randomList;
        this.listFilter = listFilter;
        this.listPrinter = listPrinter;
    }
    public void printRandomEvenList(){
       List<Integer> newNumber = randomList.generateList(10,10,90);
        List<Integer> newLists = listFilter.filterOdd(newNumber);
        listPrinter.printList(newLists);
    }
}
