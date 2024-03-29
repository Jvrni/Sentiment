package com.example.domain.general

abstract class BaseMapper<IN, OUT> {

    abstract fun transform(entity: IN): OUT

    fun transform(entities: List<IN>): List<OUT> {
        return entities.map(::transform)
    }
}