package com.android.example.wordlistsql;

import android.database.Cursor;
import android.util.Log;

import static com.android.example.wordlistsql.WordListOpenHelper.KEY_WORD;

/**
 * Created by acer on 04/12/2017.
 */

public class WordItem {
    private int mId;
    private String mWord;
    public WordItem() {}
    public int getId() {return this.mId;}
    public String getWord() {return this.mWord;}
    public void setId(int id) {this.mId = id;}
    public void setWord(String word) {this.mWord = word;}
}
