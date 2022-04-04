public class BusinessLogicClass {
	
	public void getStudentDetails(JavaBeanExample bean) {
		System.out.println("The student Data is :: ");
		System.out.println("The student Roll number :: " + bean.getRollNumbe());
		System.out.println("The student Name :: " + bean.getName());
		System.out.println("The student College Name :: " + bean.getCollegeName());
		System.out.println("The student Course :: " + bean.getcourse());
		System.out.println("The student Marks 1 :: " + bean.getMarks1());
		System.out.println("The student Marks 2 :: " + bean.getMarks2());
		System.out.println("The student Marks 3 :: " + bean.getMarks3());		
	} // method
	
	public void businessLogic( JavaBeanExample bean) {
		System.out.println("Dear.... " + bean.getName() + " your marks average and total is :: ");
		System.out.println("Total is :: " + bean.getMarks1() + bean.getMarks2() + bean.getMarks3());
		System.out.println("Average is :: " + (bean.getMarks1() + bean.getMarks2() + bean.getMarks3())/3);
	} // method
}  //class