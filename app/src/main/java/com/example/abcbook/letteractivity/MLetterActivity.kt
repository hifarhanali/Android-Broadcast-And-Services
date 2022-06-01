package com.example.abcbook.letteractivity

import android.os.Bundle


class MLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(NLetterActivity::class.java)
    }
}