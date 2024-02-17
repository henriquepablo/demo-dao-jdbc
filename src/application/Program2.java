package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		System.out.println("=== TEST 1: department findById ===");
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		Department dep = departmentDao.findById(3);
		System.out.println(dep);

		System.out.println("=== TEST 2: department findAll ===");
		List<Department> list = departmentDao.fidAll();
		
		for (Department departments: list) {
			System.out.println(departments);
		}
		
		System.out.println("=== TEST 3: department insert ===");
		Department newdepartment = new Department(null, "Music");
		departmentDao.insert(newdepartment);
		System.out.println("Inserted! new id = " + newdepartment.getId());
		
		System.out.println("=== TEST 4: departmetn update===");
		Department department = departmentDao.findById(1);
		department.setName("Moveis");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("=== TEST 5: departmetn deleteById===");
		departmentDao.deleteById(8);
		System.out.println("deletado");
	}

}
