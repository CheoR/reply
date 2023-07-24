package com.example.reply.data

import androidx.annotation.StringRes

/**
 * Data class represents an Email
 */
data class Email(
    /** Unique email ID**/
    val id: Long,
    /** Email sender **/
    val sender: Account,
    /** Email recipient(s) **/
    val recipients: List<Account> = emptyList(),
    /** Email title **/
    @StringRes val subject: Int = -1,
    /** Email content **/
    @StringRes val body: Int = -1,
    /** Email box location **/
    var mailbox: MailboxType = MailboxType.Inbox,
    /**
     * Relative duration in which it was created. (e.g. 20 mins ago)
     * It should be calculated from relative time in the future.
     * For now it's hard coded to a [String] value.
     */
    var createdAt: Int = -1
)
