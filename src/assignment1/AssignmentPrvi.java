
package assignment1;

import javax.swing.JOptionPane;

public class AssignmentPrvi {

    public static void main(String[] args) {
        
        int options = JOptionPane.showOptionDialog(null, "Choose option" , "Option dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null , new String[]{"Settings","Close"}, null);
        
        switch(options){
        
        case JOptionPane.YES_OPTION:
            
            FirstFrameS firstFrame = new FirstFrameS();
            firstFrame.setVisible(true);
            break;
        case JOptionPane.NO_OPTION:
            
        }
        
        
    }
    
}
