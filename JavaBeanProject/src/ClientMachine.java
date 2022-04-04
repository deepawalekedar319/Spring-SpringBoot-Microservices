
public class ClientMachine {

	public static void main(String[] args) {
		//  method stub
		// Create the BusinessLogicClass object
		BusinessLogicClass blogic = new BusinessLogicClass();
		
		// Create the JavaBeanExample class object
		JavaBeanExample javaBean = new JavaBeanExample();
		
		// Setting the values to bean properties
		javaBean.setName("D. Kedar Singh");
		javaBean.setCollegeName("MCET");
		javaBean.setCourse("Java");
		javaBean.setMarks1(100);
		javaBean.setMarks2(100);
		javaBean.setMarks3(100);
		
		// Call the BusinessLogicClass method 
		//blogic.businessLogic(javaBean);
		
		// Call the getStudentDetails method 
		blogic.getStudentDetails(javaBean);
	} // main
} // class
