package com.example.abcbook.letteractivity

import android.os.Bundle


class TLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(ULetterActivity::class.java)
    }
}