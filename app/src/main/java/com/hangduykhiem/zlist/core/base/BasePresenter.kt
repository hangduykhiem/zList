package com.hangduykhiem.zlist.core.base

/**
 * Abstract presenter class in MVP, to be extended later
 *
 * Created by deank on 12/26/16.
 */
abstract class BasePresenter<T: BaseView>(){

    var view: T? = null

    /**
     * Initialize method that is call when a BaseView implementation is created
     */
    abstract fun initialize()
}