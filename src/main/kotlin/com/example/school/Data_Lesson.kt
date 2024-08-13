package com.example.school

import jakarta.persistence.*

@Entity
class Data_Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: Int = 0

    var lesson: String = ""



}