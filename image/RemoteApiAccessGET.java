package com.guotion.api;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RemoteApiAccessGET extends RemoteApiAccess {
    public RemoteApiAccessGET() {
    }

    public String accessApi(String remoteURI, Map<String, String> params, String charset) throws Exception {
        String paramString = super.parseMapParam(params, charset);
        StringBuilder url = new StringBuilder(remoteURI);
        if(paramString.length() > 0) {
            url.append("?");
            url.append(paramString);
        }

        Object connection = null;

        String socketFactory1;
        try {
            if(!remoteURI.startsWith("https") && !remoteURI.startsWith("HTTPS")) {
                connection = (HttpURLConnection)(new URL(url.toString())).openConnection();
            } else {
                connection = (HttpsURLConnection)(new URL(url.toString())).openConnection();
                SSLContext e = SSLContext.getInstance("TLS");
                e.init(new KeyManager[0], this.xtmArray, new SecureRandom());
                SSLSocketFactory socketFactory = e.getSocketFactory();
                ((HttpsURLConnection)connection).setSSLSocketFactory(socketFactory);
                ((HttpsURLConnection)connection).setHostnameVerifier(this.HOSTNAME_VERIFIER);
            }

            ((HttpURLConnection)connection).setReadTimeout(this.READ_TIMEOUT);
            ((HttpURLConnection)connection).setConnectTimeout(this.CONNECT_TIMEOUT);
            ((HttpURLConnection)connection).setRequestMethod("GET");
            ((HttpURLConnection)connection).setRequestProperty("ContentType", "application/json;charset=" + charset);
            byte[] e1 = super.inputStreamToByte(((HttpURLConnection)connection).getInputStream());
            socketFactory1 = e1 == null?null:new String(e1, this.RESPONSE_CHARSET);
        } catch (Exception var12) {
            var12.printStackTrace();
            throw new Exception(var12);
        } finally {
            if(connection != null) {
                ((HttpURLConnection)connection).disconnect();
            }

        }

        return socketFactory1;
    }
    public  String accessApiJson(String remoteURI, Map<String, String> params, Map<String, String> header, String charset) throws Exception{
        return accessApi(remoteURI,params,header,charset);
    }
    public String accessApi(String remoteURI, Map<String, String> params, Map<String, String> header, String charset) throws Exception {
        String paramString = super.parseMapParam(params, charset);
        StringBuilder url = new StringBuilder(remoteURI);
        if(paramString.length() > 0) {
            url.append("?");
            url.append(paramString);
        }

        Object connection = null;

        String entry2;
        try {
            if(!remoteURI.startsWith("https") && !remoteURI.startsWith("HTTPS")) {
                connection = (HttpURLConnection)(new URL(url.toString())).openConnection();
            } else {
                connection = (HttpsURLConnection)(new URL(url.toString())).openConnection();
                SSLContext e = SSLContext.getInstance("TLS");
                e.init(new KeyManager[0], this.xtmArray, new SecureRandom());
                SSLSocketFactory entry = e.getSocketFactory();
                ((HttpsURLConnection)connection).setSSLSocketFactory(entry);
                ((HttpsURLConnection)connection).setHostnameVerifier(this.HOSTNAME_VERIFIER);
            }

            ((HttpURLConnection)connection).setReadTimeout(this.READ_TIMEOUT);
            ((HttpURLConnection)connection).setConnectTimeout(this.CONNECT_TIMEOUT);
            ((HttpURLConnection)connection).setRequestMethod("GET");
            ((HttpURLConnection)connection).setRequestProperty("ContentType", "application/json;charset=" + charset);
            if(header != null) {
                Iterator e1 = params.entrySet().iterator();

                while(e1.hasNext()) {
                    Entry entry1 = (Entry)e1.next();
                    ((HttpURLConnection)connection).setRequestProperty((String)entry1.getKey(), (String)entry1.getValue());
                }
            }

            byte[] e2 = super.inputStreamToByte(((HttpURLConnection)connection).getInputStream());
            entry2 = e2 == null?null:new String(e2, this.RESPONSE_CHARSET);
        } catch (Exception var13) {
            var13.printStackTrace();
            throw new Exception(var13);
        } finally {
            if(connection != null) {
                ((HttpURLConnection)connection).disconnect();
            }

        }

        return entry2;
    }

    public String accessApi(String remoteURI, String params, String charset) throws Exception {
        StringBuilder url = new StringBuilder(remoteURI);
        if(params != null) {
            url.append("?");
            url.append(params);
        }

        Object connection = null;

        String socketFactory1;
        try {
            if(!remoteURI.startsWith("https") && !remoteURI.startsWith("HTTPS")) {
                connection = (HttpURLConnection)(new URL(url.toString())).openConnection();
            } else {
                connection = (HttpsURLConnection)(new URL(url.toString())).openConnection();
                SSLContext e = SSLContext.getInstance("TLS");
                e.init(new KeyManager[0], this.xtmArray, new SecureRandom());
                SSLSocketFactory socketFactory = e.getSocketFactory();
                ((HttpsURLConnection)connection).setSSLSocketFactory(socketFactory);
                ((HttpsURLConnection)connection).setHostnameVerifier(this.HOSTNAME_VERIFIER);
            }

            ((HttpURLConnection)connection).setReadTimeout(this.READ_TIMEOUT);
            ((HttpURLConnection)connection).setConnectTimeout(this.CONNECT_TIMEOUT);
            ((HttpURLConnection)connection).setRequestMethod("GET");
            ((HttpURLConnection)connection).setRequestProperty("ContentType", "application/json;charset=" + charset);
            byte[] e1 = super.inputStreamToByte(((HttpURLConnection)connection).getInputStream());
            socketFactory1 = e1 == null?null:new String(e1, this.RESPONSE_CHARSET);
        } catch (Exception var11) {
            var11.printStackTrace();
            throw new Exception(var11);
        } finally {
            if(connection != null) {
                ((HttpURLConnection)connection).disconnect();
            }

        }

        return socketFactory1;
    }

    public String accessApi(String remoteURI, String params, Map<String, String> header, String charset) throws Exception {
        StringBuilder url = new StringBuilder(remoteURI);
        if(params != null) {
            url.append("?");
            url.append(params);
        }

        Object connection = null;

        String entry2;
        try {
            if(!remoteURI.startsWith("https") && !remoteURI.startsWith("HTTPS")) {
                connection = (HttpURLConnection)(new URL(url.toString())).openConnection();
            } else {
                connection = (HttpsURLConnection)(new URL(url.toString())).openConnection();
                SSLContext e = SSLContext.getInstance("TLS");
                e.init(new KeyManager[0], this.xtmArray, new SecureRandom());
                SSLSocketFactory entry = e.getSocketFactory();
                ((HttpsURLConnection)connection).setSSLSocketFactory(entry);
                ((HttpsURLConnection)connection).setHostnameVerifier(this.HOSTNAME_VERIFIER);
            }

            ((HttpURLConnection)connection).setReadTimeout(this.READ_TIMEOUT);
            ((HttpURLConnection)connection).setConnectTimeout(this.CONNECT_TIMEOUT);
            ((HttpURLConnection)connection).setRequestMethod("GET");
            ((HttpURLConnection)connection).setRequestProperty("ContentType", "application/json;charset=" + charset);
            if(header != null) {
                Iterator e1 = header.entrySet().iterator();

                while(e1.hasNext()) {
                    Entry entry1 = (Entry)e1.next();
                    ((HttpURLConnection)connection).setRequestProperty((String)entry1.getKey(), (String)entry1.getValue());
                }
            }

            byte[] e2 = super.inputStreamToByte(((HttpURLConnection)connection).getInputStream());
            entry2 = e2 == null?null:new String(e2, this.RESPONSE_CHARSET);
        } catch (Exception var12) {
            var12.printStackTrace();
            throw new Exception(var12);
        } finally {
            if(connection != null) {
                ((HttpURLConnection)connection).disconnect();
            }

        }

        return entry2;
    }
}