import java.util.ArrayList;
public class SingSong
	{
		static int longestIndex;
		static int longest;
		static int ten;
		static ArrayList <Song> lyrics = new ArrayList<Song>();
		public static void main(String[] args)
			{
				fillArray();
				printList();
			}
		public static void fillArray()
		{
				lyrics.add (new Song ("American Money ", "Borns ", 224));
				lyrics.add (new Song("Yours ", "SG Lewis ", 231));
				lyrics.add (new Song("Favorite Song ", "Chance The Rapper ", 186));
				lyrics.add (new Song("Meet Me ", "Micky Valen ", 193));
				lyrics.add (new Song("Low Life ", "Luca Lush ", 144));
		}		
			
		public static void printList()
		{
			for (int i = 0; i < lyrics.size(); i++)
				{
					System.out.println(lyrics.get(i).getTitle() +"by " + lyrics.get(i).getArtist() + lyrics.get(i).getSeconds());
				}
			System.out.println();
			for (int i = 0; i < lyrics.size(); i++)
				{
					ten = lyrics.get(i).getSeconds()-10;
					lyrics.get(i).setSeconds(ten);
					System.out.println(lyrics.get(i).getTitle() +"by " + lyrics.get(i).getArtist() + ten);
				}
			longest = lyrics.get(0).getTitle().length();
			int lyricsSize = lyrics.size();
			for (int i = 0; i < lyricsSize; i++)
				{		
					if (lyrics.get(i).getTitle().length() > longest)
						{
						longestIndex = i;
						}
					else 
						{
						
						}
				}
			System.out.println(longestIndex);
			lyrics.remove(longestIndex);
			for (int i = 0; i < lyrics.size(); i++)
				{
					System.out.println(lyrics.get(i).getTitle() +"by " + lyrics.get(i).getArtist() + lyrics.get(i).getSeconds());	
				}
			System.out.println();
			
			lyrics.get(0).setArtist("Bo Kulbacki ");
			for (int i = 0; i < lyrics.size(); i++)
				{
					System.out.println(lyrics.get(i).getTitle() +"by " + lyrics.get(i).getArtist() + lyrics.get(i).getSeconds());	
				}
			
			
			
			
		}
		
	}
