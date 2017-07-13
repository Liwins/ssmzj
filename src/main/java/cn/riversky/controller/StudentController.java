package cn.riversky.controller;

import cn.riversky.domain.Student;
import cn.riversky.service.StudentService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by admin on 2017/7/12.
 */
public class StudentController implements Controller{
    private StudentService studentService;
    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
       String name=request.getParameter("name");
        String agestr=request.getParameter("age");
        Integer age=Integer.valueOf(agestr);
        Student student=new Student(name,age);
        studentService.addStudent(student);
        return new ModelAndView("/WEB-INF/jsp/show.jsp");
    }
}
