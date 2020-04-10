package com.example.jetpacksessionexercise1

import android.telecom.Call
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

//data class UserInformation(val name:String,val email:String){
//    @Entity(tableName = "word_table")
//    class Word(@PrimaryKey @ColumnInfo(name = "word") val word: String)

    @Entity(tableName = "user_info")
    class User(@PrimaryKey //val id:String,
               val name:String,
               val email:String){

    }




