package app.harneblaze.termiimessagelibrary.data

import java.math.BigDecimal

data class TermiiDto(val to:String, val from:String, val sms:String, val type:String, val channel:String, val api_key:String,
val media:MediaDto? = null)

data class MediaDto(val url:String? = null, val caption:String? = null)

data class TermiiResponse(val message_id:String, val message:String, val balance:BigDecimal, val user:String)