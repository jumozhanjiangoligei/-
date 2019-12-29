package ch5.gui;
import ch5.data. GiveTestPaper;
import ch5.data.RamdomInitTestPaper;
import ch5.data.TestPaper;
import ch5.data.TeacherOne;
import ch5.view.TestPaperView;
import ch5.view.IntegrationView;
public  class AppWindow {
  public static void main(String []args) {
         String testName="";
        IntegrationView integrationView = new IntegrationView();
		GiveTestPaper initTestPaper = new RamdomInitTestPaperl();
    TestPaper testPaper=

      initTestPaper.getTestPaper("���/��ͨ����.x1s",5); 
	  TestPaperView testView = new TestPaperView();

      testView.setTestPaper (testPaper); 
	  testView.setTeacher (new TeacherOne());  
	  testName = "��ͨ��ѵ��";

      testView. setTestName (testName);

      testView.setTotalTime(15);  
	  integrationView.addTest PaperView(testName, testView) ;

      initTestPaper = new RamdomInitTestPaper();  
	  testPaper= initTestPaper.getTestPaper("���/java����.x1s",6);
	  testView = new TestPaperView();
	  testView.setTestPaper (testPaper) ; 

      testView.setTeacher (new TeacherOne());
	  testName = "Java ѵ��";

      testView.setTestName (testName) ;
	  testView.setTotalTime(10);

      integrationView.addTestPaperView(testName, testView) ;
  }
}


