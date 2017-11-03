package chat.controller;

import chat.model.Chatbot;
import chat.view.PopupDisplay;
import chat.view.ChatFrame;
import chat.view.ChatPanel;

public class Controller
{
	private Chatbot chatbot;
	private PopupDisplay display;
	private ChatFrame appFrame;
	
	public Controller()
	{
		chatbot = new Chatbot("Ya boi");
		display= new PopupDisplay();
	}
	public void start()
	{
		String response = display.collectResponse("Ayyye Sup Bruh? Wha chu wanna have an intellectual and meaningful conversation about on this lovely day?");
		while (chatbot.lengthChecker(response) && !chatbot.quitChecker(response))
		{
			response = popupChat(response);
			response = display.collectResponse(response);
			
		}
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
}
