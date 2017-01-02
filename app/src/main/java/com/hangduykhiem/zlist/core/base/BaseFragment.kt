package com.hangduykhiem.zlist.core.base

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import butterknife.ButterKnife

/**
 * Base [Fragment] for the application, to be extended later
 *
 * Created by deank on 12/26/16.
 */
abstract class BaseFragment<T: BaseView, out V:BasePresenter<T>> : Fragment() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        injectDependencies()
        Log.d("BaseActivity", "onCreate")
        val p = getPresenter()
        setPresenterView()
        p.initialize()
        onFragmentInitialized()
        val v = inflater!!.inflate(getMainViewId(), container, false)
        ButterKnife.bind(this, v)
        return v
    }

    /**
     * Override to provide the Presenter with view.
     * This method is call before the presenter.initialize()
     */
    abstract fun setPresenterView(): Unit

    /**
     * Get main view Id, to be inflate in the onCreate method
     */
    abstract fun getMainViewId(): Int

    /**
     * Return the presenter, to be initialize during onCreate
     * This presenter should be injected to the activity in the implementation
     */
    abstract fun getPresenter(): V

    /**
     * This method is called after onCreate
     */
    abstract fun onFragmentInitialized(): Unit

    /**
     * Method to inject dependencies. Is also called in onCreate() method
     */
    abstract fun injectDependencies(): Unit}
