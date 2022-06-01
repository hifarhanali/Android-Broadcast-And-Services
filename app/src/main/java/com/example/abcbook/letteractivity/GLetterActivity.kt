package com.example.abcbook.letteractivity

import android.os.Bundle


class GLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(HLetterActivity::class.java)
    }
}