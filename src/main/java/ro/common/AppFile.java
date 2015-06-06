package ro.common;

import java.io.Serializable;

/**
 * Created by diana on 06.06.2015.
 */
public class AppFile implements Serializable{
    String url;
    byte[] content;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public AppFile(String url, byte[] content) {
        this.url = url;
        this.content = content;
    }
}
