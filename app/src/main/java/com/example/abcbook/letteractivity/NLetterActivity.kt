package com.example.abcbook.letteractivity

import android.os.Bundle


class NLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(OLetterActivity::class.java)
    }
}