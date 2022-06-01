package com.example.abcbook.letteractivity

import android.os.Bundle


class LLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(MLetterActivity::class.java)
    }
}