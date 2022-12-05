import java.util.Scanner;

public class mathProblem {
	
	public static char[] deleteIndex(char[] arr, int index) {
		
        char[] arr2 = new char[arr.length - 1];
       
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
 
            if (i == index) {
                continue;
            }
            
            arr2[k++] = arr[i];
        }
 
  
        return arr2;
		
	}
	
	public static int calcResult(int[] counterArr, int size) {
		
		
		int sizeFactoriel = 1;
		for(int i = 1; i <= size; i++) {
			sizeFactoriel = sizeFactoriel*i;
		}
		
		int count = 0;
		int sameFactoriel = 1;
		while(count <= counterArr.length) {
			
			if(counterArr[count] == 0) {
				break;
			}
			for(int j = 1; j <= counterArr[count]; j++) {
				sameFactoriel = sameFactoriel*j;
			}
			count++;
		}
		
		int res = sizeFactoriel / sameFactoriel;
		
		
		return res;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("When you entered a word the program will show the number of different words with the letters in your word.");
		System.out.print("Enter the word: ");
		String word = sc.next();
		int size = word.length();
		
		char[] wordArr = new char[word.length()];
		
		for(int i = 0; i < word.length(); i++) {
			wordArr[i] = word.charAt(i);
		}
		
		int[] counter = new int[wordArr.length];
		for(int i = 0; i < counter.length; i++) {
			counter[i] = 0;
		}
		
		
		int counterIndex = 0;
		int i = 0;
		
		while(i == 0) {
			int j = 0;
			char temp = wordArr[i];
			
			while(j < wordArr.length) {
				
				if(temp == wordArr[j]) {
					counter[counterIndex]++;
					wordArr = deleteIndex(wordArr, j);
					j = 0;
				}
				else {
					j++;
				}
				
				
			}
			
			if(wordArr.length == 0) {
				break;
			}
			counterIndex++;
			
		}
		
		int result = calcResult(counter, size);
		
		System.out.println("There are " + result + " different way to genereta a word with the letters in "+ "'" + word + "'");
		
		 	
		
		sc.close();
	}

}
