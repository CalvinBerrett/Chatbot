package chat.controller;

import chat.view.PopupDisplay;

public class Runner
{
	public static void main(String []args)
	{
		PopupDisplay test = new PopupDisplay();
		test.displayText("KILL ALL HUMANS!!");
		test.collectResponse("Ask a question");
		
	}
}
