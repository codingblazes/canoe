package com.canoe.telegram.models.messages

import com.canoe.telegram.models.Chat

case class MigratedFromGroup(messageId: Int, chat: Chat, date: Int,
                             migrateFromChatId: Long) extends TelegramMessage