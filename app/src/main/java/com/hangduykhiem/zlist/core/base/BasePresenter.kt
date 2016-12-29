package com.hangduykhiem.zlist.core.base

import android.support.annotation.CallSuper
import rx.Subscription
import rx.subscriptions.CompositeSubscription

/**
 * Abstract presenter class in MVP, to be extended later
 *
 * Created by deank on 12/26/16.
 */
abstract class BasePresenter<T : BaseView> {

    var view: T? = null
    var subscriptions = CompositeSubscription()

    /**
     * Initialize method that is call when a BaseView implementation is created
     */
    abstract fun initialize()

    @CallSuper
    fun destroy() {
        unSubscribeSubscriptions()
    }

    fun addSubscription(subscription: Subscription) {
        subscriptions.add(subscription)
    }

    fun unSubscribeSubscriptions() {
        subscriptions.unsubscribe()
        subscriptions.clear()
    }

    fun hasSubscriptions(): Boolean {
        return subscriptions.hasSubscriptions()
    }

}
