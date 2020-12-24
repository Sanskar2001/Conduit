import com.san22.api.Client
import com.san22.api.model.ArticlesResponse
import junit.framework.Assert.assertNotNull
import kotlinx.coroutines.runBlocking

import org.junit.Test
import retrofit2.Callback

class client_Test {

    @Test
    fun getArticles()
    {        runBlocking { val articles=Client.api.fetchArticles();
        assertNotNull(articles.body()?.articles) }
        
        
    }
}