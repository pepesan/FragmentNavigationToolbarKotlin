package com.example.myapplication

import android.view.Menu
import androidx.fragment.app.Fragment

open class AppFragment: Fragment() {
    override fun onPrepareOptionsMenu(menu: Menu){
        super.onPrepareOptionsMenu(menu)
        var item = menu.findItem(R.id.action_settings)
        item.isVisible = false
        item = menu.findItem(R.id.action_main_segundo)
        item.isVisible = false
    }
}