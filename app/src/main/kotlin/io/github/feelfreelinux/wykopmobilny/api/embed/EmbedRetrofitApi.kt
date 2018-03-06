package io.github.feelfreelinux.wykopmobilny.api.embed

import io.github.feelfreelinux.wykopmobilny.api.REMOVE_USERKEY_HEADER
import io.github.feelfreelinux.wykopmobilny.models.pojo.apiv2.embed.Gfycat
import io.github.feelfreelinux.wykopmobilny.models.pojo.apiv2.embed.Streamable
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

interface EmbedRetrofitApi {
    @Headers("@: ${REMOVE_USERKEY_HEADER}")
    @GET("https://api.gfycat.com/v1/gfycats/{gfycatId}")
    fun getGfycat(@Path("gfycatId") gfycatItem : String) : Single<Gfycat>

    @Headers("@: $REMOVE_USERKEY_HEADER")
    @GET("https://api.streamable.com/videos/{streamableId}")
    fun getStreamableFile(@Path("streamableId") streamableId : String) : Single<Streamable>
}