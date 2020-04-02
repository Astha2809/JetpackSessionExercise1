package com.example.jetpacksessionexercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linearLayoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerview.layoutManager=linearLayoutManager
        val userAdapter=UserAdapter(setDummyData())
        recyclerview.adapter=userAdapter

    }
    private fun setDummyData(): ArrayList<User> {
        val user1=User("Astha")
        val user2=User("abc")
        val user3=User("def")
        val user4=User("ghi")
        val user5=User("jkl")

       return arrayListOf<User>(user1,user2,user3,user4,user5)
        }

    }

