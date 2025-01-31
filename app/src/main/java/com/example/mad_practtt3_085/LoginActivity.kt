package com.example.mad_practtt3_085
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mad_practtt3_085.R

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState:
                        Bundle?) { super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContentView(R.layout.activity_login)
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets -> val systemBars =
        insets.getInsets(WindowInsetsCompat.Type.systemBars())
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
        insets
    }
    val displayName=findViewById<TextView>(R.id.display_name)
    val username=intent.getStringExtra("username")
    val textname= "hello $username"
    displayName.text = textname
}
}