package com.example.jetpacksessionexercise1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.jetpacksessionexercise1.databinding.UserListBinding

class UserAdapter(private val items: List<User>) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
       //val aa: View = inflater.inflate(R.layout.user_list,parent,false)

        val binding: UserListBinding = DataBindingUtil.inflate(inflater,

            R.layout.user_list,
            parent,
            false

        )
        return ViewHolder(binding)

    }

    override fun getItemCount():
            Int = items.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.user=items.get(position)
        holder.binding.executePendingBindings()

       // holder.bind(items.get(position))

    }


    class ViewHolder(var binding: UserListBinding) : RecyclerView.ViewHolder(binding.root)

//        fun bind(data: com.example.jetpacksessionexercise1.User) {
//            binding.user = data
//            //binding.setVariable(BR.user,data)
//            binding.executePendingBindings()
//
//        }

}



