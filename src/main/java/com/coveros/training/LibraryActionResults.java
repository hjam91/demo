package com.coveros.training;

public enum LibraryActionResults {
    ALREADY_REGISTERED_BOOK,
    ALREADY_REGISTERED_BORROWER,
    BOOK_NOT_REGISTERED,
    BORROWER_NOT_REGISTERED,
    BOOK_CHECKED_OUT, // someone already has this book checked out.
    SUCCESS
}
