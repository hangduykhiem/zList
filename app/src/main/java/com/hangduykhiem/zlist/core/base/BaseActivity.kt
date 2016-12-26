package com.hangduykhiem.zlist.core.base

import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.CallSuper
import android.support.v7.app.AppCompatActivity
import android.view.View

/**
 * Base activity of the appliation, to be extended later

 * Created by deank on 12/26/16.
 */

abstract class BaseActivity<T: BaseView, out V:BasePresenter<T>> : AppCompatActivity(){



    @CallSuper
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        var v = inflateActivityView()
    }

    abstract fun inflateActivityView(): View

    abstract fun getPresenter(): V
}