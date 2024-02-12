package lessons.lesson_19_incapsulation.hr.repositories;

import lessons.lesson_19_incapsulation.hr.entity.Department;

import java.util.Arrays;

public class DepartmentRepository {

    Department[] departments;

    public DepartmentRepository(int number) {
        this.departments = new Department[number];
    }

    public Department[] getDepartments() {
        return departments;
    }




    @Override
    public String toString() {
        return "DepartmentRepository{" +
                "departments=" + Arrays.toString(departments) +
                '}';
    }
}
