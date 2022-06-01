package com.example.abcbook.letteractivity

import android.os.Bundle


class SLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(TLetterActivity::class.java)
    }
}