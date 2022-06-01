package com.example.abcbook.letteractivity

import android.os.Bundle


class ULetterActivity : LetterActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        super.setNextButtonClickListener(VLetterActivity::class.java)
    }
}