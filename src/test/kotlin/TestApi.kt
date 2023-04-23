import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import tutorial.TodoOuterClass.TodoList
import tutorial.TodoOuterClass.Todo

interface TestApi {

    @GET("/todos/1")
    fun getTest(): Call<Todo>

    @GET("/todos")
    fun getTests(): Call<TodoList>

    @GET("/tod")
    fun getTestsWrong(): Call<TodoList>

    @POST("/todos/add")
    fun sendTest(@Body test: Todo): Call<Todo>
}
