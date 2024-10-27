package it.vfsfitvnm.innertube.models

import kotlinx.serialization.Serializable

@Serializable
data class Context(
    val client: Client,
    val thirdParty: ThirdParty? = null,
) {
    @Serializable
    data class Client(
        val clientName: String,
        val clientVersion: String,
        val platform: String? = null,
        val hl: String = "en",
        val visitorData: String = "CgtEUlRINDFjdm1YayjX1pSaBg%3D%3D",
        val androidSdkVersion: Int? = null,
        val userAgent: String? = null
    )

    @Serializable
    data class ThirdParty(
        val embedUrl: String,
    )

    companion object {
        val DefaultWeb = Context(
            client = Client(
                clientName = "WEB_REMIX",
                clientVersion = "1.20220918",
                platform = "DESKTOP",
            )
        )

        val DefaultIOS = Context(
            client = Client(
                clientName = "IOS",
                clientVersion = "19.29.1",
                userAgent = "com.google.ios.youtube/19.29.1 (iPhone16,2; U; CPU iOS 17_5_1 like Mac OS X;)"
            )
        )

        val DefaultAndroid = Context(
            client = Client(
                clientName = "ANDROID_MUSIC",
                clientVersion = "5.28.1",
                platform = "MOBILE",
                androidSdkVersion = 30,
                userAgent = "com.google.android.apps.youtube.music/5.28.1 (Linux; U; Android 11) gzip"
            )
        )

        val DefaultAgeRestrictionBypass = Context(
            client = Client(
                clientName = "TVHTML5_SIMPLY_EMBEDDED_PLAYER",
                clientVersion = "2.0",
                platform = "TV"
            )
        )
    }
}
