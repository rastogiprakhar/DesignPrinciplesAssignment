package com.prakhar.LSP;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Member> myList = new ArrayList<Member>();

        myList.add(new LifetimeMember("Prakhar  ",new Date()));
        myList.add(new AnnualMember("Rastogi",new Date()));
        myList.add(new EnquiryUser("Knolder"));
        for (Member c: myList){
            c.addToDatabase();
        }
    }

}
