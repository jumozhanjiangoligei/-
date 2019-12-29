package ch5.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import ch5.data.*;
public class HandleTestPaper implements ActionLisetener{
    TestPapaerView view;
    TestPaper testPaper;    //需要处理的试卷
    Problem problem;        //当前的题目
    Toolkit tool;           //处理图像
    public HandleTestPaper(){
        tool = Toolkit,getDefaultToolkit();
    }
    public void setView(TestPaperView view){
        this.view = view;
    }
    public void setTestPaper(TestPaper testpaper){
        this.testPaper = testpapaer;
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==view.nextProblem){
            view.time.start();   //开始计时
            if(testPaper!=null){
                problem = testPaper.nextProblem();
                handleProblem(problem);
            }
            else{
                JOptionPane.showMessageDialog
                (view,"没有试题","消息对话框",JOptionPane.WARNING_MESSAGE);
            }
        }
        if(e.getSource()==view.previousProblem){
            view.time.start();   //开始计时
            if(testPaper!=null){
                problem = testPaper.previousProblem();
                handleProblem(problem);
            }
            else{
                JOptionPane.showMessageDialog
                (view,"没有试题","消息对话框",JOptionPane.WARNING_MESSAGE);
            }
        }
        if(e.getsource()==view.aProblemSubmit{  //确认一道题目的答案
            String answer = "";
            if(view.choiceA.isSelected()){
                answer = answer+"A";
            }



            
        }
    }
}