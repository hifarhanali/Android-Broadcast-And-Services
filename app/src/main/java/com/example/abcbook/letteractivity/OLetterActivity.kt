package com.example.abcbook.letteractivity

import android.os.Bundle


class OLetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(PLetterActivity::class.java)
    }
}