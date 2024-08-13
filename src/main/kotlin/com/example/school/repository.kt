package com.example.school


import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete


@Repository
interface DataRepository : JpaRepository<Teacher_data, Int> {

    fun findByName(name: String): List<Teacher_data>
    fun findByLessonAndAge(lesson : Data_Lesson, age : Int): Teacher_data?
}

@Repository
interface lessonDataRepository : JpaRepository<Data_Lesson , Int>



@Repository
interface studentDataRepository : JpaRepository<Data_s , Int>