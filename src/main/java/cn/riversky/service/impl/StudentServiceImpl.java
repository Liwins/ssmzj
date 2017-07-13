package cn.riversky.service.impl;

import cn.riversky.dao.StudentDao;
import cn.riversky.domain.Student;
import cn.riversky.service.StudentService;

/**
 * Created by admin on 2017/7/12.
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    public void addStudent(Student student) {
        studentDao.insertStudent(student);
    }
}
