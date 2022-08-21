package com.ifs.Department.sample;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@GetMapping("/dept")
	public List<Department> getAllDepartments(){
		return departmentRepository.findAll();
		
	}
	
	@PostMapping("/adddept")
	public Department addDepartment(@RequestBody Department department) {
		return departmentRepository.save(department);
		
	}
	
	@PutMapping("updatedept/{id}")
	public Department updateDepartment(@RequestBody Department department, @PathVariable long id  ) {
		return departmentRepository.save(department);
		
	}
	
	@DeleteMapping("deletedept/{id}")
	public void deleteDepartment(@PathVariable long id) {
		 departmentRepository.deleteById(id);
	}

}
