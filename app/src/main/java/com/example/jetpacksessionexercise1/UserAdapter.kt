package com.example.jetpacksessionexercise1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
//import com.example.jetpacksessionexercise1.databinding.UserListBinding
import kotlinx.android.synthetic.main.user_list.view.*

class UserAdapter(private val items: MainActivity) : RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    private var userList:List<User> = mutableListOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_list,parent,false)
       //val aa: View = inflater.inflate(R.layout.user_list,parent,false)


//        val binding: UserListBinding = DataBindingUtil.inflate(inflater,
//
//            R.layout.user_list,
//            parent,
//            false
//
//        )
        //return ViewHolder(binding)
        return ViewHolder(itemView)

    }

    override fun getItemCount():
            Int = userList.size


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.binding.user=items.get(position)
//        holder.binding.executePendingBindings()
        val user=userList[position]
        holder.setData(user.name,user.email,position)

       // holder.bind(items.get(position))

    }


    inner class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        private var pos:Int=0
        fun setData(name:String,email:String,position:Int) {
            itemView.textview_name.text=name
            itemView.textview_email.text=email
            this.pos=position

        }
    }

    //        fun bind(data: com.example.jetpacksessionexercise1.User) {
//            binding.user = data
//            //binding.setVariable(BR.user,data)
//            binding.executePendingBindings()
//
//        }


}



