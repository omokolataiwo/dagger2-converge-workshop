package com.hxvz.android.daggerthings;

import java.util.ArrayList;
import java.util.List;

class Knowledge {
    private ArrayList<Book> books = new ArrayList<Book>();
    private BookFormatter formatter;

    Knowledge(BookFormatter formatter) {
        this.formatter = formatter;
    }

    void learn(Book book){
        books.add(book);
    }

    String getSkillSet() {
        return formatter.format(books);
    }
}
