package com.example.abcbook.letteractivity

import com.example.abcbook.R

data class Letter(val letter: Char, val word: String, val imageResource: Int)

object LettersData {
    fun getLetters() = listOf(
        Letter('A', "Apple", R.drawable.a_letter_image),
        Letter('B', "Ball", R.drawable.b_letter_image),
        Letter('C', "Cat", R.drawable.c_letter_image),
        Letter('D', "Dolphin", R.drawable.d_letter_image),
        Letter('E', "Elephant", R.drawable.e_letter_image),
        Letter('F', "Fish", R.drawable.f_letter_image),
        Letter('G', "Guitar", R.drawable.g_letter_image),
        Letter('H', "House", R.drawable.h_letter_image),
        Letter('I', "Ice Cream", R.drawable.i_letter_image),
        Letter('J', "Joker", R.drawable.j_letter_image),
        Letter('K', "King", R.drawable.k_letter_image),
        Letter('L', "Lion", R.drawable.l_letter_image),
        Letter('M', "Mountain", R.drawable.m_letter_image),
        Letter('N', "Numbers", R.drawable.n_letter_image),
        Letter('O', "Octopus", R.drawable.o_letter_image),
        Letter('P', "Parrot", R.drawable.p_letter_image),
        Letter('Q', "Queen", R.drawable.q_letter_image),
        Letter('R', "Rainbow", R.drawable.r_letter_image),
        Letter('S', "Spider Man", R.drawable.s_letter_image),
        Letter('T', "Tree", R.drawable.t_letter_image),
        Letter('U', "Umbrella", R.drawable.u_letter_image),
        Letter('V', "Van", R.drawable.v_letter_image),
        Letter('W', "Witch", R.drawable.w_letter_image),
        Letter('X', "X-ray", R.drawable.x_letter_image),
        Letter('Y', "Yoyo", R.drawable.y_letter_image),
        Letter('Z', "Zebra", R.drawable.z_letter_image)
    )
}
