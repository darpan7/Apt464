/**
 * Created by Darpan Shah Jul 20, 2017
 * last updated by Parth Jul 27, 2017
 */ 
package com.apt464.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.apt464.project.ds.DFS;

public class Apt464 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final String[] puzzle = new String[] { 
				"akjbvaijdsbv_d_dbv", 
				"fjslkdfadsna_T_lfa", 
				"asdfasdfsdfa_r_ads",
				"ckvsadfgfgjava_ajd", 
				"akjbvaijdsbv_d_dbv", 
				"cbvqiejdbfqi_e_qib", 
				"asdjnaquekjdwdfabd",
				"asdk_word_kgrtuabd", 
				"asdjnaquekjfghbdbd", 
				"asewdfldfjdsfewrkf", 
				"as_Shift_ejdccgabd"
		};
//		Set<String> validWords = DFS.findValidWords(puzzle);
//		System.out.println(validWords);
		
		/**
		 * Version 2
		 */
		
		System.out.println("Below is another version of WordSearch:");
		System.out.println("Converting puzzle string in character matrix");
		
		/**
		 * The puzzle pattern is in the matrix[11][18] form.
		 * Limitations: it can only detect lower case character
		 * I have replaced '_' by 'x' for simplicity
		 * 
		 */
		long start = System.currentTimeMillis();
		final String[] puzzle2 = new String[] { 
				"akjbdvaijdsbvxdxdbv", 
				"fjslakdfadsnaxtxlfa", 
				"asdfrasdfsdfaxrxads",
				"ckvspadfgfgjavaxajd", 
				"akjbavaijdsbvxdxdbv", 
				"cbvqniejdbfqixexqib", 
				"asdjnaquekjpdwdfabd",
				"asdkxwordxkagrtuabd", 
				"asdjnaquekjrfghbdbd", 
				"asewdfldfjdtsfewrkf", 
				"asxshiftxejhdccgabd"
		};
		List<String> dictWords = new ArrayList<String>();
		dictWords.add("as");
		dictWords.add("word");
		dictWords.add("shift");
		dictWords.add("java");
		dictWords.add("doremon");
		dictWords.add("darpan");
		dictWords.add("parth");
		char[][] matrix = convertStringToMatrix(puzzle2);
		Set<String> result = DFS.findWords(matrix, dictWords);
		System.out.println("\n Time taken: " + ((System.currentTimeMillis()-start)) + " micro sec.");
		System.out.println(result);
		
	}

	private static char[][] convertStringToMatrix(String[] puzzle2) {
		int m = puzzle2.length;
		int n = puzzle2[0].length();
		char[][] matrix = new char[m][n];
		
		for(int i=0;i<m; i++)  {
			char[] charArr = puzzle2[i].toCharArray();
			matrix[i] = charArr;
			/*for(int j=0; j<n; j++)  {
				matrix[i][j] = charArr[j];
			}*/
		}
		return matrix;
	}

}
