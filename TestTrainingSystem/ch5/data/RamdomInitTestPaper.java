package ch5.date;
import java.io.*;
import jxl.*;
import java.util.*;
import javax.swing.JOptionPane;
public class RamdomInitTestPaper implements GiveTestPaper{
    TestPaper testPaper;
    File fileExcel;
    Problem [] problem;
    InputStream in =null;
    Workbook wb = null;
    Sheet sheet = null;
    LinkedList<Integer> list;
    public RamdomInitTestPaper(){
        testPaper = new TestPaper();
        list = new LinkedList<Integer>();
    }
    public TestPaper getTestPaper(String excelFileName,int amount) {
        boolean b = setExcel(excelFileName);
        if(b) {
            try {
                ramdomInitTestPaper(amount);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("������������ͣ��������");
                System.exit(0);
            }
            testPaper.setProblem(problem);
            return testPaper;
        }
        else {
            JOptionPane.showMessageDialog(null,"û��Ԥ�����","��Ϣ�Ի���",JOptionPane.WARNING_MESSAGE);
            return null;
        }
    }
    private boolean setExcel(String excelFileName){
        boolean b =true;
        try {
            fileExcel =new File(excelFileName);
            in =new FileInputStream(fileExcel);
            testPaper.setProblemSource(fileExcel.getAbsolutePath());
        }
        catch(IOException exp){
            JOptionPane.showMessageDialog(null,"û��Ԥ�����Excel","��Ϣ�Ի���",JOptionPane.WARNING_MESSAGE);
            b = false;
        }
        try {
            wb=Workbook.getWorkbook(in);
            in.close();
        }
        catch(Exception exp){
            b = false;
        }
        return b;
    }
    private void ramdomInitTestPaper(int amount) {
        list.clear();
        if(wb==null) {
            JOptionPane.showMessageDialog(null,"û��Ԥ�����Excel","��Ϣ�Ի���",JOptionPane.WARNING_MESSAGE);
            return;
        }
        sheet = wb.getSheet(0);
        int rowsAmount = sheet.getRows();
        int realAmount = Math.min(amount,rowsAmount-1);
        problem = new Problem[realAmount];
        for(int i=0;i<=rowsAmount-1;i++){
            list.add(i+1);
        }
        Ramdom ramdom=new Ramdom();
        for(int i=0;i<problem.length;i++){
            int m = ramdom.nextInt(list,size());
            int index =list.remove(m);
            Cell [] cell = sheet.getRow(index);
            Problem[i] = new Problem();
            int number = i+1;
            problem[i].setContent("��"+number+"��."+cell[0].getContents());
            problem[i].setCorrectAnswer(cell[1].getContents().trim());
            problem[i].setGiveChoiceA(cell[2].getContents().trim());
            problem[i].setGiveChoiceB(cell[3].getContents().trim());
            problem[i].setGiveChoiceC(cell[4].getContents().trim());
            problem[i].setGiveChoiceD(cell[5].getContents().trim());
            String typeStr = cell[6].getContents().trim;
            if(typeStr.equalsIgnoreCase("p")){
                problem[i].setIsJudge(true);
                problem[i].setChoice(false);
                problem[i].setImageName("havenot.jpg");
            }
            if(typeStr.equalsIgnoreCase("x")){
                problem[i].setIsJudge(true);
                problem[i].setChoice(false);
                problem[i].setImageName("havenot.jpg");
            }
            if(typeStr.equalsIgnoreCase("p#")||typeStr.startsWith("p#")) {
                problem[i].setIsJudge(true);
                problem[i].setChoice(false);
                String imageName=typeStr.substring(typeStr.indexOf("#")+1);
                problem[i].setImageName(imageName);
            }
            if(typeStr.equalsIgnoreCase("x#")||typeStr.startsWith("x#")) {
                problem[i].setIsJudge(false);
                problem[i].setChoice(true);
                String imageName=typeStr.substring(typeStr.indexOf("#")+1);
                problem[i].setImageName(imageName);
            }

        }
    }
}