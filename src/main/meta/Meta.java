package meta;

import javax.swing.JFrame;
import gui.DataGUI;


/**
 * Main class
 * A way to meet Meta
 *
 * @see DataGUI
 * 
 * @author Zer0-K (Zero K)
 * @version 0.0
 * @since 0.0
 */
public class Meta {

	/**
	 * main function, static and public, as always
	 *
	 * create an instance of the meta-individual named Meta
	 * it is like a spell calling a spirit
	 */
	public static void main(String[] args) {
		// default resolution : 800x600
		DataGUI dataGUI = new DataGUI();
		//DataGUI dataGUI = new DataGUI(800,600);
		
		JFrame jframe_meta = new JFrame();
		jframe_meta.setBounds(200,200,dataGUI.getWidth(),dataGUI.getHeight());
	    jframe_meta.setLayout(null);
	    jframe_meta.setVisible(true);
	    jframe_meta.setResizable(true);
	    
	    //MenuPrincipal mp = new MenuPrincipal(jframe_meta,dataGUI);
	    //mp.lancer();
	}
}