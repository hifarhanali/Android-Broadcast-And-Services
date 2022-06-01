package com.example.abcbook.letteractivity

import android.os.Bundle


class QLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(RLetterActivity::class.java)
    }
}