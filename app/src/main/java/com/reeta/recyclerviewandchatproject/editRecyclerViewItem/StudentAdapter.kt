package com.reeta.recyclerviewandchatproject.editRecyclerViewItem

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.reeta.recyclerviewandchatproject.R

class StudentAdapter(var list:ArrayList<Student>, val listner: ItemClickListner):RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {

    val TAG="reeta"
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        Log.d(TAG,"onCreateViewHolder")
        val view=LayoutInflater.from(parent.context).inflate(R.layout.student_details_layout,parent,false)
        return StudentViewHolder(view,listner)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        Log.d(TAG,"onBindViewHolder")
        val s_list=list[position]
        holder.setData(s_list)
    }

    override fun getItemCount(): Int {
        Log.d(TAG,"getItemCount")
        return list.size
    }

    //in activity say notifyDataSetChanged we can also do same work with this method also
    fun getUpdatedList(newList:ArrayList<Student>){
        list=newList
        notifyDataSetChanged()
    }

    inner  class StudentViewHolder(itemView:View,listner: ItemClickListner):RecyclerView.ViewHolder(itemView){
        var name:TextView=itemView.findViewById(R.id.tvName)
        var address:TextView=itemView.findViewById(R.id.tvAddress)
        var edit:ImageView=itemView.findViewById(R.id.editImage)
        fun setData(student: Student){
            Log.d(TAG,"view Holder")
            name.text=student.name
            address.text=student.address
            edit.setOnClickListener {
                listner.clickForEdit(student,adapterPosition)
            }
        }
    }
}