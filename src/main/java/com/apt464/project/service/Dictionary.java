package com.apt464.project.service;

public interface Dictionary {
	void insert(String word);
	boolean isValidWord(String word);
	boolean startsWith(String word);
}
