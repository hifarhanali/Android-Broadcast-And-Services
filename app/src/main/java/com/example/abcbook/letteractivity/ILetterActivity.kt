package com.example.abcbook.letteractivity

import android.os.Bundle


class ILetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(JLetterActivity::class.java)
    }
}