package com.tapmobile.tapyoutube.core.platorm

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commitNow
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
abstract class BaseActivity : AppCompatActivity() {

    abstract val fragmentContainerView: FragmentContainerView

    protected fun addFragment(savedInstanceState: Bundle?, fragment: Fragment) =
        savedInstanceState ?: supportFragmentManager.commitNow {
            replace(fragmentContainerView.id, fragment)
        }

}
