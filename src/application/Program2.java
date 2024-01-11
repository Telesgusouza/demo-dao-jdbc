package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("===== teste 1: find one =====");
		Department department = departmentDao.findById(1);
		System.out.println(department);

		System.out.println();

		System.out.println("===== test 2: find all =====");
		List<Department> listDep = departmentDao.findAll();
		for (Department dep : listDep) {
			System.out.println(dep);
		}

		System.out.println();

		System.out.println("===== test 3: Insert =====");
		// department.setName("Rocks");
		// departmentDao.insert(department);
		// System.out.println("Insert!");
		
		System.out.println();

		System.out.println("===== test 4: insert =====");
		department.setId(6);
		department.setName("Cosmético");
		departmentDao.update(department);
		System.out.println("Update!");
				
		System.out.println();

		System.out.println("===== test 5: delete =====");
		departmentDao.deleteById(6);
		System.out.println("Deletado!");
		
	}
}
