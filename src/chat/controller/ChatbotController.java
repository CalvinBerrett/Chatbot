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
//		String response = display.collectResponse("Ayyye Sup Bruh? Wha chu wanna have an intellectual and meaningful conversation about on this lovely day?");
//		while (chatbot.lengthChecker(response) && !chatbot.quitChecker(response))  // checks to see if the response is long enough and not "quit" if not then the chatbot continues to respond
//		{
//			response = popupChat(response);
//			response = display.collectResponse(response);
//			
//		}
	}
	
	public String interactWithChatbot(String input)
	{
		return null;
	}
	
	private String popupChat(String chat)
	{
		String chatbotSays = "";
		chatbotSays += chatbot.processConversation(chat);
		return chatbotSays;
	}
	
	public Chatbot getChatbot()
	{
		return chatbot;
	}
	
	public PopupDisplay getDisplay()
	{
		return display;
	}
	
	public ChatFrame getChatFrame()
	{
		return appFrame;
	}
}
