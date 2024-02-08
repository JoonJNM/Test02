package com.example.test02

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    // ประกาศตัวแปรของปุ่ม
    private lateinit var button1: Button
    private lateinit var button2: Button
    private lateinit var button3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // กำหนดค่าให้กับตัวแปรของปุ่ม
        button1 = findViewById(R.id.quizapp)
        button2 = findViewById(R.id.calculator)
        button3 = findViewById(R.id.login)

        // กำหนดการทำงานเมื่อปุ่มถูกคลิก
        button1.setOnClickListener {
            openProject("com.example.ez04", "com.example.ez04.MainActivity")
        }
        button2.setOnClickListener {
            openProject("com.example.calculator", "com.example.calculator.MainActivity")
        }
        button3.setOnClickListener {
            openProject("com.example.login_register002", "com.example.login_register002.Login")
        }

    }


    // เปิดโปรเจคด้วยชื่อแพ็คเกจ
    private fun openProject(packageName: String, activityName: String) {
        val intent = Intent()
        intent.setClassName(packageName, activityName)
        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        } else {
            // แสดงข้อความว่าไม่พบแอปพลิเคชันหรือกิจกรรม
            // เพิ่มการแสดงข้อความแจ้งเตือนหรือการทำงานอื่นๆ ตามต้องการ
        }
    }


}