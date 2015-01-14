import rx.apache.http.ObservableHttp;
import rx.Observable;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.nio.client.methods.HttpAsyncMethods;

public class AsyncHttpJava {

  public Observable<String> getBody(String url) {
    CloseableAsyncHttpClient client = HttpAsyncClients.createDefault();
    client.start();
    return ObservableHttp.createREquest(HttpAsyncMethods.createGet(url, httpClient)
          .toObservable()
          .flatMap((r) -> {
            r.getContent().map(String::new)
          });
  }
  
  public static void main(String... args) {
    getBody("http://www.wikipedia.com").subscribe((body) -> System.out.println(body));
  }
}
