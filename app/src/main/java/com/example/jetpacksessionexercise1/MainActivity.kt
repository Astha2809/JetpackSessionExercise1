package com.example.jetpacksessionexercise1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linearLayoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerview.layoutManager=linearLayoutManager
       val userAdapter=UserAdapter(setDummyData())
        //val userAdapter=UserAdapter()
        recyclerview.adapter=userAdapter


        floatingbutton.setOnClickListener(View.OnClickListener {
            openFragment()


        } )


    }
    private fun setDummyData(): ArrayList<User> {
        val user1=User("Astha","astha@gmail")
        val user2=User("abc","abc@gmail")
        val user3=User("def","def@gmail")
//        val user4=User("ghi")
//        val user5=User("jkl")
//        val user6=User("xyz")
//        val user7=User("mno")

       return arrayListOf<User>(user1,user2,user3)
        }

    private fun openFragment(){
        val fragment=FragmentAddUser()
        val fragmentTransaction=supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.main_linear,fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    }

