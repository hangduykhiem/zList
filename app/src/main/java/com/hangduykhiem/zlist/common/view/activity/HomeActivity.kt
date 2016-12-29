package com.hangduykhiem.zlist.common.view.activity

import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.design.widget.TabLayout
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem
import com.hangduykhiem.zlist.R
import com.hangduykhiem.zlist.ZListApplication
import com.hangduykhiem.zlist.core.base.BaseActivity
import com.hangduykhiem.zlist.common.presenter.HomeActivityPresenter
import com.hangduykhiem.zlist.common.view.adapter.HomeViewPagerAdapter
import javax.inject.Inject

/**
 * Main activity for the application
 *
 *
 * Created by hduykhiem on 17/12/2016.
 */
class HomeActivity : BaseActivity<HomeActivityView, HomeActivityPresenter>(), HomeActivityView {

    @Inject
    internal lateinit var homeActivityPresenter: HomeActivityPresenter

    /**
     * The [android.support.v4.view.PagerAdapter] that will provide fragments for each of the
     * sections. We use a [FragmentPagerAdapter] derivative, which will keep every loaded
     * fragment in memory. If this becomes too memory intensive, it may be best to switch to a
     * [android.support.v4.app.FragmentStatePagerAdapter].
     */
    private var homeViewPagerAdapter: HomeViewPagerAdapter? = null

    /**
     * The [ViewPager] that will host the section contents.
     */
    private var viewPager: ViewPager? = null

    override fun injectDependencies() {
        ZListApplication.ZListApplication.applicationComponent.inject(this)
    }

    override fun onActivityInitialized() {
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        homeViewPagerAdapter = HomeViewPagerAdapter(supportFragmentManager, applicationContext)

        // Set up the ViewPager with the sections adapter.
        viewPager = findViewById(R.id.container) as ViewPager
        viewPager!!.adapter = homeViewPagerAdapter

        val tabLayout = findViewById(R.id.tabs) as TabLayout
        tabLayout.setupWithViewPager(viewPager)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_home, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        if (id == R.id.action_settings) {
            return true
        }

        return super.onOptionsItemSelected(item)
    }

    override fun setPresenterView() {
        homeActivityPresenter.view = this
    }

    override fun getMainViewId(): Int {
        return R.layout.activity_home
    }

    override fun getPresenter(): HomeActivityPresenter {
        return homeActivityPresenter
    }



}
