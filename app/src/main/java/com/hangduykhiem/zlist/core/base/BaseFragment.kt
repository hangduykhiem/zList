package com.hangduykhiem.zlist.core.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Base [Fragment] for the application, to be extended later
 *
 * Created by deank on 12/26/16.
 */
abstract class BaseFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val v = inflater!!.inflate(getMainViewId(), container, false)

        return v
    }

    abstract fun getMainViewId(): Int
}