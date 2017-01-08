/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.placement.persisting;

import com.placement.app.Company;
import com.placement.app.Job;
import com.placement.app.JobSeeker;
import com.placement.app.Student;
import java.util.List;

public interface IPersistable {

	public Boolean saveStudent(Student jb);

	public String getUserRole(String user_id, String password);

	public Boolean saveCompany(Company company);

	public List<Company> getCompany();

	public Company getCompany(String company);

	public List<Job> getJobs(String com_id);

	public Boolean saveJobs(Job job);

	public String getJobID();

	public List<Student> getStudents(String filter);

	public Student getEduDetail(String stu_id);

	public List<Student> filterStudent(Double xii_marks, Double x_marks);

	public Student getStudentPersonal(String id);

	public List<Student> studentList(String filter);

	public Student getStudentDetail(String id);

	public List<Company> getCompanies(String stu_id);

	public Boolean updateStudent(Student student);
}
