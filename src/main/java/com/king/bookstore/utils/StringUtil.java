package com.king.bookstore.utils;

import static java.lang.Math.random;

public class StringUtil {

    public static int getBookCode() {
        return (int)(random()*1000000+1);
    }
}
