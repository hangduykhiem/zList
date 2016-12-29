package com.hangduykhiem.zlist.common.view.adapter

import android.content.Context
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.hangduykhiem.zlist.R
import com.hangduykhiem.zlist.common.view.fragment.DailyFragment

/**
 * Fragment adapter for Home Activity
 *
 * Created by hduykhiem on 17/12/2016.
 */

class HomeViewPagerAdapter(fm: FragmentManager, var context: Context) : FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        return if (position == 1) {
            DailyFragment()
        } else if (position == 2) {
            DailyFragment()
        } else {
            DailyFragment()
        }
    }

    override fun getCount(): Int {
        // Show 3 total pages.
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> return context.resources.getString(R.string.f_d_title)
            1 -> return context.resources.getString(R.string.f_r_title)
            2 -> return context.resources.getString(R.string.f_g_title)
        }
        return null
    }
}
