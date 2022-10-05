package dev.quewui.profilecardlayout

val userProfileList = arrayListOf(
    UserProfile(
        name = "Darth Maul",
        status = true,
        drawableId = R.mipmap.ic_darth_maul_profile
    ),
    UserProfile(
        name = "Light Good",
        status = false,
        drawableId = R.mipmap.ic_darth_maul_profile
    ),
    UserProfile(
        name = "Darth Maul",
        status = true,
        drawableId = R.mipmap.ic_darth_maul_profile
    ),
    UserProfile(
        name = "Light Good",
        status = false,
        drawableId = R.mipmap.ic_darth_maul_profile
    ),
)

data class UserProfile(val name: String, val status: Boolean, val drawableId: Int)
