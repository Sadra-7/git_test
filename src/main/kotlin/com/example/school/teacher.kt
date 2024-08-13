package com.example.school

import org.springframework.web.bind.annotation.*


@RestController
class teacher (private val t_set : set_user){



    @PostMapping("/addTeacher")
    fun addTeacher(@RequestBody teacherName: teacher_class): String {


        val new_t = t_set.set_teacher(0, teacherName.name,  teacherName.age)
        return "Teacher Added!"
    }

    @GetMapping("/Show")
    @ResponseBody
    fun getall() : List<Teacher_data>{
        val show_user = t_set.getall()
        val alluser = show_user.count()
        println("All user number : $alluser")

        return show_user
    }

    @GetMapping("/search")
    @ResponseBody
    fun search_name(@RequestParam ("name") name: String ) : List<Teacher_data>{
        val show_user = t_set.search(name)
        return show_user
    }

    @GetMapping("/delete")
    @ResponseBody
    fun data_delete(@RequestParam ("id") id : Int) :String{
        val delete_t =t_set.delete_techer(id)
        return ("Deleted!")
    }

    @GetMapping("/searchByAge")
    @ResponseBody
    fun search(@RequestParam ("lesson") lesson : String , @RequestParam ("age") age : Int) : Teacher_data?{

        val users = t_set.ckeck_l(lesson , age)
        return users
    }
    @GetMapping("/save")
    @ResponseBody
    fun save(@RequestParam ("t_id") id : Int , @RequestParam ("l_id") id_l: Int) : String{

        val users = t_set.save(id , id_l)
        return "Saved"
    }

    @PostMapping("/addClass")
    @ResponseBody
    fun add_class(@RequestBody add_class : class_add):String{
        val add = t_set.add_class(add_class.class_name , add_class.id)

        return "Class saved"
    }



}