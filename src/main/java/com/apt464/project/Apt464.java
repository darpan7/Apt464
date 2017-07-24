/**
 * Created by Darpan Shah Jul 20, 2017
 */ 
package com.apt464.project;

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
		Set<String> validWords = DFS.findValidWords(puzzle);
		System.out.println(validWords);
	}

}
