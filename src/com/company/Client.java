package com.company;

public class Client {
    public void findNumber(){
        RandomListFacade randomListFacade = new RandomListFacade(new RandomList(),new ListFilter(),new ListPrinter());
        randomListFacade.printRandomEvenList();
    }
}
