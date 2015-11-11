package com.typesafe.config

import java.time.Duration
import java.util.concurrent.TimeUnit

fun Config.any(path: String): Any? {
    if (hasPath(path)) return getAnyRef(path)
    else               return null
}

fun Config.anyList(path: String): List<Any>? {
    if (hasPath(path)) return getAnyRefList(path)
    else               return null
}

fun Config.boolean(path: String): Boolean? {
    if (hasPath(path)) return getBoolean(path)
    else               return null
}

fun Config.booleanList(path: String): List<Boolean>? {
    if (hasPath(path)) return getBooleanList(path)
    else               return null
}

fun Config.bytes(path: String): Long? {
    if (hasPath(path)) return getBytes(path)
    else               return null
}

fun Config.bytesList(path: String): List<Long>? {
    if (hasPath(path)) return getBytesList(path)
    else               return null
}

fun Config.config(path: String): Config? {
    if (hasPath(path)) return getConfig(path)
    else               return null
}

fun Config.double(path: String): Double? {
    if (hasPath(path)) return getDouble(path)
    else               return null
}

fun Config.doubleList(path: String): List<Double>? {
    if (hasPath(path)) return getDoubleList(path)
    else               return null
}

fun Config.duration(path: String): Duration? {
    if (hasPath(path)) return getDuration(path)
    else               return null
}

fun Config.duration(path: String, unit: TimeUnit): Long? {
    if (hasPath(path)) return getDuration(path, unit)
    else               return null
}

fun Config.durationList(path: String): List<Duration>? {
    if (hasPath(path)) return getDurationList(path)
    else               return null
}

fun Config.durationList(path: String, unit: TimeUnit): List<Long>? {
    if (hasPath(path)) return getDurationList(path, unit)
    else               return null
}

fun Config.int(path: String): Int? {
    if (hasPath(path)) return getInt(path)
    else               return null
}

fun Config.intList(path: String): List<Int>? {
    if (hasPath(path)) return getIntList(path)
    else               return null
}

fun Config.long(path: String): Long? {
    if (hasPath(path)) return getLong(path)
    else               return null
}

fun Config.longList(path: String): List<Long>? {
    if (hasPath(path)) return getLongList(path)
    else               return null
}

fun Config.memorySize(path: String): ConfigMemorySize? {
    if (hasPath(path)) return getMemorySize(path)
    else               return null
}

fun Config.memorySizeList(path: String): List<ConfigMemorySize>? {
    if (hasPath(path)) return getMemorySizeList(path)
    else               return null
}

fun Config.number(path: String): Number? {
    if (hasPath(path)) return getNumber(path)
    else               return null
}

fun Config.numberList(path: String): List<Number>? {
    if (hasPath(path)) return getNumberList(path)
    else               return null
}

fun Config.obj(path: String): ConfigObject? {
    if (hasPath(path)) return getObject(path)
    else               return null
}

fun Config.objectList(path: String): List<ConfigObject>? {
    if (hasPath(path)) return getObjectList(path)
    else               return null
}

fun Config.string(path: String): String? {
    if (hasPath(path)) return getString(path)
    else               return null
}

fun Config.stringList(path: String): List<String>? {
    if (hasPath(path)) return getStringList(path)
    else               return null
}

fun Config.value(path: String): ConfigValue? {
    if (hasPath(path)) return getValue(path)
    else               return null
}

