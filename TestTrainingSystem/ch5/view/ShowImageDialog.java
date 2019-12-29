package ch5.view;
import java.awt.*;
import javax.swing.*;
public class ShowImageDialog extend JDialog {
    Image img;
    ShowImageDialog(Image img){ //构造方法
        setTitle("显示图像对话框");
        this.img = img;
        setSize(500,470);
        GiveImage image = new GiveImage();
        add(image);
        setModal(true);
        setDefaultCloseOpreration(JFrame.DISPOSE_ON_CLOSE);
    }
class GiveImage extends JPanel{ //内部类，专门为该对话框提供图片
    public void paintCompoent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img,0,0,getBounds().height,this);
        }
    }
}