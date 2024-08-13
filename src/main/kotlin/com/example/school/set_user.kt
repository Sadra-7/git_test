package com.example.school

import org.springframework.stereotype.*

@Service
class set_user (private  var data_user : DataRepository,private var lessonDataRepository:lessonDataRepository) {

    fun set_teacher(id: Int, name: String, age: Int) {

        val teacherMake = Teacher_data()
        teacherMake.id = id
        teacherMake.name = name
        teacherMake.age = age
        data_user.save(teacherMake)
    }
    fun getall() : List<Teacher_data>{
        return data_user.findAll()
    }
    fun delete_techer(id : Int){
        val delete_t = Teacher_data()
        delete_t.id = id

        data_user.delete(delete_t)

    }
    fun search(name : String): List<Teacher_data>{

        return data_user.findByName(name)

    }
    fun ckeck_l(lesson : String , age : Int): Teacher_data? {

        return data_user.findByLessonAndAge(Data_Lesson() , age)
    }
    fun save(id: Int , id_l : Int) {
        var d = lessonDataRepository.findById(id_l)
        var teacher = data_user.findById(id)
        if (teacher.isPresent) {
            var t = teacher.get()
            t.lesson = d.get()
            data_user.save(t)
        }
    }
    fun add_class(class_name :List<String> , id : Int) {
        val add = Teacher_data()
        var teacher_select = data_user.findById(id)
        var teacher_select_class = teacher_select.get()
        println(teacher_select_class.name)

        if (teacher_select_class.id == id) {
            teacher_select_class.class_teacher += class_name
            data_user.save(teacher_select_class)
        }
    }








}


