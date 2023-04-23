import io.github.andreabrighi.converter.RetrofitJsonConverterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit

object RetrofitHelper {

    private const val baseUrl = "https://dummyjson.com/"

    fun getInstance(): Retrofit {
        val httpClient = OkHttpClient.Builder()
        return Retrofit
            .Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(RetrofitJsonConverterFactory.create())
            .client(httpClient.build())
            .build()
    }
}
