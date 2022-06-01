package com.example.abcbook.letteractivity

import android.os.Bundle


class WLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(XLetterActivity::class.java)
    }
}