package com.hugorafaelcosta.lojavirtual

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heinrichreimersoftware.materialintro.app.IntroActivity
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide

class Slides : IntroActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_slides)

        addSlide(
            SimpleSlide.Builder()
                .background(R.color.roxo)
                .image(R.drawable.drawer)
                .title("Loja Online de Calçados")
                .description("Entre e confira as promoções que preparamos para você!")
                .build()
        )

        addSlide(
            SimpleSlide.Builder()
                .background(R.color.AV)
                .title("Crie uma conta Grátis")
                .description("Cadastre-se agora mesmos! E venha conhecer os nossos produtos.")
                .build()
        )
    }
}