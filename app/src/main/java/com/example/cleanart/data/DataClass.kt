package com.example.cleanart.data

import com.fasterxml.jackson.annotation.JsonProperty

data class DataClass(   val status: String,
                        val message: String? = null,
                        val data: List<categories>
)

data class categories (
    val id: Long,
    val name: String,
    val thumbnail: String,
    val order: Long,
    @JsonProperty("is_active")
    val isActive: Boolean,
    @JsonProperty("created_at")
    val createdAt: String,
    @JsonProperty("updated_at")
    val updatedAt: String,
)


