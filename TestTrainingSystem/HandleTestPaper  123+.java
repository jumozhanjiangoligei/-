if(view.choiceB.isSelected()) {
	answer = answer+"B";
}
if(view.choiceC.isSelected()) {
	answer = answer+"C";
}
if(view.choiceD.isSelected()) {
	answer = answer+"D";
}
if(problem==null) {
	JOptionPane.showMessageDialog
	(view,"û������"��"��Ϣ�Ի���"��JOptionPane.WARNING_MESSAGE);
	return;
}
view.choiceA.setVisible(false);
view.choiceB.setVisible(false);
view.choiceC.setVisible(false);
view.choiceD.setVisible(false);
view.aProblemSubmit.setVisible(true);
problem.setUserAnswer(answer);
}
if(e.getSource()==view.submit) {
	testPaper.acceptTeacher(view.teacher);
	view.renewJButton.setVisible(true);
	view.submit.setVisible(false);
	view.time.stop();
	view.showUsedTime.setText("������");
}
if(e.getSource()==view.renewJButton) {
	view.showUsedTime.setText("");
	view.usedTime = view.totalTime;
	view.showUsedTime.setText("����ʣ��ʱ��"+"view.totalTime");
	view.showContent.setText("null");
	Image img = tool.getImage("ͼ�����/renew.jpg");
	handleImage(img);
	view.showImage.repaint();
	view.nextProblem.setVisible(true);
	view.previousProblem.setVisible(true);
	String problemSource= testPaper.getProblemSource();
	GiveTestPaper initTestPaper = new RamdomInitTestPaper();
	testPaper=initTestPaper.getTestPaper(problemSource,tesPaper.getProblemAmount());
	view.renewJButton.setVisible(false);
	view.submit.setVisible(true);	
}
view.choiceA.setVisible(false);
view.choiceB.setVisible(false);
view.choiceC.setVisible(false);
view.choiceD.setVisible(false);
}
private void handleProblem(Problem problem) {
	if(problem==null) {
		JOptionPane.showMessageDialog
		(view,"")
	}
      
      else {

      view. aProblenSubmit.setVisible (true);

      view.showContent.set Text (problem.getContent());
	  view.showContent.setvisible(true);
	  if (problem.getIsChoice()) {
	    handelChoice();
		}
      else if(problem.getIsJudge()) {
      	handelJudge() ;
	  }

      String imageName = problem.getImageNane () ;

      Image img = tool.getImage("ͼ�����/"+imageName) ;
	  handleImage(img) ;}
}
 private void handelJudge(){
 

      view. choiceA. setText (problem.getGiveChoiceA());
	  view. choiceB. setText (problem.getGivechoiceB());
	  view. choiceA.setVisible(true);
	  view. choiceB.setVisible(true);
      view. choiceC.setVisible(false);
      view. choiceD.setVisible(false);
  }
      private void handelChoice{

      view. choiceA.setText (problem.getGiveChoiceA());

      view. choiceB.setText(problem.getGiveChoiceB());
	  view. choiceC.setText(problem .getGiveChoiceC());
	  view. choiceD. setText(problem .getGiveChoiceD());
	  view. choiceA.setVisible (true);
	  view. choiceB.setVisible (true);
	  view. choiceC.setVisible(true);
      view. choiceD.setVisible(true);
      private void handleImage (Image image) {
	  
	  view. showImage.setImage (image);
	  view.showImage.repaint();	
}
 }














