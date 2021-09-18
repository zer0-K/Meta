package gui;


/**
 * data for the graphical user interface
 * 
 * @author Zer0-K (Zero K)
 * @version 0.0
 * @since 0.0
 */
public class DataGUI {
	/*----- attributes -----*/

    /* resolution */
    /**
     * height (in pixels) of the window
     */
    private int height;
    /**
     * width (in pixels) of the window
     */
    private int width;

	
    /*----- methods -----*/

    /* constructors */
    /**
     * initialize the default gui configuration
     */
	public DataGui() {
        this.height = 600;
		this.width = 800;
	}

    /**
     * initialize the gui configuration with given resolution
     *
     * @param height height of the gui (in pixels)
     * @param width width of the gui (in pixels)
     */
    public DataGUI(int height, int width) {
        this.height = height;
        this.width = width;
    }
	
	/* setters */
	// no setters yet
	
	/* getters */
    /**
     * get the height (in pixels) of the gui
     *
     * @return height (in pixels) of the gui
     */
	public int getHeight() { return this.height; }
    /**
     * get the width (in pixels) of the gui
     *
     * @return width (in pixels) of the gui
     */
	public int getWidth() { return this.width; }
}
