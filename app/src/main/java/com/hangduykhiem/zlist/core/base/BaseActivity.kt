package com.hangduykhiem.zlist.core.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity
import android.util.Log
import butterknife.ButterKnife

/**
 * Base activity of the application, to be extended later

 * Created by deank on 12/26/16.
 */

abstract class BaseActivity<T: BaseView, out V:BasePresenter<T>> : AppCompatActivity(){

    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        injectDependencies()
        Log.d("BaseActivity", "onCreate")
        setContentView(getMainViewId())
        val p = getPresenter()
        setPresenterView()
        p.initialize()
        ButterKnife.bind(this)
        onActivityInitialized()
    }

    @CallSuper
    override fun onDestroy() {
        // unSubscribe all subscription in the presenter
        getPresenter().destroy()
        super.onDestroy()
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
    abstract fun onActivityInitialized(): Unit

    /**
     * Method to inject dependencies. Is also called in onCreate() method
     */
    abstract fun injectDependencies(): Unit
}
