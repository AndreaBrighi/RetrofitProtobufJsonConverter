# RetrofitProtobufJsonConverter
Factory for retrofit that can convert a Json request into a Protobuf class

## Usage
Import dependency
```kotlin
implementation("io.github.andreabrighi:RetrofitProtobufJsonConverter:1.0.0")
```

In code
```kotlin
Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(RetrofitJsonConverterFactory.create())
        .client(httpClient.build())
        .build()
```

