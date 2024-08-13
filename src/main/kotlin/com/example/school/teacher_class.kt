package com.example.school

data class teacher_class(val name: String,  val age: Int)

data class lesson_class(val lesson:String)

data class student_class(val name: String , val age : Int)

data class class_add(val id : Int , val class_name:List<String>)