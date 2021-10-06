package br.com.ipets.app.presentation.di

import br.com.ipets.app.presentation.login.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val mainModule = module {
    viewModel {
        LoginViewModel()
    }
}