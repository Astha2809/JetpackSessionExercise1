package com.example.jetpacksessionexercise1

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

class FragmentAddUser : Fragment() {
    private lateinit var userViewModel: UserViewModel
    lateinit var edit_text_email: EditText
    lateinit var edit_text_name: EditText
    lateinit var add_button: Button
    lateinit var rootview: View
    var email: String = ""
    var name: String = ""


    companion object {
        fun newInstance(): FragmentAddUser {
            return FragmentAddUser()

        }
    }



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?


    ): View? {

        rootview = inflater.inflate(R.layout.fragment_add_user, container, false)

        initUi()
        return rootview
    }

    private fun initUi() {
        edit_text_email = rootview.findViewById(R.id.edit_text_email)
        edit_text_name = rootview.findViewById(R.id.edit_text_name)
        add_button = rootview.findViewById(R.id.add_button)
        userViewModel = ViewModelProviders.of(this).get(UserViewModel::class.java)
        add_button.setOnClickListener(View.OnClickListener {
            email = edit_text_email.text.toString()
            name = edit_text_name.text.toString()




            //val number:String=edit_text_number.text.toString()
        })


    }
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            val user = User(name, email)
            userViewModel.insert(user)
            //userViewModel=


            Toast.makeText(context, "saved", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "not saved", Toast.LENGTH_LONG).show()
        }

    }




}


