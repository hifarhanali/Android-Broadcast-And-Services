package com.example.abcbook.letteractivity

import android.os.Bundle


class RLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(SLetterActivity::class.java)
    }
}