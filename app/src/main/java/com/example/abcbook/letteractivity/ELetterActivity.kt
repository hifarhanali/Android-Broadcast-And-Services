package com.example.abcbook.letteractivity

import android.os.Bundle


class ELetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(FLetterActivity::class.java)
    }
}