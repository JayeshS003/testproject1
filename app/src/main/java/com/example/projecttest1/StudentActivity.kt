package com.example.projecttest1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class StudentActivity : AppCompatActivity() {

    internal lateinit var registerattendance: Button
    internal lateinit var todayattendance: Button
    internal lateinit var studentattendance: Button
    internal lateinit var btnLogout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)

        registerattendance = findViewById<View>(R.id.reg_attendance) as Button
        todayattendance = findViewById<View>(R.id.today_attendance) as Button
        studentattendance = findViewById<View>(R.id.student_attendance) as Button
        btnLogout = findViewById<View>(R.id.btnLogout) as Button

        // register student's own attendance button
        registerattendance.setOnClickListener {
            // TODO Auto-generated method stub
            val intent = Intent(this, RegisterAttendanceActivity::class.java)
            startActivity(intent)
        }

        // today's attendance button
        todayattendance.setOnClickListener {
            // TODO Auto-generated method stub
            val intent = Intent(this, TodayAttendanceActivity::class.java)
            startActivity(intent)
        }

        // check your own attendance button
        studentattendance.setOnClickListener {
            // TODO Auto-generated method stub
            val intent = Intent(this, StudentAttendanceActivity::class.java)
            startActivity(intent)
        }

        // logout button
        btnLogout.setOnClickListener {
            // TODO Auto-generated method stub
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
