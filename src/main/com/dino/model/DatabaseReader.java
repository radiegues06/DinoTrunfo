package com.dino.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class DatabaseReader {

	public static void main(String[] args) {
		
		String CURR_DIR = System.getProperty("user.dir");
		
		readDinoDB(CURR_DIR + "\\src\\resources\\data\\cards.csv");

	}
	
	public static void readDinoDB(String path) {
		
		 try (BufferedReader br = new BufferedReader(new FileReader(path))) {
	
	            String line = "";
	            HashMap<String, Card> deck = new HashMap<String, Card>();
	            
	            br.readLine(); // Skipping header
	            
				while ((line  = br.readLine()) != null) {
					
	                Card card = new Card(line);
	                
	                deck.put(card.getName(), card);
	                
	            }			
	
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
	
}
