//package mvc.view;

//import mvc.ControllerInterface;
//import mvc.GameObserver;
//import mvc.model.TicTacToeBoard;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ChessGUI 
{
   //TicTacToeButtons buttons;
   JFrame mainFrame;
   JPanel mainPanel;
   JLabel instructions;
   //TicTacToeBoard board;
   //ControllerInterface controller;
   public ChessGUI()
   {
      //this.board = board;
      //this.controller = controller;

      // register this object as the observer of the game
      //this.board.register(this); 

      // set up the user interface
      //this.buttons = new TicTacToeButtons(board, this);
      //this.buttons.setPreferredSize(new Dimension(2000,2000));
      this.mainFrame = new JFrame("Chess");
      this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      this.mainPanel = new JPanel();

      // set the background color of the panel that contains everything
      this.mainPanel.setBackground(new Color(227, 206, 245));
      // align the components of the main panel vertically
      this.mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
      // add some padding to the edges of the main panel
      this.mainPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

      this.instructions = new JLabel("");
      this.instructions.setAlignmentX(Component.CENTER_ALIGNMENT);
      this.mainPanel.add(instructions);

      //this.buttons.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
      // make the buttons panel "see-through"
      //this.buttons.setOpaque(false);
      //this.mainPanel.add(buttons);

      this.mainFrame.add(mainPanel);

      this.mainFrame.pack();
      this.mainFrame.setVisible(true);
   }
    public static void main(String[] args){
        ChessGUI chess = new ChessGUI();
    }



}
