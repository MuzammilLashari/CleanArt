package com.example.cleanart.data

import com.fasterxml.jackson.annotation.JsonProperty

data class AnimationDataClass(
    val status: String,
    val message: Any?,
    val data: List<AnimationList>,
)

data class AnimationList(
    val name: String,
    @JsonProperty("animation_file")
    val animationFile: String?,
    @JsonProperty("background_color")
    val backgroundColor: String,
    @JsonProperty("text_color")
    val textColor: String,
    @JsonProperty("text_gravity")
    val textGravity: Long,
    @JsonProperty("is_premium")
    val isPremium: Boolean,
    val category: AnimationCategory,
    @JsonProperty("applied_count")
    val appliedCount: Long,
    @JsonProperty("is_active")
    val isActive: Boolean,
    @JsonProperty("created_at")
    val createdAt: String,
    @JsonProperty("updated_at")
    val updatedAt: String,
    val url: String?,
    val thumbnail: String?,
)

data class AnimationCategory(
    val name: String,
    val id: Long,
)
