package com.ahmetbostanciklioglu.extensiondatapassinfragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

fun AppCompatActivity.replaceActivityWithFragment(fragment: Fragment, args: Bundle? = null) {

    args?.let {
        fragment.arguments = args
    }

    supportFragmentManager.activityToFragmentTransaction {
        replace(
            R.id.fragment_container_view,
        fragment
        ).addToBackStack(fragment.javaClass.name)
    }
}

fun androidx.fragment.app.FragmentManager.activityToFragmentTransaction(param: FragmentTransaction.() -> FragmentTransaction) {
    beginTransaction().param().commit()
}