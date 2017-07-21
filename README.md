# Apt464
Pending..
This is a collaborative effort to enhance our coding skills. The main objective of this exercise is to bring coding challenges at more collaborative level and problem solving in group. For all coding challenge related questions and queries will be discussed on slack(invite only).

# Find legal words!
Finds all correct words from matrix of strings.

- Given an input of a list of strings representing a matrix of characters find all the valid words in that matrix. A valid words is a vertical or horizontal sequence of characters that are present in a dictionary   

The dictionary is defined by the following interface:
		
		public interface Dictionary {
	  	   boolean isValidWord(String word);
	    }	

# Sample Input
	   private static final String[] DEFAULT_PUZZLE = new String[] {

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

       "as_Shift_ejdccgabd",

    };
