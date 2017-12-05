package com.ngram;

import java.util.HashMap;

public class NgramFinder {


  public final String mostFrequentNgram(String input, int ngramSize) {

    if(!input.equals("")) {
      HashMap<String, Integer> ngramCounts = new HashMap<String, Integer>();
      // possible to store last max count ngrams;
      int maxNgramOccurance = 0;
      String maxNgramSeen = "";
      // ensures we only loop on valid ngrams
      for(int i = 0; i <= input.length() - ngramSize; i++){

          String ngram = input.substring(i, (i + (ngramSize)));
          if (ngramCounts.get(ngram) != null) {
            int count = ngramCounts.get(ngram);
            ngramCounts.put(ngram, count + 1);
            if (count >= maxNgramOccurance) {
              maxNgramSeen = ngram;
              maxNgramOccurance = count;
            }

          } else {
            ngramCounts.put(ngram, 1);
            if (maxNgramOccurance == 0) {
              maxNgramSeen = ngram;
              maxNgramOccurance = 1;
            }}
      }

      return maxNgramSeen;
    }
    throw new RuntimeException("invalid input passed, empty string is not allowed");
  }
}
