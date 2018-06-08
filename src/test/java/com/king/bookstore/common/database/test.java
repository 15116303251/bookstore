package com.king.bookstore.common.database;

import com.king.bookstore.common.variable.BookToTableEnum;

public class test {
    public static void main(String args[]){
        System.out.println(BookToTableEnum.getTable("研究生/本科/专科教材"));
    }
}
