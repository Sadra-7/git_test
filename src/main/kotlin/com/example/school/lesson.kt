package com.example.school

import org.springframework.web.bind.annotation.*

@RestController
class lesson (private val l_set : set_lesson){

    @PostMapping("/addLesson")
    fun addLesson(@RequestBody lesson: lesson_class):String{
        val new_lesson = l_set.set_lesson(0 , lesson.lesson)
        return "Lesson added"

    }

    @GetMapping("/ShowLesson")
    @ResponseBody
    fun show (): List<Data_Lesson>{
        val showall = l_set.all_lesson()
        return  showall

    }
}