package com.amit.test;

import java.util.ArrayList;
import java.util.List;

public class WordPermutations {

	public static void main(String[] args) {
		System.out.println("Hello");
		String str = "abc";
		List<String> wordList = new ArrayList<String>();
		wordList = buildWords(str.toCharArray(), 0, str.length(),new char[str.length()], wordList);
		System.out.println(wordList);
	}
	
	private static List<String> buildWords(char[] chars, int pos,int len,char[] word, List<String> wordList){
		if(pos==len) {
			wordList.add(new String(word));
			return wordList;
		}
		for(int i=0; i<len; i++) {
			word[pos]=chars[i];
			buildWords(chars, pos+1, len, word, wordList);
		}
		return wordList;
	}

}
