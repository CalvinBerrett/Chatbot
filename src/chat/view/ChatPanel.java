package chat.view;

import javax.swing.*;
import chat.controller.ChatbotController;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;

public class ChatPanel extends JPanel
{
	private ChatbotController appController;
	private JButton chatButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private SpringLayout appLayout;
	private JButton checkerButton;
	private JLabel infoLabel;
	private JButton loadButton;
	private JButton saveButton;
	private JButton searchButton;
	private JButton tweetButton;
	/**
	 * 
	 * @param appController
	 */
	public ChatPanel(ChatbotController appController)
	{
		super();
		this.appController = appController;
		
		//Initialization of GUI data members
		chatButton = new JButton("Chat", new ImageIcon(getClass().getResource("/chat/view/images/Chat.png")));
		loadButton = new JButton("Load", new ImageIcon(getClass().getResource("/chat/view/images/Loading.png")));
		saveButton = new JButton("Load", new ImageIcon(getClass().getResource("/chat/view/images/Save.png")));
		searchButton = new JButton("Load", new ImageIcon(getClass().getResource("/chat/view/images/Search.png")));
		tweetButton = new JButton("Load", new ImageIcon(getClass().getResource("/chat/view/images/Tweet.png")));
	
		chatArea = new JTextArea(10,25);
		inputField = new JTextField(20);
		infoLabel = new JLabel("Type to chat with Ya Boi");
		appLayout = new SpringLayout();
		checkerButton = new JButton("Check");
			
		setupPanel();
		setupLayout();
		setupListeners();
		
	}
	/**
	 * Adds everythang in to da frame
	 */
	private void setupPanel()
	{
		this.setBackground(Color.MAGENTA);
		this.setLayout(appLayout);
		this.add(chatButton);
		this.add(inputField);
		this.add(infoLabel);
		this.add(chatArea);
		this.add(checkerButton);
		chatArea.setEnabled(false);
		chatArea.setEditable(false);
	}
	/**
	 * Holds all the code for where the items in the window are placed
	 */
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.SOUTH, inputField, -24, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, inputField, 275, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatArea, 10, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, chatArea, 205, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, inputField, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.WEST, chatArea, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatArea, -10, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 0, SpringLayout.NORTH, inputField);
		appLayout.putConstraint(SpringLayout.WEST, chatButton, -109, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, 0, SpringLayout.EAST, chatArea);
	}
	/**
	 * 
	 */
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = inputField.getText();
				String displayText = appController.interactWithChatbot(userText);
				chatArea.append(displayText);
				inputField.setText("");
			}
		});
		checkerButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = inputField.getText();
				String displayText = appController.useCheckers(userText);
				chatArea.append(displayText);
				inputField.setText("");
			}
		});
		searchButton.addActionListener(new ActionListener()
			public void actionPerformed(ActionEvent click)
			{
				String username = inputField.getText();
			}
	}
}
