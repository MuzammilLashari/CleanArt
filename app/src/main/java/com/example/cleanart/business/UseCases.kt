package com.example.cleanart.business

import com.example.cleanart.data.RepoImp

class UseCases(val repoImp: RepoImp) {
        fun gettingCategory(){
            repoImp.gettingCategory()
        }
}