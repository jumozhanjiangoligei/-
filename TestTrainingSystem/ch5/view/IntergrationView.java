package ch5.view;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
public class IntegrationView extends Jframe{
    JTabbedPane tabbedpane; //用选项卡集成TsetpaperView视图
    public IntegrationView(){
        tabbedPane = new JTabbedPane(JTabbedPane.LEFT);//卡在左侧
        tabbedPane.validate();
        add(tabbedPane,BorderLayout.CENTER);
        setBounds(100,100,1200,560);
        setDefaultCloseOpreation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
    public void addTestPaperView(String cardName,TestPaperView view){
        tabbedPane.add(cardName,view);
        validate();
    }
}