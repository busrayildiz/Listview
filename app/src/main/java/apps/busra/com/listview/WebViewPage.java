package apps.busra.com.listview;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.webkit.WebView;

import static apps.busra.com.listview.R.layout.webview;

/**
 * Created by lenovo on 11.6.2017.
 */

public class WebViewPage extends Activity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        Bundle bundle = getIntent().getExtras();
        String url = bundle.getString("url");

        WebView webView = (WebView) findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
    }
}
