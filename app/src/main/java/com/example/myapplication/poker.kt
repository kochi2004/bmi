package com.example.myapplication

fun main() {
    val deck=mutableListOf<Int>()
    for(i in 0..51)
    {
        deck.add(i)
        if(i%13  ==0 && i !=0)println()

        var a=i/13
        var t="S"
        if (a==0){
            t="C"
        }else if(a==1)
        {
            t="D"
        } else if(a==2)
        {
            t="H"
        }

        print("${(i%13)+1}$t ")
    }
}