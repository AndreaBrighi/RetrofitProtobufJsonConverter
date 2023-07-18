# RetrofitProtobufJsonConverter

[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=AndreaBrighi_RetrofitProtobufJsonConverter&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=project=AndreaBrighi_RetrofitProtobufJsonConverter)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=AndreaBrighi_RetrofitProtobufJsonConverter&metric=bugs)](https://sonarcloud.io/summary/new_code?id=project=AndreaBrighi_RetrofitProtobufJsonConverter)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=AndreaBrighi_RetrofitProtobufJsonConverter&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=AndreaBrighi_RetrofitProtobufJsonConverter)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=AndreaBrighi_RetrofitProtobufJsonConverter&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=AndreaBrighi_RetrofitProtobufJsonConverter)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=AndreaBrighi_RetrofitProtobufJsonConverter&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=project=AndreaBrighi_RetrofitProtobufJsonConverter)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=AndreaBrighi_RetrofitProtobufJsonConverter&metric=ncloc)](https://sonarcloud.io/summary/new_code?id=AndreaBrighi_RetrofitProtobufJsonConverter)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=AndreaBrighi_RetrofitProtobufJsonConverter&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=project=AndreaBrighi_RetrofitProtobufJsonConverter)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=AndreaBrighi_RetrofitProtobufJsonConverter&metric=reliability_rating)](https://sonarcloud.io/summary/new_code?id=project=AndreaBrighi_RetrofitProtobufJsonConverter)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=AndreaBrighi_RetrofitProtobufJsonConverter&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=project=AndreaBrighi_RetrofitProtobufJsonConverter)

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
