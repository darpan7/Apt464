package com.apt464.project.ds;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.print.attribute.standard.DialogTypeSelection;

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
		char[][] matrix = new char[puzzle.length][];
		
		convertToMatrix(matrix, puzzle);
		for(int i=0; i<puzzle.length; i++){
			
		}
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
	
	/**
	 * Converts String[] into char[][] matrix.
	 * @param matrix
	 * @param puzzle
	 */
	static void convertToMatrix(char[][] matrix, String[] puzzle){
		int i = 0;
		for(String word: puzzle){
			matrix[i++] = word.toCharArray();
		}
	}
	/**
	 * DFS version 2
	 * @param matrix
	 * @return
	 */
	static Set<String> result = new HashSet<String>(); 
	public static Set<String> findWords(char[][] matrix, List<String> dictWords) {
		/**
		 * first designing Trie dictionary
		 */
		
		Dictionary trieDict = new DictionaryImpl();
		for(String word : dictWords)  {
			trieDict.insert(word);
		}
		
		int m = matrix.length;
		int n = matrix[0].length;

		boolean[][] visited = new boolean[m][n];
		
		for(int i=0;i<m;i++)  {
			for(int j=0;j<n;j++)  {
				dfs(matrix, visited, "", i, j , trieDict);
			}
		}
		
		
		
		return result;
	}

	private static void dfs(char[][] matrix, boolean[][] visited, String str, int i, int j, Dictionary trieDict) {
		int m = matrix.length;
		int n = matrix[0].length;
		
		if(i<0 || j<0 || i>=m || j>=n)  {
			return;
		}
		
		if(visited[i][j])  {
			return;
		}
		
		str = str + matrix[i][j];
		
		if(!trieDict.startsWith(str))  {
			return;
		}
		
		if(trieDict.isValidWord(str))  {
			result.add(str);
		}
		
		visited[i][j] = true;
		dfs(matrix, visited, str, i-1, j, trieDict);
		dfs(matrix, visited, str, i+1, j, trieDict);
		dfs(matrix, visited, str, i, j-1, trieDict);
		dfs(matrix, visited, str, i, j+1, trieDict);
		visited[i][j]=false;
	}
}
