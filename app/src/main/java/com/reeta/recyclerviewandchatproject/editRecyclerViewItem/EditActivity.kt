package com.reeta.recyclerviewandchatproject.editRecyclerViewItem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.reeta.recyclerviewandchatproject.R
import kotlinx.android.synthetic.main.activity_edit.*


class EditActivity : AppCompatActivity(),ItemClickListner {
    var list=ArrayList<Student>()
    lateinit var studentAdapter: StudentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        buildData()
        sendData()
    }

    private fun sendData() {
        studentAdapter= StudentAdapter(list,this)
        var linearLayoutManager=LinearLayoutManager(this)
        recylerView.apply {
            adapter=studentAdapter
            layoutManager=linearLayoutManager
        }
    }

    private fun buildData() {
        for (i in 1..4) {
            list.add(Student("reeta Thakur", "Bina mp"))
            list.add(Student("Deeksha Kumari", "Bina mp"))
            list.add(Student("ruchi Thakur", "Bina mp"))
            list.add(Student("rani Thakur", "Bina mp"))
            list.add(Student("priyanka Thakur", "Bina mp"))
            list.add(Student("rajkumari Thakur", "Bina mp"))
            list.add(Student("rachana Thakur", "Bina mp"))
            list.add(Student("guddi Thakur", "Bina mp"))
            list.add(Student("Shailee Shir", "Bina mp"))
            list.add(Student("sapna Thakur", "Bina mp"))
            list.add(Student("ritu Thakur", "Bina mp"))
            list.add(Student("rupali Thakur", "Bina mp"))
            list.add(Student("rahul Thakur", "Bina mp"))
            list.add(Student("rohit Thakur", "Bina mp"))
        }

    }

    override fun clickForEdit(student: Student, postion: Int) {
        cardView.visibility = View.VISIBLE
        edtName.setText(student.name)
        edtAddress.setText(student.address)
        btnEditDetails.setOnClickListener {
            var name=edtName.text
            var address=edtAddress.text
            student.name=name.toString()
            student.address=address.toString()
            studentAdapter.notifyItemChanged(postion)
          //  list.set(postion,)
            cardView.visibility=View.GONE

        }

    }
}