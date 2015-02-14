package util;
import graphicinterface.CheckersBoardServerGUI;

import javax.swing.ImageIcon;



public class ComponentImageFile {

    public ComponentImageFile() {
    }

    public static final String DIRECTORY = "/img/";

    public static final String BLACK = DIRECTORY + "black.png";

    public static final String YELLOW = DIRECTORY + "yellow.png";
    
    public static final String GREY_KING = DIRECTORY + "greyking.png";

    public static final String YELLOW_KING = DIRECTORY + "yellowking.png";

    public static final String GREY = DIRECTORY + "grey.png";
    
    public static ImageIcon getImageIconGreyKing(){
    	return new ImageIcon(CheckersBoardServerGUI.class.getResource(ComponentImageFile.GREY_KING));
    }
    
    public static ImageIcon getImageIconYellowKing(){
    	return new ImageIcon(CheckersBoardServerGUI.class.getResource(ComponentImageFile.YELLOW_KING));
    }
    
    public static ImageIcon getImageIconBlack(){
    	return new ImageIcon(CheckersBoardServerGUI.class.getResource(ComponentImageFile.BLACK));
    }
    
    public static ImageIcon getImageIconYellow(){
    	return new ImageIcon(CheckersBoardServerGUI.class.getResource(ComponentImageFile.YELLOW));
    }
    
    public static ImageIcon getImageIconGrey(){
    	return new ImageIcon(CheckersBoardServerGUI.class.getResource(ComponentImageFile.GREY));
    }
    
}
