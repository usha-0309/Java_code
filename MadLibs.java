public class MadLibs {
  /*
  Your description here
  This program generates a mad libbed story.
Author: Laura
Date: 2/19/2049
  */
  	public static void main(String[] args){
      String name1 = "Neha";
      String adjective1 = "Good";
      String adjective2 = " very Nice";
      String adjective3 = "Happy";
      String verb1 = "Dance";
      String noun1 = "People";
       String noun2 = "Food";
       String noun3 = "Music";
       String noun4 = "Kids";
       String noun5 = "Peas";
       String noun6 = "Democrats";
       String name2 = "Bharti";
       int number = 40;
       String place1 = "pune";
      //The template for the story
      String story = "This morning "+name1+" 
      woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' 
      Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. 
      They began to "+verb1+" to the rhythm of the "+noun3+", 
      which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+",
       who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+
       " woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";
      System.out.println(story);
    }       
}
