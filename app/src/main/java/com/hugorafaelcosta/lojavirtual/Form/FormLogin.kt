package com.hugorafaelcosta.lojavirtual.Form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hugorafaelcosta.lojavirtual.R
import kotlinx.android.synthetic.main.activity_form_login.*

class FormLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form_login)

        supportActionBar!!.hide()

        text_tela_cadastro.setOnClickListener{
            var intent = Intent(this,FormCadastro::class.java)
            startActivity(intent)
        }
    }
}