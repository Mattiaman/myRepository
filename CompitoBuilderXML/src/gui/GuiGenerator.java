package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuiGenerator {
	
	private JFrame mainFrame;
	private JPanel mainPanel;
	
	private static GuiGenerator _instance=null;
	
	protected GuiGenerator() {
		mainFrame=new JFrame("XML Converter");
		mainPanel=new JPanel(new BorderLayout());
		
		JButton Load=new JButton("LOAD XML");
		JButton Convert=new JButton("XML TO TXT");
		JButton Save=new JButton("SAVE TXT");
		
		/* Frame configuation */
		mainFrame.setSize(800, 600);
		
		mainPanel.add(Load, BorderLayout.WEST);
		mainPanel.add(Convert, BorderLayout.CENTER);
		mainPanel.add(Save, BorderLayout.EAST);
		
		mainFrame.setContentPane(mainPanel);
		mainFrame.setVisible(true);
		
	}
	
	/* instance Method */
	public static GuiGenerator instance() {
		if(_instance==null)
			_instance=new GuiGenerator();
		return _instance;
	}
	
}
