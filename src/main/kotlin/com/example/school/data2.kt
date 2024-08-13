package com.example.school

import jakarta.persistence.*


@Entity
class Teacher_data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int = 0

    var name: String = ""

    var age : Int = 0

    var class_teacher: List<String> = ArrayList()




    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "lesson_t", referencedColumnName = "id")

    var lesson : Data_Lesson? = null
}