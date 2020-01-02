package com.bdqn.entity;

/**
 * 单词题库表
 */
public class Word {

    private int wordId; //单词序号
    private  String wordmeaning;//汉语意思
    private  String word;//单词

    public int getWordId() {
        return wordId;
    }

    public void setWordId(int wordId) {
        this.wordId = wordId;
    }

    public String getWordmeaning() {
        return wordmeaning;
    }

    public void setWordmeaning(String wordmeaning) {
        this.wordmeaning = wordmeaning;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }




}
