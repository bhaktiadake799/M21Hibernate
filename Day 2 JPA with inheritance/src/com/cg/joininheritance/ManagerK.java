package com.cg.joininheritance;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("MGR_Table_Joint_Inheritance")

	public class ManagerK extends Employeek
	{
	
	private static final long serialVersionUID = 1L;
		
		private String departmentName;

		private String getDepartmentName() {
			return departmentName;
		}

		public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;
		}
		public void setSalary(int i) {
		
	}

		public void setName(String string) {
			// TODO Auto-generated method stub
			
		}
}


