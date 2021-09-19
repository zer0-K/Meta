package meta;

import javax.swing.JFrame;
import gui.MainMenu;


/**
 * Main class
 * A way to meet Meta
 *
 * @see MainMenu
 * 
 * @author Zer0-K (Zero K)
 * @version 0.0
 * @since 0.0
 */
public class Meta {
	/*----- attributes -----*/

	/* resolution attributes */
    /**
     * width (in pixels) of the frame
     */
    public static final int WIDTH = 800;
    /**
     * height (in pixels) of the frame
     */
    public static final int HEIGHT = 600;


	/*----- methods -----*/

	/**
	 * main function, static and public, as always
	 *
	 * create an instance of the meta-individual named Meta
	 * it is like a spell calling a spirit
	 */
	public static void main(String[] args) {
		// default resolution : 800x600
		
		JFrame jframe_meta = new JFrame();
		jframe_meta.setBounds(200,200,WIDTH,HEIGHT);
	    jframe_meta.setLayout(null);
	    jframe_meta.setVisible(true);
	    jframe_meta.setResizable(true);
	    
	    MainMenu main_menu = new MainMenu(jframe_meta,WIDTH,HEIGHT);
	    main_menu.start();
	}
}