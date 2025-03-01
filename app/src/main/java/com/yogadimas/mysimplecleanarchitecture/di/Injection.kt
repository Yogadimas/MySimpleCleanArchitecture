package com.yogadimas.mysimplecleanarchitecture.di

import com.yogadimas.mysimplecleanarchitecture.data.IMessageDataSource
import com.yogadimas.mysimplecleanarchitecture.data.MessageDataSource
import com.yogadimas.mysimplecleanarchitecture.data.MessageRepository
import com.yogadimas.mysimplecleanarchitecture.domain.IMessageRepository
import com.yogadimas.mysimplecleanarchitecture.domain.MessageInteractor
import com.yogadimas.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}