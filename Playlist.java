import java.util.ArrayList;
 
class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("mere ghar ram aye");
    desertIslandPlaylist.add("Humare Sath Shri Raghunath");
    desertIslandPlaylist.add("Ram Siya Ram Siya Ram Jai Jai");
    desertIslandPlaylist.add("mere kanha");
    desertIslandPlaylist.add("Laagi Lagan Shankara Full Song");
 System.out.println(desertIslandPlaylist.toString());
System.out.println(desertIslandPlaylist.size());// befor remove size
desertIslandPlaylist.remove("Humare Sath Shri Raghunath");
        // after remove size
System.out.println(desertIslandPlaylist.toString());
System.out.println(desertIslandPlaylist.size());
int  indexA = desertIslandPlaylist.indexOf("mere kanha");
int indexB = desertIslandPlaylist.indexOf("Laagi Lagan Shankara Full Song");

      String tempA = "mere kanha" ;// indexA vale

desertIslandPlaylist.set(indexA ,"Laagi Lagan Shankara Full Song");
desertIslandPlaylist.set(indexB,tempA);
System.out.println(desertIslandPlaylist);
  }
  
}