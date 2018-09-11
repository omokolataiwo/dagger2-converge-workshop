package com.hxvz.android.daggerthings;

import java.util.List;

import javax.inject.Inject;

public class AsteriskBookFormatter implements BookFormatter {
    @Inject
    AsteriskBookFormatter() {

    }
    public String format(List<Book> bookList) {
        StringBuilder bookString = new StringBuilder();

        for(Book book : bookList) {
            bookString.append(book.getTitle());
            bookString.append("\n**********************\n");
        }
        return bookString.toString();
    }
}
