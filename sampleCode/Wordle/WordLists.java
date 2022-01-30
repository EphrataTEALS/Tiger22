import java.util.ArrayList;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordLists {


   public static final String DIRECTORY = "/workspaces/Tiger22/studentWork/Wordle/";

   //////////////////////////////////////////////////////////////////////
   /*                                                                  */
   /*                                                                  */
   /*                                                                  */
   /*                                                                  */
   /*                                                                  */
   /*                   DO NOT MODIFY BELOW THIS BOX                   */
   /*                                                                  */
   /*                                                                  */
   /*                                                                  */
   /*                                                                  */
   /*                                                                  */
   //////////////////////////////////////////////////////////////////////

   public static final ArrayList<String> WORDS = new ArrayList<String>();
   public static final ArrayList<String> TARGETS = new ArrayList<String>();
   
   public static void loadFile(ArrayList<String> list, String filepath) {
      // System.out.println("Working Directory = " + System.getProperty("user.dir"));
      BufferedReader reader;
      try {
         reader = new BufferedReader(new FileReader(filepath));
         String line = reader.readLine();
         while (line != null) {
            list.add(line);
            line = reader.readLine();
         }
         reader.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
      Collections.sort(list);
   }
   
   static {
      loadFile(WORDS, DIRECTORY + "words.txt");
      loadFile(TARGETS, DIRECTORY + "targets.txt");
   }
}
