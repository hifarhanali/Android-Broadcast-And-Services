package com.example.abcbook.letteractivity

import android.os.Bundle


class YLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(ZLetterActivity::class.java)
    }
}