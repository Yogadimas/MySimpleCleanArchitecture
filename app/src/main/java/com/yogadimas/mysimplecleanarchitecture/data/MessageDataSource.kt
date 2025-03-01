package com.yogadimas.mysimplecleanarchitecture.data

import com.yogadimas.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) =
        MessageEntity("Hello $name! Welcome to Clean Architecture")
}