import rx.apache.http.ObservableHttp;
import rx.Observable;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.nio.client.methods.HttpAsyncMethods;

public class AsyncHttp {

  public static Observable<String> getBody(String url, CloseableHttpAsyncClient client) {
    return ObservableHttp.createRequest(HttpAsyncMethods.createGet(url), client)
        .toObservable()
        .flatMap(r -> r.getContent().map(String::new));
  }

  public static void main(String... args) {
    CloseableHttpAsyncClient client = HttpAsyncClients.createDefault();
    client.start();
    getBody("http://www.wikipedia.com", client).subscribe((body) -> System.out.println(body));
  }
}
