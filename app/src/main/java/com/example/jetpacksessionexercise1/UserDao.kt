package com.example.jetpacksessionexercise1

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
@Dao
interface UserDao {
    @Query("SELECT * from user_info")
    fun getAllUsers(): List<UserInformation>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
     fun insertUser(user: User)
}