package chat.view;
import chat.controller.ChatbotController;
import chat.view.ChatPanel;
import javax.swing.JFrame;

public class ChatFrame extends JFrame
{
	private ChatbotController appController;
	private ChatPanel appPanel;
	/**
	 * This initializes ChatPanel and calls setupFrame and connects the appController variable from JFrame to the appController var in this class
	 * @param appController
	 */
	public ChatFrame(ChatbotController appController)
	{
		super();
		this.appController = appController;
		appPanel = new ChatPanel(appController);
		setupFrame();
	}
	/**
	 * Sets rules for the frame of the window
	 */
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Chattin' with ya boi");
		this.setResizable(false);
		this.setSize(600,600);
		this.setVisible(true);
	}
	/**
	 * this is a getter for appController
	 * @return returns appController
	 */
	public ChatbotController getAppController()
	{
		return appController;
	}
}
