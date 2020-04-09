package com.example.jetpacksessionexercise1

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class UserDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        private var userRoomInstance: UserDatabase? = null
        fun getDatabase(context: Context): UserDatabase? {
            if (userRoomInstance == null) {
                synchronized(UserDatabase::class.java) {
                    if (userRoomInstance == null) {
                        userRoomInstance = Room.databaseBuilder<UserDatabase>(
                            context.applicationContext,
                            UserDatabase::class.java, "user_database"
                        ).build()
                    }
                }
            }
            return userRoomInstance

        }


    }
}