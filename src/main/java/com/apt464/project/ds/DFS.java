package com.apt464.project.ds;

import java.util.HashSet;
import java.util.Set;

import com.apt464.project.service.Dictionary;
import com.apt464.project.service.Impl.DictionaryImpl;

/**
 * 
 * @author DARPAN
 *
 */
public class DFS {
	private static Dictionary dictionary = new DictionaryImpl();
	public static Set<String> findValidWords(String[] puzzle){
		Set<String> words = new HashSet<String>();
		
		// Horizontal words finding.
		for(String s: puzzle) {
			for(int i=0; i<s.length()-1; i++) {
				for(int j=(i+1); j<s.length(); j++) {
					String word = s.substring(i, (j+1));
					if(dictionary.isValidWord(word)) {
						words.add(word);
					}
				}
			}
		}
		
		// Vertical words finding.
		
		
		return words;
	}
}
