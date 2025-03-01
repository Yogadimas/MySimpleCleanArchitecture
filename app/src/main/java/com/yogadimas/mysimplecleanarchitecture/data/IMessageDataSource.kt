package com.yogadimas.mysimplecleanarchitecture.data

import com.yogadimas.mysimplecleanarchitecture.domain.MessageEntity


interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}