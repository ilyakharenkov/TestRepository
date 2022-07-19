package com.github.fitappproject.presentation.fragments

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.github.fitappproject.R

class FragmentManager {
    fun nextFragment(activity: AppCompatActivity, newFragment: Fragment){
        activity.supportFragmentManager
            .beginTransaction()
            .replace(R.id.holderFragment, newFragment)
            .commit()
    }
}