package com.hugorafaelcosta.lojavirtual

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heinrichreimersoftware.materialintro.app.IntroActivity
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide
import com.hugorafaelcosta.lojavirtual.Form.FormLogin

class Slides : IntroActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_slides)

        isButtonBackVisible = false
        isButtonNextVisible=false

        addSlide(
            SimpleSlide.Builder()
                .background(R.color.roxo)
                .image(R.drawable.drawer)
                .backgroundDark(R.color.white)
                .title("Loja Online de Calçados")
                .description("Entre e confira as promoções que preparamos para você!")
                .build()

        )

        addSlide(
            SimpleSlide.Builder()
                .background(R.color.AV)
                .canGoBackward(false)
                .title("Crie uma conta Grátis")
                .description("Cadastre-se agora mesmos! E venha conhecer os nossos produtos.")
                .build()
        )
    }

    override fun onDestroy() {
        super.onDestroy()

        var intent=Intent(this, FormLogin::class.java)
        startActivity(intent)
        finish()
    }
}