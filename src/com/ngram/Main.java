package com.ngram;

public class Main {

  public static void main(String[] args) {

    NgramFinder ngramFinder = new NgramFinder();
    String threeGram = ngramFinder.mostFrequentNgram("catdogcat", 3);
    System.out.println(threeGram +" Should be cat ");
    String twoGram = ngramFinder.mostFrequentNgram("engineering", 2);
    System.out.println(twoGram + " Should be ng");
    String oneGram = ngramFinder.mostFrequentNgram("beetle", 1);
    System.out.println(oneGram + " Should be e");
  }
}
