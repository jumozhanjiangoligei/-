Package ch5.test;
Import ch5.data.*;
public class AppTest{
    Public static void main(String []args){
        GiveTestPaper initTestPaper = new RamdomInitTestPaper();
        TestPaper testPaper=initTestPaper.getTestPaper("题库/交通理论.xsl",5);
        Problem [] problem = testPaper.getAllProblem();
        for(int i = 0;i<problem.length;i++){
            int m = i+1;
            System.out.println("第"+m+"题.");
            System.out.println(problem[i].getContent());
            if(problem[i].getIsJudge()){
                inputOne(problem[i]);
            }
            else if(problem[i].getIschoice()){
                inputTwo(problem[i]);
             }
            System.out.println();
        }
        problem[0].setUserAnswer("B");
        problem[1].setUserAnswer("A");
        problem[2].setUserAnswer("C");
        problem[3].setUserAnswer("A");
        problem[0].setUserAnswer("B");
        problem[1].setUserAnswer("C");
        testPaper.acceptTeacher(new TeacherOne());
    }
    static void inputOne(Problem problem){
        System.out.printf("%s\t%s\n",problem.getGiveChoiceA(),problem.getGiveChoiceB());
        System.out.println("图像的名字:"+problem.getImageName());
        System.out.print1n("正确答案： "+problem.getCorrectAnswer());
    }
    static void inputTwo(Problem problem){
        System.out.printf("%s\t%\sn,problem.getGiveChoiceA(),problem.getGiveChoiceB());
        System.out.printf("%s\t%s\n",problem.getGiveChoiceC(),problem.getGivechoiceD());
        System,out.println（"图像的名字"+problem.getImageName());
        System.out.println（"正确答案: "+problem.getCorrectAnswer());
    }
}