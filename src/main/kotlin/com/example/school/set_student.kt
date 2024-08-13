package com.example.school

import org.springframework.stereotype.Service


@Service
class set_student (private val data_student : studentDataRepository){

    fun set_student(id : Int , name : String , age : Int){
        val student_make = Data_s()
        student_make.id = id
        student_make.name = name
        student_make.age = age
        data_student.save(student_make)

    }

    fun getAll() : List<Data_s>{
        return data_student.findAll()
    }
}