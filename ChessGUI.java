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
 
   public ChessGUI()
   {
    JButton[] squares = new JButton[64];
    JPanel board = new JPanel();
    int row = 0;
    int col = 0;
    for(int i = 0; i<64; i++){
        squares[i] = new JButton();
        squares[i].setPreferredSize(new Dimension(50,50));
        if((row+col)%2==1){
            squares[i].setBackground(Color.BLACK);
        }
        else{
            squares[i].setBackground(Color.WHITE);

        }
        if(col ==7){
            col = 0;
            row++;
        }
        else{
            col++;
        }
        board.add(squares[i]);
    }
    board.setLayout(new GridLayout(8, 8));

      this.mainFrame = new JFrame("Chess");
      this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      this.mainPanel = new JPanel();

      // set the background color of the panel that contains everything
      this.mainPanel.setBackground(new Color(227, 206, 245));
      // align the components of the main panel vertically
      this.mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
      // add some padding to the edges of the main panel
      this.mainPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

      this.instructions = new JLabel("Welcome to ChessMaster!");
      this.instructions.setAlignmentX(Component.CENTER_ALIGNMENT);
      this.mainPanel.add(instructions);
      mainPanel.add(board);

      this.mainFrame.add(mainPanel);

      this.mainFrame.pack();
      this.mainFrame.setVisible(true);
   }
    public static void main(String[] args){
        ChessGUI chess = new ChessGUI();
    }



}
