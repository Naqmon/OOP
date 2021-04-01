public class FractalExplorer{
    private int sizeWindow;
    private JImageDisplay display;
    private FractalGenerator frgen;
    private java.awt.geom.Rectangle2D.Double rec;

    public FractalExplorer(int size){
        sizeWindow = size;
    }

    public void createAndShowGUI(){
    }
    public void drawFractal(){
    }
    public void main(String[] args){
        FractalExplorer window = new FractalExplorer(800);
        createAndShowGUI();
        drawFractal();
    }
}
