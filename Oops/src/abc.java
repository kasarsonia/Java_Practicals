import java.util.*;
import java.io.*;
public class abc {
	
	   public static Hashtable<String, String> dictionary = new Hashtable<String, String>();

	   public static void main(String []args)throws InputMismatchException, IOException{

	      BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("dict.in")));
	      String line = null;
	         while((line = br.readLine())!= null ){
	            String [] words = line.split("\\s+");
	            String kaz = words[0];
	            String eng = words[1];
	            abc.dictionary.put(kaz,eng);
	         }
	      menu();
	   }

	   public static void menu(){

	      //Runtime.getRuntime().exec("clear");

	      System.out.println("1 - Add/Edit/Delete word");
	      System.out.println("2 - Search translation");
	      //System.out.println("3 - Switch language");
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your choice: ");
	      int choose  = sc.nextInt();
	      switch(choose){
	         case 1: secondMenu();
	         break;
	         case 2: searchTranslation();
	         break;
	         //case 3: System.out.print("It works 3 case");
	         //break;
	         default: menu();
	         break;
	      }
	   }

	   public static void secondMenu() throws InputMismatchException{
	      System.out.println("1 - Add");
	      System.out.println("2 - Edit");
	      System.out.println("3 - Delete");
	      System.out.println("4 - Back");
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your choice: ");
	      int choose  = sc.nextInt();
	      switch(choose){
	         case 1: addWord();
	         break;
	         case 2: editWord();
	         break;
	         case 3: deleteWord();
	         break;
	         case 4: menu();
	         break;
	         default: secondMenu();
	         break;
	      }  
	   }
	   public static void addWord(){
	      Scanner w = new Scanner(System.in);
	      System.out.println("Enter word in Kazakh language: ");
	      String kaz  = w.next();
	      System.out.println("Enter word in English language: ");
	      String eng = w.next();
	      abc.dictionary.put(kaz,eng);
	      System.out.println("Sucsess");
	      menu();
	   }

	   public static void editWord(){
	      Scanner w = new Scanner(System.in);
	      System.out.println("Enter word which you want to change: ");
	      String word = w.next();

	      Iterator s = abc.dictionary.keySet().iterator();

	      while (s.hasNext()) {
	      String key = (String) s.next();
	      Object value = abc.dictionary.get(key);

	         if(word==key){
	            System.out.println("Enter new meaning of this word: ");
	            String newWord = w.next();
	            abc.dictionary.remove(key);
	            abc.dictionary.put(word,newWord);
	            menu();
	         }
	         if(word==value){
	            System.out.println("Enter new meaning of this word: ");
	            String newWord = w.next();
	            abc.dictionary.remove(value);
	            abc.dictionary.put(newWord,word);
	            menu();
	         }
	      }

	   }
	   public static void deleteWord(){
	      Scanner w = new Scanner(System.in);
	      System.out.println("Enter word which you want to delete: ");
	      String word = w.next();
	      Iterator s = abc.dictionary.keySet().iterator();

	      while (s.hasNext()) {
	      String key = (String) s.next();
	      Object value = abc.dictionary.get(key);

	         if(word==key){
	            abc.dictionary.remove(key);
	            menu();
	         }
	         if(word==value){
	            abc.dictionary.remove(value);
	            menu();
	         }
	      }

	   }

	   public static void searchTranslation(){
	      Scanner w = new Scanner(System.in);
	      System.out.println("Enter word which you want to translate: ");
	      String word = w.next();
	      Iterator s = abc.dictionary.keySet().iterator();
	      while (s.hasNext()) {
	      String key = (String) s.next();
	      Object value = abc.dictionary.get(key);

	         if(word==key){
	            System.out.println(word+" : "+abc.dictionary.get(value));
	            menu();
	         }
	         if(word==value){
	            System.out.println(word+" : "+abc.dictionary.get(key));
	            menu();
	         }
	      }


	   }
}
