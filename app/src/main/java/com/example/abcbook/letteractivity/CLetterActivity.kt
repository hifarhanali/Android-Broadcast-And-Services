package com.example.abcbook.letteractivity

import android.os.Bundle


class CLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.setNextButtonClickListener(DLetterActivity::class.java)
    }
}