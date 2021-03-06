package com.jshvarts.mosbymvp.domain

import io.reactivex.Single

interface GitbhubDataStore {
    fun loadRepos(login: String): Single<List<GithubRepo>>
    fun loadRepo(login: String, repoName: String): Single<GithubRepo>
}