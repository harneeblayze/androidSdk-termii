package app.harneblaze.termiimessagelibrary.data

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface TermiiApi {

    companion object {
        const val BASE_URL = "https://termii.com/api"

    }



    @POST("/sms/send")
    suspend fun sendMessage(@Body request:TermiiDto): TermiiResponse

}