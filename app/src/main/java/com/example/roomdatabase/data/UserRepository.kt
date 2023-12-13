package com.example.roomdatabase.data

import androidx.lifecycle.LiveData


class UserRepository(private val userDao: UserDao) {
//Abstracts access to mulitple datasources
// not a part of archiecture Components Libraries,
//but suggested best practise for code seperation and architecture

    val readAllData :LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user:User){
        userDao.addUser(user)
    }






}