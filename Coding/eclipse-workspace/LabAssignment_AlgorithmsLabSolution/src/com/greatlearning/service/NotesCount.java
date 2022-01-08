package com.greatlearning.service;

public class NotesCount {

	public void notesCountImplementation(int[] notes, int amount) {

		int remainingAmount = amount;
		int[] noteCounter = new int[notes.length];
		
		try {
			for(int i=0; i<notes.length; i++) {
				
				//avoid divide-by-zero error
				if(notes[i] == 0) throw new ArithmeticException("Currency Denominations cannot be zero!");
				
				if(notes[i] <= remainingAmount) {
					int N = remainingAmount/notes[i];
					remainingAmount -= N*notes[i];
					noteCounter[i] += N;
	
					if(remainingAmount <= 0) {
	
						if(remainingAmount == 0) {
							System.out.println("Your payment approach in order to give min no of notes will be");
							
							for(int j=0; j<notes.length;j++) {
								
								if(noteCounter[j] > 0) {
									System.out.println(notes[j] + ":" + noteCounter[j]);
								}
							}
							
							return;
						}else {
							System.out.println("Given Amount cannot be paid using the Currency denominations provided");
						}
					}
				}
			}
		}catch(ArithmeticException ex) {
			
			System.out.println(ex.getMessage());
		}
	}

}
