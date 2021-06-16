package app.harneblaze.termiimessagelibrary.data

import java.math.BigDecimal


class TermiiDtoRequest(builder:Builder){
    private val to:String = builder.to
    private val from:String = builder.from
    private val sms:String = builder.sms
    private val type:String = builder.type
    private val channel:String = builder.channel
    private val api_key:String = builder.api_key
    private val media:MediaDto? = builder.media


    class Builder(var api_key: String, var to: String, var from: String, var sms: String, var type: String
    ,var channel: String){
        var media: MediaDto? = null

        fun setMedia(media: MediaDto): Builder {
            this.media = media
            return this
        }
    }
}

/*data class TermiiDto(val to:String, val from:String, val sms:String, val type:String, val channel:String, val api_key:String,
val media:MediaDto? = null)*/

data class MediaDto(val url:String? = null, val caption:String? = null)

data class TermiiResponse(val message_id:String, val message:String, val balance:BigDecimal, val user:String)