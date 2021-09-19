package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 * main menu
 * 
 * @author Zer0-K (Zero K)
 * @version 0.0
 * @since 0.0
 */
public class MainMenu {
    /*----- attributes -----*/

    /* general attributes */
    /**
     * root of the main menu
     */
    private JFrame root;

    /* resolution attributes */
    /**
     * width (in pixels) of the frame
     */
    private final int width_frame;
    /**
     * height (in pixels) of the frame
     */
    private final int height_frame;
    
	
    /* graphical elements of the frame */
    /**
     * elements of the main menu are displayed in a certain layout in this panel
     */
    private JPanel panel_main_menu;
    /**
     * button to start the active Meta
     */
    private JButton button_start;
    // test elements
	private JLabel label_test;
    private JButton button_test;

	
    /*----- methods -----*/

    /* constructors */
	/**
     * initialize the gui configuration with given resolution
     *
     * @param root root view, the frame of the app
     * param data general data used when launching the app
     */
	public MainMenu(JFrame root, final int width, final int height) {
		this.root = root;
        this.width_frame = width;
        this.height_frame = height;
	}
		
	public void start() {
        /*----- initialization of the graphical elements -----*/

		// main panel
		panel_main_menu = new JPanel();
		panel_main_menu.setLayout(null);
		panel_main_menu.setVisible(true);
        
        /* labels */
	    // test label
        label_test = new JLabel();
        label_test.setText("Test text");
        
 
        /* buttons */
        // start button
        button_start = new JButton();
        button_start.setText("Start");
        // test button
        button_test = new JButton();
        button_test.setText("Test button");

        /*----- listeners and layout -----*/
        
        // set the listeners for the interactive elements
        this.listeners();

        // set the sizes and positions of the elements
        this.sizesAndPos();
        
        /*----- finalization  -----*/

	    panel_main_menu.add(label_test);
	    panel_main_menu.add(button_test);
        panel_main_menu.add(button_start);
        root.add(panel_main_menu);
	}
	
	/*
	 * set the sizes and positions of all the elements (in the panel)
     * of the main menu
	 * */
	private void sizesAndPos() {
        // a variable for vertical centering
		int vertical_centering = this.height_frame/2-25;
		
		// main layout
		root.setSize(this.width_frame, this.height_frame);
		panel_main_menu.setBounds(0, 0, this.width_frame, this.height_frame);
		
		label_test.setBounds(this.width_frame/2-50, vertical_centering, 100, 20);
		
		button_test.setBounds(this.width_frame/2-100, vertical_centering+50, 200, 20);
        button_start.setBounds(this.width_frame/2-100, vertical_centering+100, 200, 20);
		
		root.repaint();	// for a correct initialisation (bugs otherwise)
	}
	
	/*
     * implement the listeners for the interactive elements
     * of the main menu
	 * */
	private void listeners() {
		/*----- button listeners -----*/

		// listener for the test button
		button_test.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				button_start.setText("You have clicked on the test button");	
			}
		});
				
		// listener for the start button
		button_start.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
                button_test.setText("You have clicked on the start button");	
                /* TODO : start the active Meta
				// récupère les nombres entrés dans les textFields
				// N.B. : pas besoin de try/catch, car les textFields n'acceptent que des nombres valides
				int difficulte = comboBox_difficultes.getSelectedIndex();
            	int nbr_joueurs = Integer.parseInt(textField_nb_joueurs.getText());
            	int nbr_jours = Integer.parseInt(textField_nb_jours.getText());
            	
            	donnees.setDifficulte(difficulte);
            	donnees.setNbrJoueurs(nbr_joueurs);
            	donnees.setNbrJours(nbr_jours);
            	
            	panel_menu_principal.setVisible(false);
            	Partie partie = new Partie(root,donnees,panel_menu_principal);
            	partie.lancer();*/
			}
		});
	}
    
}
