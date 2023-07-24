package com.example.reply.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Class represents account
 */
data class Account(
    /** Unique user ID **/
    val id: Long,
    @StringRes val firstName: Int,
    @StringRes val lastName: Int,
    @StringRes val email: Int,
    /** User's avatar image resource id **/
    @DrawableRes val avatar: Int
)
