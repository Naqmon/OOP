public class JImageDisplay extends javax.swing.JComponent{
    private java.awt.image.BufferedImage buffImage;

    public JImageDisplay(int w, int h){
        buffImage = new java.awt.image.BufferedImage(w, h, java.awt.image.BufferedImage.TYPE_INT_RGB);
        java.awt.Dimension dim = new java.awt.Dimension(w, h);
        super.setPreferredSize(dim);
    }
    public void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
        if(g.drawImage(java.awt.Image, 0, 0, Image.getWidth(null), Image.getHeight(null), null)){
        }
    }
    public void clearImage(){
    }
    public void drawPixel(int x, int y, int rgbColor){
    }
}
