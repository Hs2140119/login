package org.techtown.myapplication4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    val adminID = "admin"
    val adminPw = "1234admin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn.setOnClickListener {
            val id = idEdt.text.toString()
            val pw = pwEdt.text.toString()

            if( id.equals("") || pw. equals("") ){
                Toast.makeText(this,"id 또는 pw 공백", Toast.LENGTH_SHORT).show()
            }else{

                //DB 접속하여 id,pw 맞나 화인
                //맞으면 통과, 틀리면 되돌아가기
                if (id.equals(adminID) && pw.equals(adminPw) ){
                    val intent = Intent(this@LoginActivity, MainActivity::class.java)
                    startActivity(intent)
                }else{
                    Toast.makeText(this,"id 또는 pw 오류", Toast.LENGTH_SHORT).show()
                }
            }
        }

        joinBtn.setOnClickListener {
            val intent = Intent(this@LoginActivity, JoinActivity::class.java)
            startActivity(intent)
        }
    }
}