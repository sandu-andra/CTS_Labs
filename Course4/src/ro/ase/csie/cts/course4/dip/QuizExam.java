package ro.ase.csie.cts.course4.dip;

public class QuizExam implements ExamInterface{

	@Override
	public void takeExam(String course, String studentName) {
		// TODO Auto-generated method stub
		
		System.out.println(String.format("%s takes a quiz exam at %s", studentName, course));  
		
	}

}
