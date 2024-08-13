package com.example.school

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id


@Entity
class Data_s {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    var id : Int = 0

    var name: String = ""

    var age : Int = 0

}