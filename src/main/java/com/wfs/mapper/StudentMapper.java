package com.wfs.mapper;


import com.wfs.pojo.Student;



public interface StudentMapper {

    //增
    public void add(Student student);

    //删
    public int delete(int id);

    //改
    public void update(Student student);

    //查
    public Student queryById(int id);

//    //所有
//    public List<Student> queryAll();
}
