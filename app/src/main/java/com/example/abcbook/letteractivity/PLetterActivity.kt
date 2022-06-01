package com.example.abcbook.letteractivity

import android.os.Bundle


class PLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(QLetterActivity::class.java)
    }
}