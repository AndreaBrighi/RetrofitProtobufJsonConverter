package io.github.andreabrighi.converter

import com.google.protobuf.GeneratedMessageV3
import com.google.protobuf.MessageOrBuilder
import com.google.protobuf.util.JsonFormat
import okhttp3.MediaType
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Converter
import retrofit2.Retrofit
import java.lang.reflect.Type

class RetrofitJsonConverterFactory private constructor() : Converter.Factory() {

    override fun responseBodyConverter(
        type: Type,
        annotations: Array<Annotation>,
        retrofit: Retrofit,
    ): Converter<ResponseBody, *> {
        return Converter<ResponseBody, Any> { value ->
            val structBuilder = (type as Class<*>).getMethod("newBuilder").invoke(null) as GeneratedMessageV3.Builder<*>
            JsonFormat.parser().ignoringUnknownFields().merge(value.string(), structBuilder)
            structBuilder.build() as MessageOrBuilder
        }
    }

    override fun requestBodyConverter(
        type: Type,
        parameterAnnotations: Array<Annotation>,
        methodAnnotations: Array<Annotation>,
        retrofit: Retrofit,
    ): Converter<*, RequestBody> {
        return Converter<Any, RequestBody> { value ->
            RequestBody.create(
                MediaType.parse("application/json; charset=utf-8"),
                JsonFormat.printer().print(value as MessageOrBuilder),
            )
        }
    }

    companion object {
        fun create(): RetrofitJsonConverterFactory {
            return RetrofitJsonConverterFactory()
        }
    }
}
