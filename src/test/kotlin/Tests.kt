import io.kotest.core.spec.style.StringSpec

class Tests : StringSpec({

    val quotesApi: TestApi = RetrofitHelper.getInstance().create(TestApi::class.java)

    "send get to server and receive response" {
        val response = quotesApi.getTest().execute()
        assert(response.isSuccessful)
        assert(response.body()!!.id == 1L)
        assert(response.body()!!.userId == 26L)
        assert(response.body()!!.completed)
        assert(response.body()!!.todo == "Do something nice for someone I care about")
    }

    "send get to server and receive response multipleItem" {
        val response = quotesApi.getTests().execute()
        assert(response.isSuccessful)
        assert(response.body()!!.todosList[0].id == 1L)
        assert(response.body()!!.todosList[0].userId == 26L)
        assert(response.body()!!.todosList[0].completed)
        assert(response.body()!!.todosList[0].todo == "Do something nice for someone I care about")
    }

    "send post to server and receive response" {
        val response = quotesApi.sendTest(
            tutorial.TodoOuterClass.Todo.newBuilder()
                .setId(1)
                .setUserId(26)
                .setCompleted(true)
                .setTodo("Test todo")
                .build(),
        ).execute()
        assert(response.isSuccessful)
        assert(response.body()!!.userId == 26L)
        assert(response.body()!!.completed)
        assert(response.body()!!.todo == "Test todo")
    }

    "send wrong request to server" {
        val response = quotesApi.getTestsWrong().execute()
        assert(!response.isSuccessful)
        assert(response.errorBody()!!.string() == "not found!")
    }
})
