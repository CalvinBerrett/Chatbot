package chat.model;

import java.util.List;
import java.time.LocalTime;
import java.util.ArrayList;
import chat.model.Movie;

public class Chatbot
{
	private List<Movie> movieList;
	private List<String> shoppingList;
	private List<String> cuteAnimalMemes;
	private String [] verbs;
	private String [] topics;
	private String [] followUps;
	private String [] questions;
	private String username;
	private String content;
	private String intro;
	private LocalTime currentTime;
	
	public Chatbot(String username)
	{
		this.movieList = new ArrayList<Movie>();
		this.shoppingList = new ArrayList<String>();
		this.cuteAnimalMemes = null;
		this.currentTime = null;
		this.questions = new String[4];
		this.username = username;
		this.content = null;
		this.intro = null;
//		this.currentTime = null;
		this.topics = new String[4];
		this.verbs = new String[4];
		this.followUps = null;
		
		buildVerbs();
		buildTopics();
		buildQuestions();
		buildMovieList();
		buildShoppingList();
	}
	//creates list of verbs for chatbot to use
	private void buildVerbs()
	{
		verbs[0] = "like";
		verbs[1] = "dislike";
		verbs[2] = "am ambivalent about";
		verbs[3] = "am thinking about";
	}
	//creates list of topics for chatbot to call from
	private void buildTopics()
	{
		topics[0] = "Parker's love life";
		topics[1] = "Yael's failure as a son";
		topics[2] = "Makai's suicidal thoughts";
		topics[3] = "Yael's inability to get laid";
	}
	
	private void buildMovieList()
	{
		Movie m1 = new Movie("LOTR");
		Movie m2 = new Movie("Star Wars");
		Movie m3 = new Movie("Blade Runner");
		Movie m4 = new Movie("Ferris Bueller's Day Off");
		Movie m5 = new Movie("Nightmare Before Christmas");
		
		movieList.add(m1);
		movieList.add(m2);
		movieList.add(m3);
		movieList.add(m4);
		movieList.add(m5);
	}
	
	private void buildShoppingList()
	{
		shoppingList.add("snacks");
		shoppingList.add("veggies");
		shoppingList.add("slug bait");
		shoppingList.add("gross things");
	}
	
	private void buildCuteAnimals()
	{
		
	}
	
	private void buildQuestions()
	{
		questions[0] = "Will Yael ever find love? (Hint: Answer is 'NO'";
		questions[1] = "Do you think Makai is hot?";
		questions[2] = "Do you believe Parker will inevitably die?";
		questions[3] = "Is life pointless? Is it even worth living?";
	}
	
	public String processConversation(String input)
	{
		String chatbotResponse = "";
		chatbotResponse += "You said:" + "\n" + input + "\n";
		chatbotResponse += buildChatbotResponse();
		return chatbotResponse;
	}
	
	private String buildChatbotResponse()
	{
		String response = "I ";
		int random = (int) (Math.random() * verbs.length); //calls a random verb from list of verbs
		response += verbs[random];
		
		random = (int) (Math.random() * topics.length); //calls random topic from list of topics
		response += " " + topics[random] + ".\n";
		
		random = (int) (Math.random() * questions.length); //calls random question
		response += questions[random];
		
		return response;
	}
	public boolean lengthChecker(String input)
	{
		boolean validLength = false;
		
		if (input != null && input.length() > 1)  //checks to see if the length of the user's response is greater than 1, if not, it stops program
		{
			validLength = true;
		}
		else
		{
			validLength = false;
		}
		return validLength;
	}
	
	public boolean htmlTagChecker(String input)
	{
		return false;
	}
	
	public boolean userNameChecker(String input)
	{
		return false;
	}
	
	public boolean contentChecker(String contentCheck)
	{
		return false;
	}
	
	public boolean cuteAnimalMemeChecker(String input)
	{
		return false;
	}
	
	public boolean shoppingListChecker(String shoppingItem)
	{
		return false;
	}
	
	public boolean movieTitleChecker(String title)
	{
		return false;
	}
	
	public boolean movieGenreChecker(String genre)
	{
		return false;
	}

	public boolean quitChecker(String exitString)
	{
		if (exitString.equalsIgnoreCase("quit"))
		{
			return true;
		}
		return false;
	}

	public boolean keyboardMashChecker(String sample)
	{
		if (sample.equals("sdf") || sample.equals("SDF") || sample.equals("dfg") || sample.equals("cvb") || sample.equals(",./") || sample.equals("kjh") || sample.equals("DFG") || sample.equals("CVB") || sample.equals("KJH"))
		{
			return true;
		}
		
		return false;
	}
	
	public List<Movie> getMovieList()
	{
		return movieList;
	}
	
	public List<String> getShoppingList()
	{
		return shoppingList;
	}
	
	public List<String> getCuteAnimalMemes()
	{
		return cuteAnimalMemes;
	}

	public String [] getQuestions()
	{
		return null;
	}
	
	public String[] getVerbs()
	{
		return verbs;
	}

	public String[] getTopics()
	{
		return topics;
	}

	public String[] getFollowUps()
	{
		return followUps;
	}

	public String getUsername()
	{
		return username;
	}
	
	public String getContent()
	{
		return content;
	}

	public String getIntro()
	{
		return null;
	}
	
	public LocalTime getCurrentTime()
	{
		return null;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
}
