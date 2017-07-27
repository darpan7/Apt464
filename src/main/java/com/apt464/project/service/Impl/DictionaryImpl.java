package com.apt464.project.service.Impl;

import com.apt464.project.service.Dictionary;

/**
 * 
 * @author DARPAN
 *
 */
public class DictionaryImpl implements Dictionary{

	/**
	 * For this implementation I am assuming that words are coming in list
	 * I will generate a Trie tree for managing all possible words.
	 * This Utility will have functionality of insert, search (isValidWord), startsWith
	 */
	
	
	
	
	public TrieNode root = new TrieNode();
	
	public void insert(String word)  {
		TrieNode node = root;
		for(char c : word.toCharArray())  {
			if(node.children[c-'a'] == null)  {
				node.children[c-'a'] = new TrieNode();
			}
			node = node.children[c-'a'];
		}
		node.item = word;
	}
	
	public boolean isValidWord(String word) {
		TrieNode node = root;
		for(char c : word.toCharArray())  {
			if(node.children[c-'a'] == null)  {
				return false;
			}
			node = node.children[c-'a'];
		}
		if(node.item.equals(word))  {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean startsWith(String prefix)  {
		TrieNode node = root;
		for(char c:prefix.toCharArray())  {
			if(node.children[c-'a'] == null)  {
				return false;
			}
			node= node.children[c-'a'];
		}
		return true;
	}
}

class TrieNode  {
	public TrieNode[] children = new TrieNode[26];
	public String item = "";
}
