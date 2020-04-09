package com.example.jetpacksessionexercise1

import android.app.Application
import android.os.AsyncTask
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel

 class UserViewModel(application: Application) : AndroidViewModel(application) {
    private val userDao: UserDao

    init {
        val userDb = UserDatabase.getDatabase(application)
        userDao = userDb!!.userDao()

    }

    fun insert(user: User) {
        //FragmentAddUser.InsertAsyncTask(userDao).execute(user)
        InsertAsynckTask(userDao).execute(user)
    }

    companion object {
        private class InsertAsynckTask(private val userDao: UserDao) :
            AsyncTask<User, Void, Void>() {
            override fun doInBackground(vararg users: User): Void? {
                userDao.insertUser(users[0])
                return null
            }

        }
    }

}
