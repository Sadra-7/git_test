package com.example.school

import org.springframework.web.bind.annotation.*


@RestController
class Student (private val s_set : set_student){

    @PostMapping("/addStudent")
    fun add_Student(@RequestBody studentName : student_class) : String{

        val new_s = s_set.set_student(0 , studentName.name , studentName.age )
        return "Student added!"
    }

    @GetMapping("/ShowStudent")
    @ResponseBody
    fun get_all() : List<Data_s>{
        val showAll = s_set.getAll()
        return showAll

    }
}