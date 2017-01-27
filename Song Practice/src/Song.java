
public class Song
	{
		private String title;
		private String artist;
		private int seconds;
		
		public Song (String t, String a, int s)
		{
			title=t;
			artist=a;
			seconds=s;
		}
	

		public String getTitle()
			{
				return title;
			}

		public void setTitle(String title)
			{
				this.title = title;
			}

		public String getArtist()
			{
				return artist;
			}

		public void setArtist(String artist)
			{
				this.artist = artist;
			}

		public int getSeconds()
			{
				return seconds;
			}

		public void setSeconds(int seconds)
			{
				this.seconds = seconds;
			}
	}