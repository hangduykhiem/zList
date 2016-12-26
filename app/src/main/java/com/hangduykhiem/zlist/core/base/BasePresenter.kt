package com.hangduykhiem.zlist.core.base

/**
 * Abstract presenter class in MVP, to be extended later
 *
 * Created by deank on 12/26/16.
 */
abstract class BasePresenter<T>(var view: T?){

    abstract fun initialize()
}