package io.github.manuelernesto.coderswag.Model

class Category constructor(val title: String, val image: String){
    override fun toString(): String {
        return this.title
    }
}