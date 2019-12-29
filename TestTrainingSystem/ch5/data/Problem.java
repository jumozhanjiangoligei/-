package ch5.data;
public class Program {
    boolean isChoice;
    boolean isJudge;
    String content;
    String giveChoiceA,giveChoiceB,giveChoiceC,giveChoiceD;
    String imageName;
    String correctAnswer="QWEQ@#$@!@#1QWEQ";
    //用户回答的初始答案和correctAnswer不同,防止出题人忘记给正确答案
    String userAnswer ="" ;
    public boolean giveChoice() {
        return isChoice;
    }
    public void setIsChoice(boolean b) {
        isChoice = b;
    }
    public boolean getIsJudge() {
        return isJudge;
    }
    public void setIsJudge(boolean b) {
        isJudge = b;
    }
    public void setContent(String c) {
        content = c;
    }
    public String giveConcent() {
        return content;
    }
    public void setCorrectAnswer(String a) {
        correctAnswer = a;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public void setUserAnswer(String u) {
        userAnswer = u;
    }
    public String getUserAnswer() {
        return userAnswer;
    }
    public void setGiveChoiceA(String a) {
         giveChoiceA =a ;
    }
    public String getGiveChoiceA() {
        return giveChoiceA;
    }
    public void setGiveChoiceB(String b) {
        giveChoiceB = b;
    }
    public String getGiveChoiceB() {
        return giveChoiceB;
    }
    public void setGiveChoiceC(String c) {
        giveChoiceC =c;
    }
    public String getGiveChoiceC() {
        return giveChoiceC;
    }
    public void setGiveChoiceD(String d) {
        giveChoiceD =d
    }
    public String getGiveChoiceD() {
        return giveChoiceD;
    }
    public void setImageName(String c) {
        imageName = c;
    }
    public String getImageName() {
        return imageName;
    }
}