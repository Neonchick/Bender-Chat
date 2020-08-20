package ru.skillbranch.devintensive.extensions

import java.lang.StringBuilder

fun String.truncate(length: Int = 16):String
{
    var ans = this.trim()
    if (ans.length <=length)
        return ans
    return "${ans.substring(0, length).trim()}..."
}