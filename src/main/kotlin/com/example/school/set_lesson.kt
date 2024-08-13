package com.example.school

import org.springframework.stereotype.Service

@Service
class set_lesson (private val data_lesson : lessonDataRepository){
    fun set_lesson(id : Int , lesson : String){
        val lesson_make = Data_Lesson()
        lesson_make.id = id
        lesson_make.lesson = lesson
        data_lesson.save(lesson_make)

    }

    fun all_lesson() : List<Data_Lesson>{

        return data_lesson.findAll()
    }
}