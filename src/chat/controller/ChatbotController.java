package chat.controller;

import chat.model.Chatbot;
import chat.view.PopupDisplay;
import chat.view.ChatFrame;
import chat.view.ChatPanel;

public class ChatbotController
{
	private Chatbot chatbot;
	private PopupDisplay display;
	private ChatFrame appFrame;
	public ChatbotController()
	{
		chatbot = new Chatbot("Ya boi");
		display = new PopupDisplay();
		appFrame = new ChatFrame(this);
	}
	public void start()
	{
		String results = IOController.loadFromFile(this, "commonWords.txt");
		IOController.saveToFile(this, results, "Save results.txt");
//		display.displayText("Ayyye Sup Bruh? Wha chu wanna have an intellectual and meaningful conversation about on this lovely evening?");
//		String response = display.collectResponse("Ayyye Sup Bruh? Wha chu wanna have an intellectual and meaningful conversation about on this lovely day?");
//		while (chatbot.lengthChecker(response) && !chatbot.quitChecker(response))  // checks to see if the response is long enough and not "quit" if not then the chatbot continues to respond
//		{
//			response = popupChat(response);
//			response = display.collectResponse(response);
//			
//		}
	}
	/**
	 * 
	 * @param input must be a String
	 * @return returns null at the moment
	 */
	public String interactWithChatbot(String input)
	{
		String chatbotSays = "";
		
		if(chatbot.quitChecker(input))
		{
			close();
		}
		
		chatbotSays += chatbot.processConversation(input);
		
		return chatbotSays;
	}
	
	public String useCheckers(String text)
	{
		String response = "";
		
		if(chatbot.contentChecker(text))
		{
			response += "This text matches the special content\n";
		}
		if(chatbot.cuteAnimalMemeChecker(text))
		{
			response +="";
		}
		return response;
	}
	
	public void handleErrors(Exception error)
	{
		display.displayText(error.getMessage());
	}
	
	private void close()
	{
		display.displayText("See ya later alligator");
		System.exit(0);
	}
	/**
	 * This method creates the chatbot's responses
	 * @param chat response must be a String of type chat
	 * @return returns the chatbot's full response
	 */
	private String popupChat(String chat)
	{
		String chatbotSays = "";
		chatbotSays += chatbot.processConversation(chat);
		return chatbotSays;
	}
	/**
	 * This is a getter for Chatbot
	 * @return returns chatbot
	 */
	public Chatbot getChatbot()
	{
		return chatbot;
	}
	/**
	 * Getter for Display
	 * @return returns display
	 */
	public PopupDisplay getDisplay()
	{
		return display;
	}
	/**
	 * Getter for ChatFrame
	 * @return returns appFrame
	 */
	public ChatFrame getChatFrame()
	{
		return appFrame;
	}
	
	public void HandleError(exception error)
	{
		popup.displayText(error.setMessage());
	}
	
	public void tweet(String text)
	{
		myTwitter.sendTweet(text);
	}
}
