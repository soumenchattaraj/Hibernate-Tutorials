

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class ClientPage {

	public static void main(String[] args) {
		
		
		Session session = null;
		
	//	SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		//SessionFactory sessionFactory=new AnnotationConfiguration().configure().buildSessionFactory();
		//session = sessionFactory.openSession();
		
		/*//String sql = "select count(num_user_id_fk) from login.credintial_master";
		String sql = "select txt_user_name from login.credintial_master";
		
		Query query = session.createSQLQuery(sql);
		
		//Integer returnResult = Integer.parseInt(query.list().get(0).toString());
		List<String> str = query.list();
		System.out.println("size of string array:::"+str.size());
		for(int i=0;i<str.size();i++)
		{
			System.out.println(str.get(i));
		}
	//	System.out.println("returnResult:::"+returnResult);
*/
		
		
		AnnotationConfiguration acfg = new AnnotationConfiguration();
		              session = acfg.configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		              
		              
		 Transaction tx =null;
		             tx=session.beginTransaction();
		             
		             
		 /* EmployeeDetails employeeDetails = new EmployeeDetails();
		                  employeeDetails.setEmployeeId(101);
		                  employeeDetails.setEmployeeName("A");*/
		                  
		  RegularEmployee regularEmployee = new RegularEmployee();
		                  regularEmployee.setEmployeeId(104);
		                  regularEmployee.setEmployeeName("E");
		                  regularEmployee.setBonus(10);
		                  regularEmployee.setSal(100);

		  ContractEmployee contractEmployee = new ContractEmployee();
		                   contractEmployee.setEmployeeId(105);
		                   contractEmployee.setEmployeeName("F");
		                   contractEmployee.setPayPerHour(20);
		                   contractEmployee.setContractDuration(50);
		                   
		                   
		   //session.persist(employeeDetails);
		   session.persist(regularEmployee);
		   session.persist(contractEmployee);
		   
		   tx.commit();
		   session.close();
		   
		   
		   System.out.println("*** DONE ***");
		   

	}

}
